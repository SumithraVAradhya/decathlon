package com.decathlon.test;


import com.decathlon.main.SignIn;

import com.decathlon.utlities.BrowserSetup;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static WebDriver driver;

    public String Login(Properties Prop) throws AWTException, IOException {


        // Creating chrome browser instance and launching it
        driver = BrowserSetup.getDriver(Prop.getProperty("Browser"));
        driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
        //Initialising to search the Flights
        driver.get(Prop.getProperty("Decathlon_URL"));
        driver.manage().window().maximize();


        SignIn login = new SignIn(driver);
        String messageForLogin= login.getMessage();
        login.apply();


        driver.close();
        return messageForLogin ;
    }
}
