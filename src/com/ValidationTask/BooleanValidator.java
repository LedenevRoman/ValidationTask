package com.ValidationTask;

public class BooleanValidator<T> implements Validator<T> {
    @Override
    public boolean validate(T t) {
        return (boolean) t;
    }
}
