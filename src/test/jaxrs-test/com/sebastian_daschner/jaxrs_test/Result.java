package com.sebastian_daschner.jaxrs_test;

public class Result<T> {
    private T data;

    public T getData() {
        return this.data;
    }

    public Result(T data) {
        this.data = data;
    }
}
