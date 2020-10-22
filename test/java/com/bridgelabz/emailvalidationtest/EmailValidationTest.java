package com.bridgelabz.emailvalidationtest;

import com.bridgelabz.userregistration.UserRegistration;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailValidationTest {

    private String emailToTest;
    private Boolean validation;

    public EmailValidationTest(String emailToTest, Boolean validation) {
        this.emailToTest = emailToTest;
        this.validation = validation;
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][] {
                {"abc@yahoo.com", true},
                {"abc-100@gmail.com", true},
                {"abc.100@gmail.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true},
                {"abc", false},
                {"abc@.com.my", false},
                {"abc123@gmail.a", false},
                {"abc123@.com", false},
                {"abc123@.com.com", false},
                {".abc@abc.com", false},
                {"abc()*@gmail.com", false},
                {"abc@%*.com", false},
                {"abc..2002@gmail.com", false},
                {"abc.@gmail.com", false},
                {"abc@abc@gmail.com", false},
                {"abc@gmail.com.1a", false},
                {"abc@gmail.com.aa.au", false} } );
    }

    @Test
    public void giveEmail_ValidateAsPerGivenParameters() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validation = userRegistration.validateEmail(emailToTest);
        Assert.assertEquals(this.validation, validation);
    }

}
