import org.openqa.selenium.By;

public class Locators {

    // MediaPage
    public static final By LINK_MEDIA = By.cssSelector("a[href='https://romanceabroad.com/media/index']");
    public static final By PHOTOS_SVETLANKA_44 = By.cssSelector("a[title='svetlanka, 44']");

    // Registration
    public static final By BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
    public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final By INSERT_REGISTRATION_EMAIL = By.cssSelector("input#email");
    public static final By INSERT_REGISTRATION_PASSWORD = By.cssSelector("input#password");
    public static final By INSERT_NICKNAME = By.cssSelector("#nickname");
    public static final By INSERT_PHONE = By.cssSelector("input[name='data[phone]']");



    //Search Page
    public static final By LINK_SEARCH = By.xpath("//*[@href='https://romanceabroad.com/users/search']");
}
