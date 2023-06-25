package step;
import Certificate.CertificatePage;
import config.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyStepsCertificate extends BaseClass {
    private final CertificatePage certificatePage;

    {
        certificatePage = new CertificatePage(driver);
    }

    @When("I open page {string}")
    public void iOpenPage(String arg0) {
        driver.get(arg0);
    }

    @And("send certificate number {string}")
    public void sendCertificate(String certificateNumber) {
        certificatePage.sendCertificate(certificateNumber);
    }

    @And("click check button")
    public void clickButton() {
        certificatePage.clickButton();
    }

    @Then("check the validity {string}" )
    public void checkTheCertificateValidation(String expected) throws Exception {
        Assert.assertEquals(Boolean.valueOf(expected), certificatePage.checkCertificateCheckForm());
    }
}
