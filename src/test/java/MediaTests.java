import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class MediaTests extends BaseUI{

    String currentUrl;

    @Test
    public void testPhotosPage(){

        driver.findElement(Locators.LINK_MEDIA).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlMedia);
    }

    String currentUrlMedia;

    @Test
    public void testPhotosDropDownList(){

        driver.findElement(Locators.LINK_MEDIA).click();
        currentUrlMedia = driver.getCurrentUrl();
        System.out.println(currentUrlMedia);
        Assert.assertEquals(currentUrlMedia, Data.expectedUrlMedia);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.MEDIA_DDL_SORT_BY));
        WebElement dropDownListSortBy = driver.findElement(Locators.MEDIA_DDL_SORT_BY);
        getDropDownListByValue(dropDownListSortBy,Data.mediaSortBy);


    }

    @Test
    public void testPhotosSvetlanka44Implicit(){

        driver.findElement(Locators.LINK_MEDIA).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(Locators.PHOTOS_SVETLANKA_44).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlMedia);

    }

    @Test
    public void testPhotosSvetlanka44Explicid(){

        driver.findElement(Locators.LINK_MEDIA).click();
        wait.until(ExpectedConditions.elementToBeClickable(Locators.PHOTOS_SVETLANKA_44));
        driver.findElement(Locators.PHOTOS_SVETLANKA_44).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlMedia);

    }
}
