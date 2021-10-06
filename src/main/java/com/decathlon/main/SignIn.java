package com.decathlon.main;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignIn extends PageIntilization {
    public static WebDriver driver;

    public SignIn(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }


    // Applying the pincode with the default pincode
    @FindBy(xpath = "(//button[@type='button'])[3]")
    WebElement applyPinCode;

     @FindBy(xpath ="(//p[@class='mb-4'])[2]")
     WebElement message;



    public void apply(){
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", applyPinCode );
    }
    public String getMessage()
    {
        return message.getText();
    }
}




