package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Locale;

public class Exercise1_3 {
    public static void main (String[] args) {
        String url = "https://www.amazon.com/";
        By inputSearch = By.xpath(Exercise1_1.XpathAmazonHomePage.inputNavSearchField);
        By btnSearchSubmit = By.xpath(Exercise1_1.XpathAmazonHomePage.btnNavSearchSubmit);
        By searchResult2Title = By.xpath("//div[@data-cel-widget='search_result_2']//h2//span");
        By searchResult3Title = By.xpath("//div[@data-cel-widget='search_result_3']//h2//span");
        By searchResult4Title = By.xpath("//div[@data-cel-widget='search_result_4']//h2//span");

        ChromeDriver driver = new ChromeDriver();
        driver.get(url);

        driver.findElement(inputSearch).sendKeys("toy");
        driver.findElement(btnSearchSubmit).click();
        Excercise1_2.sleep(2);
        String title2 = driver.findElement(searchResult2Title).getText();
        String title3 = driver.findElement(searchResult3Title).getText();
        String title4 = driver.findElement(searchResult4Title).getText();

        System.out.println(title2);
        System.out.println(title3);
        System.out.println(title4);

        if (title2.toLowerCase().contains("toy") && title3.toLowerCase().contains("toy") && title4.toLowerCase().contains("toy") ) {
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }
    }
}
