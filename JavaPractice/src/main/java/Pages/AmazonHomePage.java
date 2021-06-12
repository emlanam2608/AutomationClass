package Pages;

import Utils.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class AmazonHomePage extends BasePage {
    //navbar
    By btnLogo = By.xpath("//a[@id='nav-logo-sprites']");
    By btnDeliverTo = By.xpath("//a[@id='nav-global-location-popover-link']");
    By textDeliverTo = By.xpath("//span[@id='glow-ingress-line2']");
    By selectDeliverTo = By.xpath("//span[contains(@id, 'CountryValue')]/..");

    By optionDeliverCountry(String countryName) {
        return By.xpath(String.format("//option[contains(text(), '%s')]", countryName));
    }

    By currentDeliverCountry = By.xpath("//span[contains(@id, 'CountryValue')]");
    By btnDeliverConfirm = By.xpath("//button[contains(@name, 'DoneButton')]");
    By btnSearchOption = By.xpath("//div[@id='nav-search-dropdown-card']");
    By inputSearch = By.xpath("//input[@id='twotabsearchtextbox']");
    By btnSearchSubmit = By.xpath("//input[@id='nav-search-submit-button']");
    By btnChangeLanguage = By.xpath("//a[@id='icp-nav-flyout']");

    By optionLanguage(String langCode) {
        return By.xpath(String.format("//div[@id='nav-flyout-icp']//span[contains(text(), '%s')]/..", langCode));
    }

    By btnAccount = By.xpath("//a[@id='nav-link-accountList']");
    By btnOrders = By.xpath("//a[@id='nav-orders']");
    By btnCart = By.xpath("//a[@id='nav-cart']");
    By textItemsInCart = By.xpath("//span[@id='nav-cart-count']");
    By btnLeftMenu = By.xpath("//a[@id='nav-hamburger-menu']");
    By btnTodayDeals = By.xpath("//div[@id='nav-xshop']/a[contains(text(), \"Today's Deals\")]");
    By btnCustomerService = By.xpath("//div[@id='nav-xshop']/a[contains(text(), 'Customer Service')]");
    By btnGiftCards = By.xpath("//div[@id='nav-xshop']/a[contains(text(), 'Gift Cards')]");
    By btnSell = By.xpath("//div[@id='nav-xshop']/a[contains(text(), 'Sell')]");
    By btnRegistry = By.xpath("//div[@id='nav-xshop']/a[contains(text(), 'Registry')]");

    //banner
    By btnVisibleCard = By.xpath("//li[@class='a-carousel-card' and @aria-hidden='false']//a");
    By btnPrevCard = By.xpath("//a[@class='a-carousel-goto-prevpage']");
    By btnNextCard = By.xpath("//a[@class='a-carousel-goto-nextpage']");

    //card layout
    By btnGridItem(String title) {
        return By.xpath(String.format("//h2[contains(text(), '%s')]/..//following-sibling::div[1]//a", title));
    }

    By btnGridMoreDetails(String title) {
        return By.xpath(String.format("//h2[contains(text(), '%s')]/..//following-sibling::div[2]//a", title));
    }

    By btnSignInSecurely = By.xpath("//h2[contains(text(), 'Sign in for the best experience')]/..//following-sibling::div[2]//a");
    By btnShippingIntroduction = By.xpath("//img[@alt='We ship 45 million products around the world']//parent::a");

    By btnGridInGridItem(String title) {
        return By.xpath(String.format("//a[@aria-label='%s']", title));
    }

    //main content
    By btnSlideMoreDetails(String title) {
        return By.xpath(String.format("//h2/span[contains(text(), '%s')]//..//following-sibling::span/a", title));
    }

    By btnShopIn8Languages = By.xpath("//img[@alt='Shop in 8 different languages']//parent::a");
    By btnShopIn60Currencies = By.xpath("//img[@alt='Shop in 60+ currencies']//parent::a");
    By btnSecurePayments = By.xpath("//img[@alt='Secure payment']//parent::a");
    By btnEstimatedImportFees = By.xpath("//img[@alt='Estimated Import Fees']//parent::a");
    By btnTrackYourPacket = By.xpath("//img[@alt='Track your package']//parent::a");
    By btnCustomerService247 = By.xpath("//img[@alt='Contact Us']//parent::a");

    By btnNextSlide(String title) {
        return By.xpath(String.format("//h2/span[contains(text(), '%s')]//following::a[@aria-label='Carousel next slide']", title));
    }

    By btnPrevSlide(String title) {
        return By.xpath(String.format("//h2/span[contains(text(), '%s')]//following::a[@aria-label='Carousel previous slide']", title));
    }

    //complementary
    By btnComplementarySignIn = By.xpath("//a[contains(text(), 'Sign in to see personalized recommendations')]");

    //footer
    By btnFooterBackToTop = By.xpath("//a[@id='navBackToTop']");
    By btnCareers = By.xpath("//ul//a[contains(text(), 'Careers')]");
    By btnBlog = By.xpath("//ul//a[contains(text(), 'Blog')]");
    By btnSellProductsOnAmazon = By.xpath("//ul//a[contains(text(), 'Sell products on Amazon')]");
    By btnSellOnAmazonBusiness = By.xpath("//ul//a[contains(text(), 'Sell on Amazon Business')]");
    By btnFooterLogo = By.xpath("//div[contains(@class, 'navFooterLogoLine')]//a");
    By btnFooterChangeLanguage = By.xpath("//a[@id='icp-touch-link-language']");

    By selectFooterLanguage(String langCode) {
        return By.xpath(String.format("//div[@id='nav-flyout-icp-footer-flyout']//span[contains(text(), '%s')]/..", langCode));
    }

    By btnFooterCustomerPreferences = By.xpath("//a[@id='icp-touch-link-cop']");
    By btnFooterSelectCountry = By.xpath("//a[@id='icp-touch-link-country']");



    public AmazonHomePage(ChromeDriver driver) {
        super(driver);
    }

    public void search(String searchText) {
        logger.info(String.format("-----Searching for '%s'", searchText));
        logger.info(String.format("Input '%s'", searchText));
        driver.findElement(inputSearch).sendKeys(searchText);
        logger.info("Click search button");
        driver.findElement(btnSearchSubmit).click();
    }

    public void changeDeliverTo(String countryName) {
        logger.info(String.format("-----Changing delivery location to '%s'", countryName));
        logger.info("Click delivery button");
        driver.findElement(btnDeliverTo).click();
        wait.until(ExpectedConditions.elementToBeClickable(selectDeliverTo));
        logger.info("Click countries dropdown");
        driver.findElement(selectDeliverTo).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(optionDeliverCountry(countryName)));
        logger.info(String.format("Select country: '%s'", countryName));
        driver.findElement(optionDeliverCountry(countryName)).click();
        String currentCountry = driver.findElement(currentDeliverCountry).getText();
        if (!countryName.contains(currentCountry)) {
            throw new IllegalStateException("Unexpected value: " + countryName);
        }
        Utilities.sleep(1);
        logger.info("Click confirm button");
        driver.findElement(btnDeliverConfirm).click();
        Utilities.sleep(3);
    }

    public String getTextDeliverTo() {
        logger.info("-----Getting Deliver to location");
        return driver.findElement(textDeliverTo).getText();
    }

    public void openCart() {
        logger.info("-----Opening cart");
        wait.until(ExpectedConditions.elementToBeClickable(btnCart));
        driver.findElement(btnCart).click();
    }

    public int getNumbersItemsInCart() {
        logger.info("-----Getting numbers item in cart");
        return Integer.parseInt(driver.findElement(textItemsInCart).getText());
    }
}
