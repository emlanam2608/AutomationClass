package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonSearchResultPage extends BasePage {
    public AmazonSearchResultPage(ChromeDriver driver) {
        super(driver);
    }

    By searchResult(int resultIndex) {
        return By.xpath(String
                .format("//div[@data-cel-widget='search_result_%s']//h2//a", Integer.toString(resultIndex)));
    }

    By textTitleSearchResult(int resultIndex) {
        return By.xpath(String
                .format("//div[@data-cel-widget='search_result_%s']//h2//span", Integer.toString(resultIndex)));
    }

    public String getTextResultTitle(int resultIndex) {
        logger.info("-----Getting result title");
        return driver.findElement(textTitleSearchResult(resultIndex)).getText();
    }

    public void openSearchResult(int resultIndex) {
        logger.info(String.format("Opening result %d", resultIndex));
        wait.until(ExpectedConditions.elementToBeClickable(searchResult(resultIndex)));
        driver.findElement(searchResult(resultIndex)).click();
    }
}
