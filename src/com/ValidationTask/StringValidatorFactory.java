package com.ValidationTask;

public class StringValidatorFactory implements ValidationSystemFactory{

    @Override
    public ValidationSystem createValidationSystem() {
        return new StringValidator();
    }
}
