package com.ValidationTask;

public class IntegerValidatorFactory implements ValidationSystemFactory{
    @Override
    public ValidationSystem createValidationSystem() {
        return new IntegerValidator();
    }
}
