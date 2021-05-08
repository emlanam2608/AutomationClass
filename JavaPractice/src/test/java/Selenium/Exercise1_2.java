package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Exercise1_2 {
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
        YahooSignUpPage signUpPage = new YahooSignUpPage(driver);

        driver.get(url);
        String currentURL = driver.getCurrentUrl();

        if (currentURL.contains("login.yahoo.com")) {
            YahooLoginPage loginPage = new YahooLoginPage(driver);
            loginPage.clickCreateAccount();
        }
        else {
            YahooLandingPage landingPage = new YahooLandingPage(driver);
            landingPage.clickCreateAccount();
        }
        Utilities.sleep(2);

        //test data
        String firstName = "Nam";
        String lastName = "Huynh";
        String email = "NamHuynh1996";
        String password = "zaq1@WSX";
        String countryCode = "VN";
        String phoneNumber = "979326724";
        String dateOfBirth = "26/08/1996";
        String gender = "Male";

        int[] slitDateOfBirth = Utilities.dateOfBirthValidator(dateOfBirth);
        int dayOfBirth = slitDateOfBirth[0];
        int monthOfBirth = slitDateOfBirth[1];
        int yearOfBirth = slitDateOfBirth[2];

        signUpPage.signUp(firstName, lastName, email, password, countryCode, phoneNumber, dayOfBirth, monthOfBirth, yearOfBirth, gender);

//        driver.findElement(inputSignUpFormFirstName).sendKeys("Nam");
//        driver.findElement(inputSignUpFormLastName).sendKeys("Huynh");
//        driver.findElement(inputSignUpFormEmail).sendKeys("NamHuynh1996");
//        Utilities.sleep(1);
//        driver.findElement(inputSignUpFormEmail).sendKeys(Keys.TAB);
//        driver.findElement(inputSignUpFormPassword).sendKeys("zaq1@WSX");
//        driver.findElement(selectSignUpFormCountryCode).click();
//        driver.findElement(optionSignUpFormCountryCodeVN).click();
//        driver.findElement(inputSignUpFormPhoneNumber).sendKeys("979326724");
//        driver.findElement(selectSignUpFormDOBMonth).click();
//        driver.findElement(optionSignUpFormMonthAug).click();
//        driver.findElement(inputSignUpFormDOBDay).sendKeys("26");
//        driver.findElement(inputSignUpFormDOBYear).sendKeys("1996");
//        driver.findElement(inputSignUpFormGender).sendKeys("Male");
////        driver.findElement(btnSignUpFormSubmit).click();
    }
}
