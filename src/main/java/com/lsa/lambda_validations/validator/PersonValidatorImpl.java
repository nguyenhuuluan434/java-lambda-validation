package com.lsa.lambda_validations.validator;

import com.lsa.lambda_validations.validations.helper.IntegerValidationHelper;
import com.lsa.lambda_validations.validations.helper.StringValidationHelpers;

public class PersonValidatorImpl implements PersonValidator {
    @Override
    public void validate(Person person) {
        IntegerValidationHelper.intBetween(0, 150).test(person.getAge()).throwIfInvalid("age");
        StringValidationHelpers.notNull.and(StringValidationHelpers.between(2, 100)).test(person.getFirstName()).throwIfInvalid("firstname");
        StringValidationHelpers.notNull.and(StringValidationHelpers.between(2, 100)).test(person.getLastName()).throwIfInvalid("lastname");
        StringValidationHelpers.notNull.and(StringValidationHelpers.between(2, 100)).and(StringValidationHelpers.contains("@")).test(person.getLastName()).throwIfInvalid("email");
    }
}
