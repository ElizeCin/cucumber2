package June_6_Factory;

import enums.MESSENGER;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConsultationFormPAge {
    @FindBy(id = "input-name-consultation")
    WebElement name;
    @FindBy(id = "input-email-consultation")
    WebElement email;
    @FindBy(id = "input-tel-consultation")
    WebElement telephone;
    @FindBy(xpath = "//button[@data-name=\"vb\"]")
    WebElement viber;
    @FindBy(xpath = "//button[@data-name=\"tg\"]")
    WebElement telegram;
    @FindBy(id = "listbox-btn-input-course-consultation")
    WebElement select;
    @FindBy(xpath = "//input[@class=\"listbox_search-input\"]")
    WebElement search;
    @FindBy(xpath = "//*[@id=\"form-consultation\"]/div[1]/footer/div[2]/button")
    WebElement button;

    public void fillInForm (String name, String email, String telephone, MESSENGER messenger, String search) {
        this.name.sendKeys(name);
        this.email.sendKeys(email);
        this.telephone.sendKeys(telephone);
        switch(messenger) {
            case VIBER -> viber.click();
            case TELEGRAM -> telegram.click();
        }

        this.select.click();
        this.search.sendKeys(search);
        this.search.sendKeys(Keys.DOWN);
        this.search.sendKeys(Keys.ENTER);
        this.select.click();

    }
    public boolean isConsultClickable() {
        return button.isEnabled();
    }
}
