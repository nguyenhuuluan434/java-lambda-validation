package com.lsa.lambda_validations.validations.helper;

import com.lsa.lambda_validations.validations.SimpleValidation;
import com.lsa.lambda_validations.validations.Validation;

public class StringValidationHelpers {

    public static Validation<String> notNull = SimpleValidation.from((s) -> s != null, "must not be null.");

    public static Validation<String> moreThan(int size) {
        return SimpleValidation.from((s) -> s.length() >= size, String.format("must have more than %s chars.", size));
    }

    public static Validation<String> lessThan(int size) {
        return SimpleValidation.from((s) -> s.length() <= size, String.format("must have less than %s chars.", size));
    }

    public static Validation<String> between(int minSize, int maxSize) {
        return moreThan(minSize).and(lessThan(maxSize));
    }

    public static Validation<String> contains(String c) {
        return SimpleValidation.from((s) -> s.contains(c), String.format("must contain %s", c));
    }
}
