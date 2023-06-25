package June_6_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPageObject {
    private WebDriver driver;
    private By consultationButton = By.id("btn-consultation-hero");
    private By formConsultation = By.id("form-consultation");
    private By contactsButton = By.xpath("//*[@id=\"body\"]/div[1]/div[1]/div[2]/div/div/nav/ul/li[5]/a");
    private By skolaButton = By.xpath("//*[@id=\"body\"]/div[1]/div[1]/div[2]/div/div/nav/ul/li[1]/button");


    public MainPageObject(WebDriver driver) {
        this.driver = driver;
    }

        public WebElement getConsultationButton() {
        return driver.findElement(consultationButton);
    }
    public boolean isEnabledFormConsultation() {
        return driver.findElement(formConsultation).isEnabled();
    }

    public WebElement getContactsButton() {
        return driver.findElement(contactsButton);
    }

    public WebElement getSkolaButton() {
        return driver.findElement(skolaButton);
    }
}
