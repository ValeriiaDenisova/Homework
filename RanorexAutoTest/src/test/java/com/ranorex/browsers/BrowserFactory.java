package com.ranorex.browsers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    enum Browsers {
        IE,
        CHROME,
        FIREFOX;
    }

    public static WebDriver createDriver() {
        String browserName = System.getProperty("browserName").toUpperCase();
        switch (browserName) {
            case "chrome":
                return new ChromeDriver();
            default:
                return new FirefoxDriver();
        }
    }
}
