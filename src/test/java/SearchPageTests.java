import org.testng.annotations.Test;

public class SearchPageTests extends BaseUI{


    @Test
    public void testSearchSortBy(){
        searchPage.testSortBy();
    }
    @Test
    public void testSearchAge(){
        searchPage.testSortByAge();

    }
}



