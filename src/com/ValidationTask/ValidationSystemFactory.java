package com.ValidationTask;

public class ValidationSystemFactory {

    public Validator createValidationSystemFactoryByType(Object o) {
        if (o instanceof String) {
            return new StringValidator();
        }
        if (o instanceof Integer) {
            return new IntegerValidator();
        }
        if (o instanceof Boolean) {
            return new BooleanValidator();
        }
        if (o instanceof Character) {
            return new CharacterValidator();
        } else {
            throw new ValidationFailedException();
        }
    }

}
