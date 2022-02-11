package com.kldmohammed.articly.common.util

import com.kldmohammed.articly.common.exceptions.NetWorkError
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

suspend fun <R> Call<R>.asUiState(): UiState<R> {
	return suspendCoroutine { cont ->
		enqueue(object : Callback<R> {
			override fun onFailure(call: Call<R>, t: Throwable) {
				cont.resume(UiState.Error(t))
			}
			
			override fun onResponse(call: Call<R>, response: Response<R>) {
				if (response.isSuccessful) {
					cont.resume(UiState.Success(response.body()!!))
				} else {
					cont.resume(
						UiState.Error(
							NetWorkError(
								code = response.code(),
								errorMessage = response.message()
							)
						)
					)
				}
			}
			
		})
	}
}