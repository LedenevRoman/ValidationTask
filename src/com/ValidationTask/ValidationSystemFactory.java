package com.ValidationTask;

import java.util.HashMap;

public class ValidationSystemFactory {
    private final static HashMap<Class, Validator> CLASS_VALIDATOR_HASH_MAP = new HashMap<>();

    {
        CLASS_VALIDATOR_HASH_MAP.put(String.class, new StringValidator());
        CLASS_VALIDATOR_HASH_MAP.put(Integer.class, new IntegerValidator());
        CLASS_VALIDATOR_HASH_MAP.put(Boolean.class, new BooleanValidator());
        CLASS_VALIDATOR_HASH_MAP.put(Character.class, new CharacterValidator());
    }

    public Validator createValidatorByType(Object o) {

        if (o instanceof String || o instanceof Integer || o instanceof Boolean || o instanceof Character) {
            return CLASS_VALIDATOR_HASH_MAP.get(o.getClass());
        } else {
            throw new ValidationFailedException();
        }
    }

}
