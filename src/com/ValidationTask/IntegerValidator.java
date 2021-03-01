package com.ValidationTask;

public class IntegerValidator<T> implements Validator<T> {
    @Override
    public boolean validate(T t) {
        return ((Integer) t >= 1 && (Integer) t <= 10);
    }
}
