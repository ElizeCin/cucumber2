package config;

import enums.WebDriversEnum;
import org.openqa.selenium.WebDriver;

public class BaseClass {

     public static WebDriver driver;

     static {
          driver = WebDriverConfiguration.createDriver(WebDriversEnum.CHROME_INCOGNITO);
     }

     public static void afterParent() {
          try {
               Thread.sleep(3000);
          } catch (InterruptedException e) {
               e.printStackTrace();
          }
          driver.quit();
     }
}

