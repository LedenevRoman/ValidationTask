package com.ValidationTask;

public class Main {
    public static void main(String[] args) {
        char x = 'A';
        ValidationSystemFactory validationSystemFactory = new ValidationSystemFactory();
        Validator validator = validationSystemFactory.createValidationSystemFactoryByType(x);

        System.out.println(validator.validate(x));
    }
}