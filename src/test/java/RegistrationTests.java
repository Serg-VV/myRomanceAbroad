import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseUI{

    @Test
    public void testRegistration() {

        WebElement registrationEmail = driver.findElement(Locators.INSERT_REGISTRATION_EMAIL);
        WebElement registrationPassword = driver.findElement(Locators.INSERT_REGISTRATION_PASSWORD);
        driver.findElement(Locators.BUTTON_REGISTRATION).click();
        registrationEmail.sendKeys(Data.Email);
        registrationPassword.sendKeys(Data.Password);
        driver.findElement(Locators.BUTTON_NEXT).click();
        driver.findElement(Locators.INSERT_USERNAME).sendKeys(Data.Nickname);

        driver.findElement(Locators.INSERT_DOB_DATE).click();
        driver.findElement(Locators.PICK_DOB_DATE).click();

        driver.findElement(Locators.INSERT_DOB_MONTH).click();
        driver.findElement(Locators.PICK_DOB_MONTH).click();

        driver.findElement(Locators.INSERT_DOB_YEAR).click();
        driver.findElement(Locators.PICK_DOB_YEAR).click();

        driver.findElement(Locators.INSERT_PHONE).sendKeys(Data.Phone);

        driver.findElement(Locators.INSERT_LOCATION).clear();
        driver.findElement(Locators.INSERT_LOCATION).sendKeys(Data.Location);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(Locators.PICK_LOCATION).click();

        WebElement checkBoxConfirmation = driver.findElement(Locators.CLICK_CHECK_BOX);
        boolean selectedCheckBox = checkBoxConfirmation.isSelected();
        System.out.println(selectedCheckBox + "_myElement");
        checkBoxConfirmation.click();
    }

}
