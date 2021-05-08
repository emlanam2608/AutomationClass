package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooLandingPage {
    By btnLandingSignUp = By.xpath("//span[contains(text(), 'Sign up')]/..");

    ChromeDriver driver;

    public YahooLandingPage(ChromeDriver _driver) {
        driver = _driver;
    }

    void clickCreateAccount() {
        driver.findElement(btnLandingSignUp).click();
    }
}
