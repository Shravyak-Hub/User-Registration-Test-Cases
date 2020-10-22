package com.bridgelabz.userregistrationtest;

import com.bridgelabz.userregistration.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validation = userRegistration.validateFirstName("Shravya");
        Assert.assertTrue(validation);
    }

    @Test
    public void givenFirstName_WhenLessThanThreeLetters_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validation = userRegistration.validateFirstName("Shr");
        Assert.assertFalse(validation);
    }

    @Test
    public void givenFirstName_WhenFirstLetterNotUppercase_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validation = userRegistration.validateFirstName("shravya");
        Assert.assertFalse(validation);
    }

}
