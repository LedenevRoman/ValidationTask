package com.ValidationTask;

public interface Validator<T> {
    boolean validate(T t);
}
