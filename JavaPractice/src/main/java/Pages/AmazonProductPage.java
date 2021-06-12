package Pages;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AmazonProductPage extends BasePage {
    By dropdownSize = By.xpath("//span[@id='dropdown_selected_size_name']");

    By optionSize(String size) {
        return By.xpath(String.format("//a[contains(@id, 'dropdown_selected_size_name') and text()='%s']", size));
    }

    By optionSizes = By.xpath("//a[contains(@id, \"dropdown_selected_size_name\")]");

    By optionColor(String color) {
        return By.xpath(String.format("(//img[contains(@alt, '%s')])//ancestor::button", color));
    }

    By optionColors = By.xpath("//li[contains(@id, 'color_name')]//img");

    By btnAddToCart = By.xpath("//input[@id='add-to-cart-button']");

    public AmazonProductPage(ChromeDriver driver) {
        super(driver);
    }

    public List<String> getSizesList() {
        logger.info("-----Collecting sizes");
        List<String> sizes = new ArrayList<String>();

        logger.info("Click sizes dropdown");
        wait.until(ExpectedConditions.elementToBeClickable(dropdownSize));
        driver.findElement(dropdownSize).click();
        logger.info("Collect sizes");
        wait.until(ExpectedConditions.elementToBeClickable(optionSizes));
        List<WebElement> sizeElements = driver.findElements(optionSizes);
        for (int i = 1; i < sizeElements.size(); i++) {
            sizes.add(sizeElements.get(i).getText());
        }
        action.sendKeys(Keys.ESCAPE).perform();
        return sizes;
    }

    public List<String> getColorsList() {
        logger.info("-----Collecting colors");
        List<String> colors = new ArrayList<String>();

        logger.info("Collect colors");
        wait.until(ExpectedConditions.elementToBeClickable(optionColors));
        List<WebElement> colorElements = driver.findElements(optionColors);
        for (WebElement colorElement : colorElements) {
            colors.add(colorElement.getAttribute("alt"));
        }
        return colors;
    }

    public String selectRandomSize(@NotNull List<String> sizes) {
        logger.info("-----Selecting random size");
        Random rand = new Random();
        int randInt;
        String size = "";
        String elementClass = "";

        for(int i = 0; i < 10; i ++) {
            randInt = rand.nextInt(sizes.size());
            size = sizes.get(randInt);

            logger.info("Click sizes dropdown");
            wait.until(ExpectedConditions.elementToBeClickable(dropdownSize));
            driver.findElement(dropdownSize).click();
            elementClass = driver
                    .findElement(optionSize(size))
                    .findElement(By.xpath(".//ancestor::li"))
                    .getAttribute("class");
            if (elementClass.contains("dropdownUnavailable")) {
                continue;
            }
            logger.info(String.format("Select size '%s'", size));
            wait.until(ExpectedConditions
                    .elementToBeClickable(optionSize(size)));
            driver.findElement(optionSize(size)).click();
            break;
        }

        return size;
    }

    public String selectRandomColor(@NotNull List<String> colors) {
        logger.info("-----Selecting random color");
        Random rand = new Random();
        int randInt;
        String color = "";
        String elementClass = "";

        for (int i = 0; i < 10; i++) {
            randInt = rand.nextInt(colors.size());
            color = colors.get(randInt);
            elementClass = driver
                    .findElement(optionColor(color))
                    .findElement(By.xpath(".//ancestor::li"))
                    .getAttribute("class");
            if (elementClass.contains("swatchUnavailable")) {
                continue;
            }
            logger.info(String.format("Select color '%s'", color));
            wait.until(ExpectedConditions
                    .elementToBeClickable(optionColor(color)));
            driver.findElement(optionColor(color)).click();
            break;
        }
        return color;
    }

    public void selectRandomSizeAndColor() {
        logger.info("-----Selecting size and color");
        List<String> sizes = getSizesList();
        List<String> colors = getColorsList();
        int tries = 10;

        for (int i = 0; i < tries; i++){
            logger.info(String.format("Trying %d time(s)", i+1));
            try {
                selectRandomColor(colors);
                selectRandomSize(sizes);
                wait.until(ExpectedConditions.elementToBeClickable(btnAddToCart));

            } catch (org.openqa.selenium.NoSuchElementException e) {
                continue;
            }
            break;
        }
    }
//
//    public void selectColor(String color) {
//        WebDriverWait shortWait = new WebDriverWait(driver, 5);
//        int tries = 1;
//        int maxTries = 5;
//        while (true) {
//            try {
//                wait.until(ExpectedConditions.elementToBeClickable(optionColor(color, tries)));
//                driver.findElement(optionColor(color, tries)).click();
//                Utilities.sleep(3);
//                addToCart();
//            } catch (org.openqa.selenium.NoSuchElementException e) {
//                if (tries > maxTries) {
//                    throw e;
//                }
//                tries++;
//            }
//        }
//    }

    public void addToCart() {
        logger.info("-----Clicking add to cart button");
        wait.until(ExpectedConditions.elementToBeClickable(btnAddToCart));
        driver.findElement(btnAddToCart).click();
    }
}
