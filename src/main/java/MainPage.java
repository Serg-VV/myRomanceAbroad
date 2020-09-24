import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MainPage extends BaseActions {

    public MainPage(WebDriver driver, WebDriverWait wait){

        super(driver, wait);
    }

    public void clickJoinButton(){

        driver.findElement(Locators.BUTTON_REGISTRATION).click();
    }

    public void insertFirstPartOfRegistrationInformation(){

        WebElement registrationEmail = driver.findElement(Locators.INSERT_REGISTRATION_EMAIL);
        registrationEmail.sendKeys(Data.Email);
        WebElement registrationPassword = driver.findElement(Locators.INSERT_REGISTRATION_PASSWORD);
        registrationPassword.sendKeys(Data.Password);
        driver.findElement(Locators.BUTTON_NEXT).click();
    }

    public void insertSecondPartOfRegistrationInformation(){

        driver.findElement(Locators.INSERT_USERNAME).sendKeys(generateNewNumber(Data.Nickname,4));

        driver.findElement(Locators.INSERT_DOB_DATE).click();
        driver.findElement(Locators.PICK_DOB_DATE).click();

        driver.findElement(Locators.INSERT_DOB_MONTH).click();
        driver.findElement(Locators.PICK_DOB_MONTH).click();

        driver.findElement(Locators.INSERT_DOB_YEAR).click();
        driver.findElement(Locators.PICK_DOB_YEAR).click();

        driver.findElement(Locators.INSERT_PHONE).sendKeys(Data.Phone);

        driver.findElement(Locators.INSERT_LOCATION).clear();
        driver.findElement(Locators.INSERT_LOCATION).sendKeys(Data.Location);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.PICK_LOCATION));
        driver.findElement(Locators.PICK_LOCATION).click();

        WebElement checkBoxConfirmation = driver.findElement(Locators.CLICK_CHECK_BOX);
        boolean selectedCheckBox = checkBoxConfirmation.isSelected();
        System.out.println(selectedCheckBox + Data.CheckBoxConfirmation);
        checkBoxConfirmation.click();
    }
    public void openStorePage(){
        driver.findElement(Locators.LINK_STORE).click();
        currentUrlStore = driver.getCurrentUrl();
        System.out.println(currentUrlStore);
        Assert.assertEquals(currentUrlStore, Data.expectedUrlStore);
    }

    public void openMediaPage(){

        driver.findElement(Locators.LINK_MEDIA).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlMedia);
    }

    public void startYouTubeVideo(){
        WebElement element = driver.findElement(Locators.YOUTUBE_LINK);
        driver.switchTo().frame(element);
        driver.findElement(Locators.YOUTUBE_PLAY).click();
        driver.findElement(Locators.YOUTUBE_FULLSCREEN).click();
    }
}
