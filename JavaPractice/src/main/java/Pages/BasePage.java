package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    ChromeDriver driver;
    WebDriverWait wait;
    Actions action;
    Logger logger = LogManager.getLogger();
    JavascriptExecutor js;

    BasePage(ChromeDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
        this.action = new Actions(driver);
        this.js = (JavascriptExecutor) driver;
    }
}
