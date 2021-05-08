package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Locale;

public class Exercise1_3 {
    public static void main (String[] args) {
        String url = "https://www.amazon.com/";
        ChromeDriver driver = new ChromeDriver();
        AmazonHomePage homePage = new AmazonHomePage(driver);
        AmazonSearchResultPage resultPage = new AmazonSearchResultPage(driver);

        driver.get(url);

        homePage.search("toy");
        Utilities.sleep(2);
        String title3 = resultPage.getTextResultTitle(3);
        String title1 = resultPage.getTextResultTitle(1);
        String title2 = resultPage.getTextResultTitle(2);

        System.out.println(title1);
        System.out.println(title2);
        System.out.println(title3);

        if (title1.toLowerCase().contains("toy") && title2.toLowerCase().contains("toy") && title3.toLowerCase().contains("toy") ) {
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }
    }
}
