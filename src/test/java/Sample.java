import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sample extends BaseUI{

    @Test
    public void testString(){
        String fruit1 = "kiwi";
        String fruit2 = "apple";

        if(fruit1.contains("kiwi") || fruit2.contains("apple")){
            System.out.println("i got a fruits");
        }
        else {
            Assert.fail("--------NO FRUITS-----------");
        }
    }

    @Test
    public void testInt(){
        int number1 = 10;
        int number2 = 10;
        int sum;

        if(number1== 10){
            sum = 10 + 5;
        }
        else {
            sum = 100 - 95;
        }
        System.out.println(sum);
    }

    @Test
    public void testBoolean(){
        boolean requirement = false;

        if(!requirement){
            System.out.println("Boolean is true");
        }
        else {
            Assert.fail("Boolean is false");
        }
    }

    /*@Test
    public void testWebElement(){
        WebElement tabSearch = driver.findElement(Locators.LINK_STORE);

        if (tabSearch.getText().contains("GIFTS")){
            tabSearch.click();
        }
        else {
            Assert.fail("We can't find Store-page");
        }
    }*/

    /*@Test
    public void testCheckBox(){
        mainPage.clickJoinButton();
        mainPage.insertFirstPartOfRegistrationInformation();

        WebElement checkBox = driver.findElement(Locators.CLICK_CHECK_BOX);

        if(!checkBox.isSelected()){
            checkBox.click();
            System.out.println("Checkbox is selected");
        }
    }*/

    @Test
    public void testCheckArrayListString() {
        List<String> testList = new ArrayList<>(Arrays.asList("kiwi", "orange", "melon"));
        String element = testList.get(2);
        if (testList.contains("orange")) {
            System.out.println(testList);
        }
    }

    @Test
    public void testCheckArrayListInt() {
        List<Integer> testListInt = new ArrayList<>(Arrays.asList(5,7,9));
        int sum = testListInt.get(1)+testListInt.get(2);
        System.out.println(sum);
    }

    @Test
    public void testListOfElements(){
        List<WebElement> Links = driver.findElements(By.xpath("//ul[@class='navbar-nav']/li"));
        System.out.println(Links.size());
        for (int i = 0; i <Links.size(); i++) {
            String info = Links.get(i).getText();
            System.out.println(info);
            Links.get(i).click();
            driver.get(Data.mainUrl);
            Links = driver.findElements(By.xpath("//ul[@class='navbar-nav']/li"));
        }
    }
}
