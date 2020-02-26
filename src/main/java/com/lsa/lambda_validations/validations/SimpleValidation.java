package com.lsa.lambda_validations.validations;

import java.util.function.Predicate;

public class SimpleValidation<K> implements Validation<K> {
    private Predicate<K> predicate;

    private String errorMessage;

    public static <K> SimpleValidation<K> from(Predicate<K> predicate, String errorMessage) {
        return new SimpleValidation<>(predicate, errorMessage);
    }

    private SimpleValidation(Predicate<K> predicate, String errorMessage) {
        this.errorMessage = errorMessage;
        this.predicate = predicate;
    }

    @Override
    public ValidationResult test(K param) {
        return predicate.test(param) ? ValidationResult.ok() : ValidationResult.fail(errorMessage);
    }
}
