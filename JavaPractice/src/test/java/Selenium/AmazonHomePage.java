package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonHomePage {
    //navbar Nav
    By btnNavLogo = By.xpath("//a[@id='nav-logo-sprites']");
    By btnNavDeliverTo = By.xpath("//a[@id='nav-global-location-popover-link']");
    By btnNavSearchOption = By.xpath("//div[@id='nav-search-dropdown-card']");
    By inputNavSearchField = By.xpath("//input[@id='twotabsearchtextbox']");
    By btnNavSearchSubmit = By.xpath("//input[@id='nav-search-submit-button']");
    By btnNavChangeLanguage = By.xpath("//a[@id='icp-nav-flyout']");
    By optionNavChangeLanguageES = By.xpath("//div[@id='nav-flyout-icp']//span[contains(text(), 'Español - ES')]/..");
    By btnNavAccount = By.xpath("//a[@id='nav-link-accountList']");
    By btnNavOrders = By.xpath("//a[@id='nav-orders']");
    By btnNavCart = By.xpath("//a[@id='nav-cart']");
    By btnNavLeftMenu = By.xpath("//a[@id='nav-hamburger-menu']");
    By btnNavTodayDeals = By.xpath("//div[@id='nav-xshop']/a[contains(text(), \"Today's Deals\")]");
    By btnNavCustomerService = By.xpath("//div[@id='nav-xshop']/a[contains(text(), \"Customer Service\")]");
    By btnNavGiftCards = By.xpath("//div[@id='nav-xshop']/a[contains(text(), \"Gift Cards\")]");
    By btnNavSell = By.xpath("//div[@id='nav-xshop']/a[contains(text(), \"Sell\")]");
    By btnNavRegistry = By.xpath("//div[@id='nav-xshop']/a[contains(text(), \"Registry\")]");
    By btnNavSWM = By.xpath("//a[@id='swm-link']");

    //banner
    By btnBannerCarouselVisibleCard = By.xpath("//div[@id='desktop-banner']//li[@class='a-carousel-card' and @aria-hidden='false']//a");
    By btnBannerCarousePrevPage = By.xpath("//div[@id='desktop-banner']//a[@class='a-carousel-goto-prevpage']");
    By btnBannerCarouseNextPage = By.xpath("//div[@id='desktop-banner']//a[@class='a-carousel-goto-nextpage']");

    //card layout
    By btnCardLayoutGridItem1 = By.xpath("//div[@id='gw-card-layout']//div[@id='desktop-grid-1']//div[@class='a-cardui-body']//a");
    By btnCardLayoutGridItem1MoreDetail = By.xpath("//div[@id='gw-card-layout']//div[@id='desktop-grid-1']//div[@class='a-cardui-footer']//a");
    By btnCardLayoutGridItem2 = By.xpath("//div[@id='gw-card-layout']//div[@id='desktop-grid-2']//div[@class='a-cardui-body']//a");
    By btnCardLayoutGridItem2MoreDetail = By.xpath("//div[@id='gw-card-layout']//div[@id='desktop-grid-2']//div[@class='a-cardui-footer']//a");
    By btnCardLayoutGridItemShippingIntroduction = By.xpath("//div[@id='gw-card-layout']//div[@id='desktop-grid-1-D2']//a");
    By btnCardLayoutGridItemSignIn = By.xpath("//div[@id='gw-card-layout']//div[@id='desktop-grid-1-D1']//div[@class='a-cardui-body']//a");

    //main content
    By btnMainContentDiscoverAmazonLearnMore = By.xpath("//div[@id='main-content']//div[@id='desktop-top']//a[contains(@aria-label, 'Discover Amazon - Click to learn more')]");
    By btnMainContentDiscoverAmazonShopIn8Languages = By.xpath("//div[@id='main-content']//div[@id='desktop-top']//img[@alt='Shop in 8 different languages']/..");
    By btnMainContentDiscoverAmazonShopIn60Currencies = By.xpath("//div[@id='main-content']//div[@id='desktop-top']//img[@alt='Shop in 60+ currencies']/..");
    By btnMainContentDiscoverAmazonSecurePayments = By.xpath("//div[@id='main-content']//div[@id='desktop-top']//img[@alt='Secure payment']/..");
    By btnMainContentDiscoverAmazonEstimatedImportFees = By.xpath("//div[@id='main-content']//div[@id='desktop-top']//img[@alt='Estimated Import Fees']/..");
    By btnMainContentDiscoverAmazonTrackYourPacket = By.xpath("//div[@id='main-content']//div[@id='desktop-top']//img[@alt='Track your package']/..");
    By btnMainContentDiscoverAmazonCustomerService = By.xpath("//div[@id='main-content']//div[@id='desktop-top']//img[@alt='Contact Us']/..");
    By btnMainContentDiscoverAmazonPrevious = By.xpath("//div[@id='main-content']//div[@id='desktop-top']//a[@aria-label='Carousel previous slide']");
    By btnMainContentDiscoverAmazonNext = By.xpath("//div[@id='main-content']//div[@id='desktop-top']//a[@aria-label='Carousel next slide']");

    By btnMainContentRow1Item1 = By.xpath("//div[@id='main-content']//div[@id='desktop-1']//li[1]//a");
    By btnMainContentRow1Item2 = By.xpath("//div[@id='main-content']//div[@id='desktop-1']//li[2]//a");
    By btnMainContentRow2Item1 = By.xpath("//div[@id='main-content']//div[@id='desktop-2']//li[1]//a");
    By btnMainContentRow2Item2 = By.xpath("//div[@id='main-content']//div[@id='desktop-2']//li[2]//a");

    By btnMainContentGridItem1 = By.xpath("//div[@id='main-content']//div[@id='desktop-btf-grid-1']//div[@class='a-cardui-body']//a");
    By btnMainContentGridItem1MoreDetail = By.xpath("//div[@id='main-content']//div[@id='desktop-btf-grid-1']//div[@class='a-cardui-footer']//a");
    By btnMainContentGridItem2 = By.xpath("//div[@id='main-content']//div[@id='desktop-btf-grid-2']//div[@class='a-cardui-body']//a");
    By btnMainContentGridItem2MoreDetail = By.xpath("//div[@id='main-content']//div[@id='desktop-btf-grid-2']//div[@class='a-cardui-footer']//a");

    //complementary
    By btnComplementarySignIn = By.xpath("//div[@aria-label='Your recently viewed items and featured recommendations']//a[contains(text(), 'Sign in')]");

    //footer
    By btnFooterBackToTop = By.xpath("//div[@id='navFooter']//a[@id='navBackToTop']");
    By btnFooterGetToKnowUsCareers = By.xpath("//div[@class='navFooterColHead' and contains(text(), 'Get to Know Us')]/following-sibling::ul//a[contains(text(), 'Careers')]");
    By btnFooterGetToKnowUsBlog = By.xpath("//div[@class='navFooterColHead' and contains(text(), 'Get to Know Us')]/following-sibling::ul//a[contains(text(), 'Blog')]");
    By btnFooterMakeMoneyWithUsSellProductsOnAmazon = By.xpath("//div[@class='navFooterColHead' and contains(text(), 'Get to Know Us')]/following-sibling::ul//a[contains(text(), 'Sell products on Amazon')]");
    By btnFooterMakeMoneyWithUsSellOnAmazonBusiness = By.xpath("//div[@class='navFooterColHead' and contains(text(), 'Make Money with Us')]/following-sibling::ul//a[contains(text(), 'Sell on Amazon Business')]");
    By btnFooterLogo = By.xpath("//div[contains(@class, 'navFooterLogoLine')]//a");
    By btnFooterChangeLanguage = By.xpath("//a[@id='icp-touch-link-language']");
    By optionFooterChangeLanguageES = By.xpath("//div[@id='nav-flyout-icp-footer-flyout']//span[contains(text(), 'Español - ES')]/..");
    By btnFooterCustomerPreferences = By.xpath("//a[@id='icp-touch-link-cop']");
    By btnFooterSelectCountry = By.xpath("//a[@id='icp-touch-link-country']");

    ChromeDriver driver;

    AmazonHomePage(ChromeDriver _driver) {
        driver = _driver;
    }

    void search(String searchText) {
        driver.findElement(inputNavSearchField).sendKeys(searchText);
        driver.findElement(btnNavSearchSubmit).click();
    }
}
