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
    public void givenLastName_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validation = userRegistration.validateLastName("Kotha");
        Assert.assertTrue(validation);
    }

    @Test
    public void givenPhoneNumber_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validation = userRegistration.validatePhoneNumber("91 9591266655");
        Assert.assertTrue(validation);
    }

}
