package Pages;

import Utils.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AmazonProductPage extends BasePage {
    By dropdownSize = By.xpath("//span[@id='dropdown_selected_size_name']");

    By optionSize(String size) {
        return By.xpath(String.format("//a[contains(@id, 'dropdown_selected_size_name') and text()=%s]", size));
    }

    By optionSizes = By.xpath("//a[contains(@id, \"dropdown_selected_size_name\")]");

    By optionColor(String color, int index) {
        return By.xpath(String.format("(//img[contains(@alt, '%s')])[%d]//ancestor::button", color, index));
    }

    By btnAddToCart = By.xpath("//input[@id='add-to-cart-button']");

    public AmazonProductPage(ChromeDriver driver) {
        super(driver);
    }

    public List<String> getSizesList() {
        List<String> sizes = new ArrayList<String>();
        wait.until(ExpectedConditions.elementToBeClickable(optionSizes));
        List<WebElement> sizeElements = driver.findElements(optionSizes);
        for (int i = 1; i < sizeElements.size(); i++) {
            sizes.add(sizeElements.get(i).getText());
        }
        return sizes;
    }

    public void selectRandomSize() {
        logger.info("-----Selecting random size");
        logger.info("Click sizes dropdown");
        wait.until(ExpectedConditions.elementToBeClickable(dropdownSize));
        driver.findElement(dropdownSize).click();
        List<String> sizes = getSizesList();

//        wait.until(ExpectedConditions.elementToBeClickable(dropdownSize));
//        driver.findElement(optionSize(size)).click();
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
