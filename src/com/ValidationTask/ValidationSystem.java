package com.ValidationTask;

public interface ValidationSystem<T> {
    default boolean validate(T t) {
        return false;
    }
}
