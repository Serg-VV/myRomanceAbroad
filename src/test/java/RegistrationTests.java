import org.testng.annotations.Test;

public class RegistrationTests extends BaseUI{

    @Test
    public void testRegistration() {

        mainPage.clickJoinButton();
        mainPage.insertFirstPartOfRegistrationInformation();
        mainPage.insertSecondPartOfRegistrationInformation();

    }

}
