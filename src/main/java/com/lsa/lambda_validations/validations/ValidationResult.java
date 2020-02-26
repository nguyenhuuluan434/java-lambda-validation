package com.lsa.lambda_validations.validations;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ValidationResult {
    private boolean valid;
    private String message;

    public static ValidationResult ok() {
        return new ValidationResult(true, null);
    }

    public static ValidationResult fail(String message) {
        return new ValidationResult(false, message);
    }

    public void throwIfInvalid() {
        if (!isValid()) throw new IllegalArgumentException(getMessage());
    }

    public void throwIfInvalid(String fieldName) {
        if (!isValid()) throw new IllegalArgumentException(fieldName + " : " + getMessage());
    }

}
