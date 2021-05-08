package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooLoginPage {
    By btnLoginCreateAccount = By.xpath("//a[@id='createacc']");

    ChromeDriver driver;
    YahooLoginPage(ChromeDriver _driver) {
        driver = _driver;
    }

    void clickCreateAccount() {
        driver.findElement(btnLoginCreateAccount).click();
    }
}
