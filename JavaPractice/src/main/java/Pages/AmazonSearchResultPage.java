package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonSearchResultPage {

    ChromeDriver driver;
    WebDriverWait wait;

    public AmazonSearchResultPage(ChromeDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
    }

    String findSearchResult(int resultIndex) {

        return String.format("//div[@data-cel-widget='search_result_%s']", Integer.toString(resultIndex));
    }

    public String getTextResultTitle(int resultIndex) {
        By locator = By.xpath(findSearchResult(resultIndex) + "//h2//span");

        return driver.findElement(locator).getText();
    }

    public void openSearchResult(int resultIndex) {
        By locator = By.xpath(findSearchResult(resultIndex) + "//h2//a");
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        driver.findElement(locator).click();
    }
}
