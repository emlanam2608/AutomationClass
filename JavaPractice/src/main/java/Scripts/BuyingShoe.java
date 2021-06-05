package Scripts;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.List;

public class BuyingShoe extends BaseScript {
    @Test
    public void TC_AddToCartAndValidateSizeColor() {
        String searchText = "shoes";
        String location = "Finland";
        int resultIndex = 1;

        homePage.changeDeliverTo(location);
        homePage.search(searchText);
        searchResultPage.openSearchResult(resultIndex);
        productPage.selectRandomSize();
//        productPage.selectSize("10");
//        productPage.selectColor("Black");

        List<String> sizes = productPage.getSizesList();
        System.out.println(sizes);
    }

}
