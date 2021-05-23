package Pages;

import Utils.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AmazonProductPage {

    By dropdownSize = By.xpath("//span[@id='dropdown_selected_size_name']");

    By optionSize(String size) {
        return By.xpath(String.format("//a[contains(@id, 'dropdown_selected_size_name') and text()=%s]", size));
    }

    By optionColor(String color, int index) {
        return By.xpath(String.format("(//img[contains(@alt, '%s')])[%d]//ancestor::button", color, index));
    }

    By btnAddToCart = By.xpath("//input[@id='add-to-cart-button']");
    ChromeDriver driver;
    WebDriverWait wait;

    public AmazonProductPage(ChromeDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
    }

    public void selectSize(String size) {
        wait.until(ExpectedConditions.elementToBeClickable(dropdownSize));
        driver.findElement(dropdownSize).click();
        wait.until(ExpectedConditions.elementToBeClickable(dropdownSize));
        driver.findElement(optionSize(size)).click();
    }

    public void selectColor(String color) {
        WebDriverWait shortWait = new WebDriverWait(driver, 5);
        int tries = 1;
        int maxTries = 5;
        while (true) {
            try {
                wait.until(ExpectedConditions.elementToBeClickable(optionColor(color, tries)));
                driver.findElement(optionColor(color, tries)).click();
                Utilities.sleep(3);
                addToCart();
            } catch (org.openqa.selenium.NoSuchElementException e) {
                if (tries > maxTries) {
                    throw e;
                }
                tries++;
            }
        }
    }

    public void addToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(btnAddToCart));
        driver.findElement(btnAddToCart).click();
    }
}
