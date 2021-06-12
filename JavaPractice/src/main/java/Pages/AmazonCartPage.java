package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCartPage extends BasePage{
    By textProductSize = By.xpath("//span[contains(text(), 'Size:')]//following-sibling::span");
    By textProductColor = By.xpath("//span[contains(text(), 'Color:')]//following-sibling::span");
    By textProductQuantity = By.xpath("(//span[contains(text(), 'Qty:')]//following-sibling::span)[last()]");

    public AmazonCartPage(ChromeDriver driver) {
        super(driver);
    }

    public int getProductQuantity() {
        logger.info("-----Getting product quantity");
        int quantity = Integer.parseInt(driver.findElement(textProductQuantity).getText());
        logger.info(quantity);
        return quantity;
    }

    public String getTextProductColor() {
        logger.info("-----Getting product color");
        String color = driver.findElement(textProductColor).getText();
        logger.info(color);
        return color;
    }

    public String getTextProductSize() {
        logger.info("-----Getting product size");
        String size = driver.findElement(textProductSize).getText();
        logger.info(size);
        return size;
    }
}
