package Scripts;

import Libs.DriverManagement;
import Pages.AmazonHomePage;
import Pages.AmazonProductPage;
import Pages.AmazonSearchResultPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseScript {
    String url = "https://www.amazon.com/";
    DriverManagement driverMgt = new DriverManagement();
    ChromeDriver driver = driverMgt.createChromeDriver();
    AmazonHomePage homePage = new AmazonHomePage(driver);
    AmazonSearchResultPage searchResultPage = new AmazonSearchResultPage(driver);
    AmazonProductPage productPage = new AmazonProductPage(driver);
    Logger logger = LogManager.getLogger();

    @BeforeTest
    void beforeTest() {
        logger.info(String.format("Opening %s", url));
        driver.get(url);
    }

    @AfterTest
    void afterTest() {
        logger.info("Closing all browsers");
        driver.quit();
    }
}
