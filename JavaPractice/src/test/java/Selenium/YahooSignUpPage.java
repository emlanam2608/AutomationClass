package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Locale;

public class YahooSignUpPage {
    By inputSignUpFormFirstName = By.xpath("//input[@id='usernamereg-firstName']");
    By inputSignUpFormLastName = By.xpath("//input[@id='usernamereg-lastName']");
    By inputSignUpFormEmail = By.xpath("//input[@id='usernamereg-yid']");
    By inputSignUpFormPassword = By.xpath("//input[@id='usernamereg-password']");
    By selectSignUpFormCountryCode = By.xpath("//select[@name='shortCountryCode']");
    By optionSignUpFormCountryCodeVN = By.xpath("//option[@value='VN']");
    By inputSignUpFormPhoneNumber = By.xpath("//input[@id='usernamereg-phone']");
    By selectSignUpFormDOBMonth = By.xpath("//select[@id='usernamereg-month']");
    //    By optionSignUpFormMonthAug = By.xpath("//option[contains(text(), 'August')]");
    By inputSignUpFormDOBDay = By.xpath("//input[@id='usernamereg-day']");
    By inputSignUpFormDOBYear = By.xpath("//input[@id='usernamereg-year']");
    By inputSignUpFormGender = By.xpath("//input[@id='usernamereg-freeformGender']");
    By btnSignUpFormSubmit = By.xpath("//button[@id='reg-submit-button']");

    ChromeDriver driver;

    YahooSignUpPage(ChromeDriver _driver) {
        driver = _driver;
    }

    By selectMonthOption(int month) {
        String monthAsText;
        switch (month) {
            case 1:
                monthAsText = "Jan";
                break;
            case 2:
                monthAsText = "Feb";
                break;
            case 3:
                monthAsText = "Mar";
                break;
            case 4:
                monthAsText = "Apr";
                break;
            case 5:
                monthAsText = "May";
                break;
            case 6:
                monthAsText = "Jun";
                break;
            case 7:
                monthAsText = "Jul";
                break;
            case 8:
                monthAsText = "Aug";
                break;
            case 9:
                monthAsText = "Sep";
                break;
            case 10:
                monthAsText = "Oct";
                break;
            case 11:
                monthAsText = "Nov";
                break;
            case 12:
                monthAsText = "Dec";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + month);
        }
        return By.xpath(String.format("//option[contains(text(), '%s')]", monthAsText));
    }

    By selectCountryCodeOption(String countryCode) {
        String[] listOfCountryCode = {"VN",};
        for (int i = 0; i < listOfCountryCode.length; i++) {
            if (countryCode.toLowerCase().equals(listOfCountryCode[i].toLowerCase())) {
                return By.xpath(String.format("//option[@value='%s']", countryCode));
            }
        }

        throw new IllegalStateException("Unexpected value: " + countryCode);
    }

    void signUp(String firstName, String lastName, String email, String password, String countryCode, String phoneNumber, int dayOfBirth, int monthOfBirth, int yearOfBirth, String gender) {
        driver.findElement(inputSignUpFormFirstName).sendKeys(firstName);
        driver.findElement(inputSignUpFormLastName).sendKeys(lastName);
        driver.findElement(inputSignUpFormEmail).sendKeys(email);

        //work around to pass the mail suggestion dropdown
        Utilities.sleep(1);
        driver.findElement(inputSignUpFormEmail).sendKeys(Keys.TAB);

        driver.findElement(inputSignUpFormPassword).sendKeys(password);
        driver.findElement(selectSignUpFormCountryCode).click();
        driver.findElement(selectCountryCodeOption(countryCode)).click();
        driver.findElement(inputSignUpFormPhoneNumber).sendKeys(phoneNumber);
        driver.findElement(selectSignUpFormDOBMonth).click();
        driver.findElement(selectMonthOption(monthOfBirth)).click();
        driver.findElement(inputSignUpFormDOBDay).sendKeys(Integer.toString(dayOfBirth));
        driver.findElement(inputSignUpFormDOBYear).sendKeys(Integer.toString(yearOfBirth));
        driver.findElement(inputSignUpFormGender).sendKeys(gender);
//        driver.findElement(btnSignUpFormSubmit).click();
    }
}
