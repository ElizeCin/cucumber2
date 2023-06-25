package config;

import enums.WebDriversEnum;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static config.BaseClass.driver;

public class WebDriverConfiguration {

    static public WebDriver createDriver(WebDriversEnum webDrivers) {
        switch (webDrivers) {
            case CHROME -> createChrome();
            case CHROME_INCOGNITO -> createChromeIncognito();
        }
        return driver;
    }

    private static void createChromeIncognito() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    private static void createChrome() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
    }
}