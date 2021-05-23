package Scripts;


import org.openqa.selenium.support.ui.ExpectedConditions;

public class BuyingShoe extends BaseScript {
    public void TC_AddToCartAndValidateSizeColor() {

        homePage.search("shoes");
        searchResultPage.openSearchResult(1);
        homePage.changeDeliverTo("United Kingdom");
        productPage.selectSize("10");
        productPage.selectColor("Black");
    }

}
