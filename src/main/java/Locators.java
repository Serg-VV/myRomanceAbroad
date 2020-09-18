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
    public static final By INSERT_USERNAME = By.cssSelector("#nickname");
    public static final By INSERT_DOB_DATE = By.cssSelector("#daySelect");
    public static final By INSERT_DOB_MONTH = By.cssSelector("#monthSelect");
    public static final By INSERT_DOB_YEAR = By.cssSelector("#yearSelect");
    public static final By INSERT_PHONE = By.cssSelector("input[name='data[phone]']");
    public static final By INSERT_LOCATION = By.xpath("//input[@name='region_name']");
    public static final By PICK_LOCATION = By.xpath("//li[text()='Tampa, Florida, United States']");
    public static final By PICK_DOB_DATE = By.cssSelector("li[data-handler='selectDay'][data-value='5']");
    public static final By PICK_DOB_MONTH = By.cssSelector("li[data-handler='selectMonth'][data-value='4']");
    public static final By PICK_DOB_YEAR = By.cssSelector("li[data-handler='selectYear'][data-value='1995']");
    public static final By CLICK_CHECK_BOX = By.cssSelector("#confirmation");

    //Search Page
    public static final By LINK_SEARCH = By.xpath("//*[@href='https://romanceabroad.com/users/search']");
    public static final By DDL_SORT_BY = By.xpath("//div[@class='form-inline']//select");

    //Store Page
    public static final By LINK_STORE = By.cssSelector("a[href='https://romanceabroad.com/store/category-sweets']");
}
