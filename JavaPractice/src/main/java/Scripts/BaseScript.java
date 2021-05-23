package Scripts;

import Libs.DriverManagement;
import Pages.AmazonHomePage;
import Pages.AmazonProductPage;
import Pages.AmazonSearchResultPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BaseScript {
    String url = "https://www.amazon.com/";
    DriverManagement driverMgt = new DriverManagement();
    ChromeDriver driver = driverMgt.createChromeDriver();
    AmazonHomePage homePage = new AmazonHomePage(driver);
    AmazonSearchResultPage searchResultPage = new AmazonSearchResultPage(driver);
    AmazonProductPage productPage = new AmazonProductPage(driver);

    BaseScript() {
        driver.get(url);
    }

}
