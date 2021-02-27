package com.ValidationTask;

public class Main {
    public static void main(String[] args) {
        String x = "alOha";
        ValidationSystemFactory validationSystemFactory = createValidationSystemFactoryByType(x);
        ValidationSystem validationSystem = validationSystemFactory.createValidationSystem();

        System.out.println(validationSystem.validate(x));
    }

    public static ValidationSystemFactory createValidationSystemFactoryByType(Object o) {
        if (o instanceof String) {
            return new StringValidatorFactory();
        }
        if (o instanceof Integer) {
            return new IntegerValidatorFactory();
        } else {
            throw new ValidationFailedException();
        }
    }
}