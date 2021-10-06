package com.decathlon.test;

import com.decathlon.utlities.readProperty;
import org.junit.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;
import java.util.Properties;

public class SignInTest extends BaseTest {

    @Test
    public void sign() throws IOException, AWTException {

        readProperty read_details = new readProperty();
        Properties Prop = read_details.fetch_property();
        String messageForLogin = Login(Prop);
//       Assert.assertTrue(messageForLogin.equals(Prop.getProperty("Message")));
    }
}

