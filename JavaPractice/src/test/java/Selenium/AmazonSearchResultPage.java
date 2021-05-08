package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchResultPage {
    By searchResult2Title = By.xpath("//div[@data-cel-widget='search_result_2']//h2//span");
    By searchResult3Title = By.xpath("//div[@data-cel-widget='search_result_3']//h2//span");
    By searchResult4Title = By.xpath("//div[@data-cel-widget='search_result_4']//h2//span");

    ChromeDriver driver;

    AmazonSearchResultPage(ChromeDriver _driver) {
        driver = _driver;
    }

    By findSearchResultTitle(int resultIndex) {
        String xpath = String.format("//div[@data-cel-widget='search_result_%s']//h2//span", Integer.toString(resultIndex));

        return By.xpath(xpath);
    }

    String getTextResultTitle(int resultIndex) {
        By locator = findSearchResultTitle(resultIndex);

        return driver.findElement(locator).getText();
    }
}
