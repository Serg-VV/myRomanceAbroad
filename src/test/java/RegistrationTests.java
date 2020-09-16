import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegistrationTests extends BaseUI{

    @Test
    public void testRegistration(){

        WebElement registrationEmail = driver.findElement(Locators.INSERT_REGISTRATION_EMAIL);
        WebElement registrationPassword = driver.findElement(Locators.INSERT_REGISTRATION_PASSWORD);
        driver.findElement(Locators.BUTTON_REGISTRATION).click();
        registrationEmail.sendKeys(Data.Email);
        registrationPassword.sendKeys(Data.Password);
        driver.findElement(Locators.BUTTON_NEXT).click();
        driver.findElement(Locators.INSERT_NICKNAME).sendKeys(Data.Nickname);
        driver.findElement(Locators.INSERT_PHONE).sendKeys(Data.Phone);



    }



}
