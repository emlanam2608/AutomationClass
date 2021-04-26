package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1_1 {
    static class XpathAmazonHomePage {
        //navbar Nav
        static String btnNavLogo = "//a[@id='nav-logo-sprites']";
        static String btnNavDeliverTo = "//a[@id='nav-global-location-popover-link']";
        static String btnNavSearchOption = "//div[@id='nav-search-dropdown-card']";
        static String inputNavSearchField = "//input[@id='twotabsearchtextbox']";
        static String btnNavSearchSubmit = "//input[@id='nav-search-submit-button']";
        static String btnNavChangeLanguage = "//a[@id='icp-nav-flyout']";
        static String optionNavChangeLanguageES = "//div[@id='nav-flyout-icp']//span[contains(text(), 'Español - ES')]/..";
        static String btnNavAccount = "//a[@id='nav-link-accountList']";
        static String btnNavOrders = "//a[@id='nav-orders']";
        static String btnNavCart = "//a[@id='nav-cart']";
        static String btnNavLeftMenu = "//a[@id='nav-hamburger-menu']";
        static String btnNavTodayDeals = "//div[@id='nav-xshop']/a[contains(text(), \"Today's Deals\")]";
        static String btnNavCustomerService = "//div[@id='nav-xshop']/a[contains(text(), \"Customer Service\")]";
        static String btnNavGiftCards = "//div[@id='nav-xshop']/a[contains(text(), \"Gift Cards\")]";
        static String btnNavSell = "//div[@id='nav-xshop']/a[contains(text(), \"Sell\")]";
        static String btnNavRegistry = "//div[@id='nav-xshop']/a[contains(text(), \"Registry\")]";
        static String btnNavSWM = "//a[@id='swm-link']";

        //banner
        static String btnBannerCarouselVisibleCard = "//div[@id='desktop-banner']//li[@class='a-carousel-card' and @aria-hidden='false']//a";
        static String btnBannerCarousePrevPage = "//div[@id='desktop-banner']//a[@class='a-carousel-goto-prevpage']";
        static String btnBannerCarouseNextPage = "//div[@id='desktop-banner']//a[@class='a-carousel-goto-nextpage']";

        //card layout
        static String btnCardLayoutGridItem1 = "//div[@id='gw-card-layout']//div[@id='desktop-grid-1']//div[@class='a-cardui-body']//a";
        static String btnCardLayoutGridItem1MoreDetail = "//div[@id='gw-card-layout']//div[@id='desktop-grid-1']//div[@class='a-cardui-footer']//a";
        static String btnCardLayoutGridItem2 = "//div[@id='gw-card-layout']//div[@id='desktop-grid-2']//div[@class='a-cardui-body']//a";
        static String btnCardLayoutGridItem2MoreDetail = "//div[@id='gw-card-layout']//div[@id='desktop-grid-2']//div[@class='a-cardui-footer']//a";
        static String btnCardLayoutGridItemShippingIntroduction = "//div[@id='gw-card-layout']//div[@id='desktop-grid-1-D2']//a";
        static String btnCardLayoutGridItemSignIn = "//div[@id='gw-card-layout']//div[@id='desktop-grid-1-D1']//div[@class='a-cardui-body']//a";

        //main content
        static String btnMainContentDiscoverAmazonLearnMore = "//div[@id='main-content']//div[@id='desktop-top']//a[contains(@aria-label, 'Discover Amazon - Click to learn more')]";
        static String btnMainContentDiscoverAmazonShopIn8Languages = "//div[@id='main-content']//div[@id='desktop-top']//img[@alt='Shop in 8 different languages']/..";
        static String btnMainContentDiscoverAmazonShopIn60Currencies = "//div[@id='main-content']//div[@id='desktop-top']//img[@alt='Shop in 60+ currencies']/..";
        static String btnMainContentDiscoverAmazonSecurePayments = "//div[@id='main-content']//div[@id='desktop-top']//img[@alt='Secure payment']/..";
        static String btnMainContentDiscoverAmazonEstimatedImportFees = "//div[@id='main-content']//div[@id='desktop-top']//img[@alt='Estimated Import Fees']/..";
        static String btnMainContentDiscoverAmazonTrackYourPacket = "//div[@id='main-content']//div[@id='desktop-top']//img[@alt='Track your package']/..";
        static String btnMainContentDiscoverAmazonCustomerService = "//div[@id='main-content']//div[@id='desktop-top']//img[@alt='Contact Us']/..";
        static String btnMainContentDiscoverAmazonPrevious = "//div[@id='main-content']//div[@id='desktop-top']//a[@aria-label='Carousel previous slide']";
        static String btnMainContentDiscoverAmazonNext = "//div[@id='main-content']//div[@id='desktop-top']//a[@aria-label='Carousel next slide']";

        static String btnMainContentRow1Item1 = "//div[@id='main-content']//div[@id='desktop-1']//li[1]//a";
        static String btnMainContentRow1Item2 = "//div[@id='main-content']//div[@id='desktop-1']//li[2]//a";
        static String btnMainContentRow2Item1 = "//div[@id='main-content']//div[@id='desktop-2']//li[1]//a";
        static String btnMainContentRow2Item2 = "//div[@id='main-content']//div[@id='desktop-2']//li[2]//a";

        static String btnMainContentGridItem1 = "//div[@id='main-content']//div[@id='desktop-btf-grid-1']//div[@class='a-cardui-body']//a";
        static String btnMainContentGridItem1MoreDetail = "//div[@id='main-content']//div[@id='desktop-btf-grid-1']//div[@class='a-cardui-footer']//a";
        static String btnMainContentGridItem2 = "//div[@id='main-content']//div[@id='desktop-btf-grid-2']//div[@class='a-cardui-body']//a";
        static String btnMainContentGridItem2MoreDetail = "//div[@id='main-content']//div[@id='desktop-btf-grid-2']//div[@class='a-cardui-footer']//a";

        //complementary
        static String btnComplementarySignIn = "//div[@aria-label='Your recently viewed items and featured recommendations']//a[contains(text(), 'Sign in')]";

        //footer
        static String btnFooterBackToTop = "//div[@id='navFooter']//a[@id='navBackToTop']";
        static String btnFooterGetToKnowUsCareers = "//div[@class='navFooterColHead' and contains(text(), 'Get to Know Us')]/following-sibling::ul//a[contains(text(), 'Careers')]";
        static String btnFooterGetToKnowUsBlog = "//div[@class='navFooterColHead' and contains(text(), 'Get to Know Us')]/following-sibling::ul//a[contains(text(), 'Blog')]";
        static String btnFooterMakeMoneyWithUsSellProductsOnAmazon = "//div[@class='navFooterColHead' and contains(text(), 'Get to Know Us')]/following-sibling::ul//a[contains(text(), 'Sell products on Amazon')]";
        static String btnFooterMakeMoneyWithUsSellOnAmazonBusiness = "//div[@class='navFooterColHead' and contains(text(), 'Make Money with Us')]/following-sibling::ul//a[contains(text(), 'Sell on Amazon Business')]";
        static String btnFooterLogo = "//div[contains(@class, 'navFooterLogoLine')]//a";
        static String btnFooterChangeLanguage = "//a[@id='icp-touch-link-language']";
        static String optionFooterChangeLanguageES = "//div[@id='nav-flyout-icp-footer-flyout']//span[contains(text(), 'Español - ES')]/..";
        static String btnFooterCustomerPreferences = "//a[@id='icp-touch-link-cop']";
        static String btnFooterSelectCountry = "//a[@id='icp-touch-link-country']";
    }
}
