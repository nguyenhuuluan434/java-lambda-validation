package com.lsa.lambda_validations;

import com.lsa.lambda_validations.validator.Person;
import com.lsa.lambda_validations.validator.PersonValidator;
import com.lsa.lambda_validations.validator.PersonValidatorImpl;
import org.junit.jupiter.api.Test;

public class AbstractTestValidation {
    protected PersonValidator getValidatorInstance = new PersonValidatorImpl();
    @Test
    public void person_withoutFirstName_validationFail() {
        try {
            getValidatorInstance.validate(
                    new Person(null, "clinton", "bill@gmail.com", 60)
            );
            //fail();
        } catch (IllegalArgumentException e) {
            //assertTrue(e.getMessage().contains("firstname"));
        }
    }
}
