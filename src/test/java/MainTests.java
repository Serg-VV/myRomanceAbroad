import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MainTests extends BaseUI{

    @Test
    public void testMainPage(){
        WebElement element = driver.findElement(Locators.YOUTUBE_LINK);
        driver.switchTo().frame(element);
        driver.findElement(Locators.YOUTUBE_PLAY).click();
        driver.findElement(Locators.YOUTUBE_FULLSCREEN).click();

    }


}


