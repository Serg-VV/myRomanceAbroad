import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends BaseUI{

    String currentUrlSearch;

    @Test
    public void testSearchSortBy(){

        driver.findElement(Locators.LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.SEARCH_DDL_SORT_BY));
        WebElement dropDownListSortBy = driver.findElement(Locators.SEARCH_DDL_SORT_BY);
        getDropDownListByText(dropDownListSortBy,Data.selectSortBy);

    }

    @Test
    public void testSearchAge(){


        driver.findElement(Locators.LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.DDL_AGE_MIN));
        WebElement dropDownListAgeMin = driver.findElement(Locators.DDL_AGE_MIN);
        getDropDownListByValue(dropDownListAgeMin,Data.minAge);
        WebElement dropDownListAgeMax = driver.findElement(Locators.DDL_AGE_MAX);
        getDropDownListByValue(dropDownListAgeMax,Data.maxAge);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.SEARCH_BUTTON_SEARCH));
        driver.findElement(Locators.SEARCH_BUTTON_SEARCH).click();

    }

}



