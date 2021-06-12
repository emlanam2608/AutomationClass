package Scripts;

import Libs.DriverManagement;
import Pages.AmazonCartPage;
import Pages.AmazonHomePage;
import Pages.AmazonProductPage;
import Pages.AmazonSearchResultPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseScript {
    String url = "https://www.amazon.com/";
    DriverManagement driverMgt = new DriverManagement();
    ChromeDriver driver = driverMgt.createChromeDriver();
    AmazonHomePage homePage = new AmazonHomePage(driver);
    AmazonSearchResultPage searchResultPage = new AmazonSearchResultPage(driver);
    AmazonProductPage productPage = new AmazonProductPage(driver);
    AmazonCartPage cartPage = new AmazonCartPage(driver);
    Logger logger = LogManager.getLogger();
    WebDriverWait wait =    new WebDriverWait(driver, 30);
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @BeforeTest
    void beforeTest() {
        logger.info(String.format("Opening %s", url));
        driver.get(url);
    }

    @AfterTest
    void afterTest() {
        logger.info("Closing all browsers");
//        driver.quit();
    }
}
