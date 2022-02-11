package com.kldmohammed.articly.common.util

sealed class UiState<T> {

    /**
     * represents happy cases when a result is required.
     * @param data data required by the observer.
     */
    class Success<T>(val data: T) : UiState<T>()

    /**
     * represents happy cases when a result is not required.
     */
    class Complete<T> : UiState<T>()

    /**
     * represents an ongoing task that takes time.
     */
    class Loading<T> : UiState<T>()

    /**
     * represents an ongoing task return empty value.
     */
    class Empty<T> : UiState<T>()

    /**
     * represents an error occurred while a said operation is ongoing.
     */
    class Error<T>(val throwable: Throwable) : UiState<T>()

    companion object {

    }

}

