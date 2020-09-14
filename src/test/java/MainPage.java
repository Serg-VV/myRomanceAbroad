import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class MainPage {
    String mainUrl = "https://romanceabroad.com/";
    WebDriver driver;
    String currentUrlSearch;
    String currentUrlMedia;
    String currentUrlAdvertising;
    String expectedUrlSearch = "https://romanceabroad.com/users/search";
    String expectedUrlMedia = "https://romanceabroad.com/media/index";
    String expectedUrlAdvertising = "https://romanceabroad.com/content/view/advertising";
    String registrationEmailValue = "atata@gmail.com";
    String registrationPasswordValue = "1234567890";
    By LINK_SEARCH = By.xpath("//*[@href='https://romanceabroad.com/users/search']");
    By LINK_HOW_WE_WORK = By.cssSelector("a[href='https://romanceabroad.com/content/view/how-it-works']");
    By LINK_MEDIA = By.cssSelector("a[href='https://romanceabroad.com/media/index']");
    By LINK_SIGN_IN = By.xpath("//a[@href='https://romanceabroad.com/users/login_form'][text()='SIGN IN']");
    By LINK_BOOK_NOW = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");
    By LINK_SWEETS = By.cssSelector("a[href='https://romanceabroad.com/store/category-sweets']");
    By LINK_BLOG = By.cssSelector("a[href='https://romanceabroad.com/content/view/blog']");
    By BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
    By INSERT_REGISTRATION_EMAIL = By.cssSelector("input#email");
    By INSERT_REGISTRATION_PASSWORD = By.cssSelector("input#password");
    By BUTTON_CALL_US = By.xpath("//a[@href='callto:18885997816']");
    By BUTTON_EMAIL_US = By.xpath("//a[@href='mailto:support@romanceabroad.com']");
    By BUTTON_ADVERTISING = By.cssSelector("a[href='https://romanceabroad.com/content/view/advertising']");
    By PROFILE_TANYA = By.cssSelector("a[class='g-users-gallery__name'][href='https://romanceabroad.com/users/view/360/profile']");
    By PHOTOS_SVETLANKA_44 = By.cssSelector("a[title='svetlanka, 44']");
    By GIFTS_FLOWER_BASKET = By.xpath("//div[@class='text-overflow'][contains(text(),'Flower basket')]");
    By BLOGS_KHARKOV = By.cssSelector("a[href='/content/view/kharkov-dating-agency']");
    int indexLinkSignIn = 0;
    int indexLinkBookNow = 0;

    @BeforeMethod
    public void setUp(){

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(mainUrl);
    }

    @Test
    public void testSearchPage(){

        driver.findElement(LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, expectedUrlSearch);
    }

    @Test
    public void testPhotosPage(){

        driver.findElement(LINK_MEDIA).click();
        currentUrlMedia = driver.getCurrentUrl();
        System.out.println(currentUrlMedia);
        Assert.assertEquals(currentUrlMedia, expectedUrlMedia);
    }

    @Test
    public void testSignInPage(){

        driver.findElements(LINK_SIGN_IN).get(indexLinkSignIn).click();

    }

    @Test
    public void testBookNowPage(){

        driver.findElements(LINK_BOOK_NOW).get(indexLinkBookNow).click();

    }

    @Test
    public void testRegistration(){

        WebElement registrationEmail = driver.findElement(INSERT_REGISTRATION_EMAIL);
        WebElement registrationPassword = driver.findElement(INSERT_REGISTRATION_PASSWORD);
        driver.findElement(BUTTON_REGISTRATION).click();
        registrationEmail.sendKeys(registrationEmailValue);
        registrationPassword.sendKeys(registrationPasswordValue);
        // driver.findElement(By.xpath("//button[@data-action='next-page'][text()='Next']")).click();
    }

    @Test
    public void testCallUsButton(){
        driver.findElement(BUTTON_CALL_US).click();
    }

    @Test
    public void testEmailUsButton(){
        driver.findElement(BUTTON_EMAIL_US).click();
    }

    @Test
    public void testHowWeWork(){

        driver.findElement(LINK_HOW_WE_WORK).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(BUTTON_ADVERTISING).click();
        currentUrlAdvertising = driver.getCurrentUrl();
        System.out.println(currentUrlAdvertising);
        Assert.assertEquals(currentUrlAdvertising, expectedUrlAdvertising);

    }

    @Test
    public void testProfilePageTanya(){

        driver.findElement(LINK_SEARCH).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(PROFILE_TANYA).click();

    }

    @Test
    public void testPhotosSvetlanka44(){

        driver.findElement(LINK_MEDIA).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(PHOTOS_SVETLANKA_44).click();

    }

    @Test
    public void testSweetsFlowerBasket(){

        driver.findElement(LINK_SWEETS).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(GIFTS_FLOWER_BASKET).click();

    }

    @Test
    public void testBlogKharkov(){

        driver.findElement(LINK_BLOG).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(BLOGS_KHARKOV).click();

    }



    @AfterMethod
    public void closeAction(){
        // driver.quit();
    }
}
