package com.ValidationTask;

import java.util.HashMap;
import java.util.Map;

public class ValidationSystemFactory {
    private static final Map<Class, Validator> CLASS_VALIDATOR_HASH_MAP = new HashMap<>();

    static {
        CLASS_VALIDATOR_HASH_MAP.put(String.class, new StringValidator());
        CLASS_VALIDATOR_HASH_MAP.put(Integer.class, new IntegerValidator());
        CLASS_VALIDATOR_HASH_MAP.put(Boolean.class, new BooleanValidator());
        CLASS_VALIDATOR_HASH_MAP.put(Character.class, new CharacterValidator());
    }

    public Validator createValidatorByType(Object o) {

        if (CLASS_VALIDATOR_HASH_MAP.containsKey(o.getClass())) {
            return CLASS_VALIDATOR_HASH_MAP.get(o.getClass());
        } else {
            throw new ValidationFailedException();
        }
    }

}
