package com.ValidationTask;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringValidator<T> implements ValidationSystem<T>{
    @Override
    public boolean validate(T t) {
            Pattern pattern = Pattern.compile("^[A-Z]+");
            Matcher matcher = pattern.matcher((String) t);
            return matcher.find();
    }
}
