package Certificate;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CertificatePage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"certificateCheckForm\"]/div/input")
    WebElement certificate;
    @FindBy(xpath = "//*[@id=\"certificateCheckForm\"]/div/button")
    WebElement button;
    @FindBy(id = "certificateCheckForm")
    WebElement checkFormValidity;

    public CertificatePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void sendCertificate(String certNumber) {
        certificate.sendKeys(certNumber);
        certificate.sendKeys(Keys.ENTER);
    }

    public void clickButton() {
        this.button.click();
    }

    public boolean checkCertificateCheckForm() throws Exception {
        System.out.println(checkFormValidity.getAttribute("class"));

        int i = 0;
        boolean result=false;
        while (true) {
            if (IfTheCertificateIsValid()) {
                result = true;
                break;
            }
            if (checkFormValidity.getAttribute("class").contains("invalid")) {
                result = false;
                break;
            }

            try {
                Thread.sleep(1000);
                i++;
                if (i > 10) {
                    throw new Exception("Out of time wait certificate cheker");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    private boolean IfTheCertificateIsValid() {
        return driver.getCurrentUrl().contains("view");
    }
}
