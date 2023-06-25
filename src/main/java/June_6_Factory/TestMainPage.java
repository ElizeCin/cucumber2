package June_6_Factory;

import config.BaseClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMainPage extends BaseClass {
    private static MainPageObject mainPage;
    @BeforeClass
    public static void beforetest() {
        driver.get("https://ithillel.ua/");
        mainPage = new MainPageObject(driver);
    }

    @Test
    public void test1() {
        System.out.println(mainPage.getConsultationButton());
    }
}
