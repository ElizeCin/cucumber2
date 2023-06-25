package step;
import June_6_Factory.ConsultationFormPAge;
import June_6_Factory.MainPageFactory;
import config.BaseClass;
import enums.MESSENGER;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ConsultStep extends BaseClass {
    static final String mainUrl = "https://dnipro.ithillel.ua/";
    MainPageFactory mainPageFactory = PageFactory.initElements(driver, MainPageFactory.class);
    ConsultationFormPAge consultationFormPage = PageFactory.initElements(driver, ConsultationFormPAge.class);

    @Before("@CCC")
    public void start() {
        if(!driver.getCurrentUrl().equals(mainUrl)){
            driver.navigate().to(mainUrl);
        }
    }

    @When("I click consultation button")
    public void iClickConsultationButton() {
        mainPageFactory.consultButton().click();
    }

    @And("fill in the form")
    public void fillInTheForm(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
        int line = 1;
        List<String> list = data.get(line);
        consultationFormPage.fillInForm(list.get(0), list.get(1), list.get(3), MESSENGER.TELEGRAM, list.get(5));
    }

    @Then("Check confirm button")
    public void checkConfirmButton() {
        Assert.assertFalse(consultationFormPage.isConsultClickable());
    }
}
