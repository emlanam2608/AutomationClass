package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Excercise1_2 {
    static void sleep(long sec) {
        try
        {
            Thread.sleep(sec* 1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        By btnLandingSignUp = By.xpath("//span[contains(text(), 'Sign up')]/..");
        By inputSignUpFormFirstName = By.xpath("//input[@id='usernamereg-firstName']");
        By inputSignUpFormLastName = By.xpath("//input[@id='usernamereg-lastName']");
        By inputSignUpFormEmail = By.xpath("//input[@id='usernamereg-yid']");
        By inputSignUpFormPassword = By.xpath("//input[@id='usernamereg-password']");
        By selectSignUpFormCountryCode = By.xpath("//select[@name='shortCountryCode']");
        By optionSignUpFormCountryCodeVN = By.xpath("//option[@value='VN']");
        By inputSignUpFormPhoneNumber = By.xpath("//input[@id='usernamereg-phone']");
        By selectSignUpFormDOBMonth = By.xpath("//select[@id='usernamereg-month']");
        By optionSignUpFormMonthAug = By.xpath("//option[contains(text(), 'August')]");
        By inputSignUpFormDOBDay = By.xpath("//input[@id='usernamereg-day']");
        By inputSignUpFormDOBYear = By.xpath("//input[@id='usernamereg-year']");
        By inputSignUpFormGender = By.xpath("//input[@id='usernamereg-freeformGender']");
        By btnSignUpFormSubmit = By.xpath("//button[@id='reg-submit-button']");
        By btnLoginCreateAccount = By.xpath("//a[@id='createacc']");

        String url = "https://mail.yahoo.com";
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);
        String currentURL = driver.getCurrentUrl();
        if (currentURL.contains("login.yahoo.com")) {
            driver.findElement(btnLoginCreateAccount).click();
        }
        else {
            driver.findElement(btnLandingSignUp).click();
        }
        sleep(2);

        driver.findElement(inputSignUpFormFirstName).sendKeys("Nam");
        driver.findElement(inputSignUpFormLastName).sendKeys("Huynh");
        driver.findElement(inputSignUpFormEmail).sendKeys("NamHuynh1996");
        sleep(1);
        driver.findElement(inputSignUpFormEmail).sendKeys(Keys.TAB);
        driver.findElement(inputSignUpFormPassword).sendKeys("zaq1@WSX");
        driver.findElement(selectSignUpFormCountryCode).click();
        driver.findElement(optionSignUpFormCountryCodeVN).click();
        driver.findElement(inputSignUpFormPhoneNumber).sendKeys("979326724");
        driver.findElement(selectSignUpFormDOBMonth).click();
        driver.findElement(optionSignUpFormMonthAug).click();
        driver.findElement(inputSignUpFormDOBDay).sendKeys("26");
        driver.findElement(inputSignUpFormDOBYear).sendKeys("1996");
        driver.findElement(inputSignUpFormGender).sendKeys("Male");
//        driver.findElement(btnSignUpFormSubmit).click();
    }
}
