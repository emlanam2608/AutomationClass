package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    ChromeDriver driver;
    WebDriverWait wait;
    Logger logger = LogManager.getLogger();

    BasePage(ChromeDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
    }
}
