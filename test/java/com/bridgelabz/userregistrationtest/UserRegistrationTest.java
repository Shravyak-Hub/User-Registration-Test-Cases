package com.bridgelabz.userregistrationtest;

import com.bridgelabz.userregistration.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void giveFirstName_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean validation = userRegistration.validateFirstName("Shravya");
        Assert.assertTrue(validation);
    }

}
