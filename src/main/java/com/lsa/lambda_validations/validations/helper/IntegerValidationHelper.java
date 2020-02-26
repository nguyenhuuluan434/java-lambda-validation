package com.lsa.lambda_validations.validations.helper;

import com.lsa.lambda_validations.validations.SimpleValidation;
import com.lsa.lambda_validations.validations.Validation;

public class IntegerValidationHelper {

    public static Validation<Integer> lowerThan(int max) {
        return SimpleValidation.from((i -> i < max), String.format("must be lower than %s", max));
    }

    public static Validation<Integer> greaterThan(int min){
        return SimpleValidation.from((i) -> i > min, String.format("must be greater than %s.", min));
    }

    public static Validation<Integer> intBetween(int min, int max){
        return greaterThan(min).and(lowerThan(max));
    }
}
