package June_6_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

public class MainPageFactory {
    private Driver driver;

    @FindBy(xpath = "//*[@id=\"certificateCheckForm\"]/div/input")
    WebElement certificate;
    @FindBy(xpath = "//*[@id=\"certificateCheckForm\"]/div/button")
    WebElement button;

    @FindBy(id = "btn-consultation-hero")
    public WebElement consultButton;
    @FindBy(id = "form-consultation")
    WebElement formConsult;

    @FindBy(xpath =  "//li[@class=\"socials-list_item\"]")
    List<WebElement> socialsList;

    public boolean isEnabledFormConsultation() {
        return formConsult.isEnabled();
    }

    public List<String> getSocialsLinks() {
        List<String> stringList = new ArrayList<>();
        for (WebElement element : socialsList) {
            element.findElement(By.tagName("a")).getAttribute("href");
        }
        return stringList;
    }

    public WebElement consultButton() {
        return consultButton;
    }

}
