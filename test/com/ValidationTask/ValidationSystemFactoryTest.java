package com.ValidationTask;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidationSystemFactoryTest {
    private ValidationSystemFactory validationSystemFactory;
    private static final String STRING_WITH_UPPERCASE_FIRST_LETTER = "Aloha";
    private static final String STRING_WITH_LOWERCASE_FIRST_LETTER = "alOha";
    private static final int ZERO = 0;
    private static final int FIVE = 5;
    private static final int ELEVEN = 11;
    private static final boolean TRUE = true;
    private static final boolean FALSE = false;
    private static final char UPPERCASE_CHAR = 'A';
    private static final char LOWERCASE_CHAR = 'a';
    private static final char NOT_LETTER = '?';
    private static final double DOUBLE_TYPE_NUMBER = 3.14;

    @Before
    public void setUp() {
        validationSystemFactory = new ValidationSystemFactory();
    }

    @After
    public void tearDown() {
        validationSystemFactory = null;
    }

    @Test
    public void validateStringWithUpperCaseFirstLetter() {
        boolean actual = validationSystemFactory.createValidatorByType(STRING_WITH_UPPERCASE_FIRST_LETTER)
                .validate(STRING_WITH_UPPERCASE_FIRST_LETTER);
        Assert.assertTrue(actual);
    }

    @Test
    public void validateStringWithLowerCaseFirstLetter() {
        boolean actual = validationSystemFactory.createValidatorByType(STRING_WITH_LOWERCASE_FIRST_LETTER)
                .validate(STRING_WITH_LOWERCASE_FIRST_LETTER);
        Assert.assertFalse(actual);
    }

    @Test
    public void validateIntZero() {
        boolean actual = validationSystemFactory.createValidatorByType(ZERO)
                .validate(ZERO);
        Assert.assertFalse(actual);
    }

    @Test
    public void validateIntFive() {
        boolean actual = validationSystemFactory.createValidatorByType(FIVE)
                .validate(FIVE);
        Assert.assertTrue(actual);
    }

    @Test
    public void validateIntEleven() {
        boolean actual = validationSystemFactory.createValidatorByType(ELEVEN)
                .validate(ELEVEN);
        Assert.assertFalse(actual);
    }

    @Test
    public void validateBooleanTrue() {
        boolean actual = validationSystemFactory.createValidatorByType(TRUE)
                .validate(TRUE);
        Assert.assertTrue(actual);
    }

    @Test
    public void validateBooleanFalse() {
        boolean actual = validationSystemFactory.createValidatorByType(FALSE)
                .validate(FALSE);
        Assert.assertFalse(actual);
    }

    @Test
    public void validateCharUpperCase() {
        boolean actual = validationSystemFactory.createValidatorByType(UPPERCASE_CHAR)
                .validate(UPPERCASE_CHAR);
        Assert.assertTrue(actual);
    }

    @Test
    public void validateCharLowerCase() {
        boolean actual = validationSystemFactory.createValidatorByType(LOWERCASE_CHAR)
                .validate(LOWERCASE_CHAR);
        Assert.assertFalse(actual);
    }

    @Test
    public void validateCharNotLetter() {
        boolean actual = validationSystemFactory.createValidatorByType(NOT_LETTER)
                .validate(NOT_LETTER);
        Assert.assertFalse(actual);
    }

    @Test (expected = ValidationFailedException.class)
    public void validateDoubleTypeNumber() {
        validationSystemFactory.createValidatorByType(DOUBLE_TYPE_NUMBER)
                .validate(DOUBLE_TYPE_NUMBER);
    }

}