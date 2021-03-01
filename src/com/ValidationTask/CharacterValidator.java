package com.ValidationTask;

public class CharacterValidator<T> implements Validator<T>{
    @Override
    public boolean validate(T t) {
        return Character.isUpperCase((char) t);
    }
}
