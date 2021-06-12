package Scripts;


import Utils.Utilities;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class BuyingShoe extends BaseScript {
    @Test
    public void TC_AddToCartAndValidateSizeColor() {
        String searchText = "shoes";
        String location = "Finland";
        Random rand = new Random();
        int resultIndex = rand.nextInt(5) + 1;

        homePage.changeDeliverTo(location);
        Assert.assertTrue(homePage.getTextDeliverTo().contains(location));
        homePage.search(searchText);
//        Assert.assertTrue(searchResultPage.getTextResultTitle(resultIndex).contains(searchText));
        searchResultPage.openSearchResult(resultIndex);
        List<String> sizes = productPage.getSizesList();
        List<String> colors = productPage.getColorsList();
        int tries = 10;
        logger.info("-----Selecting size and color");
        String selectedSize = "";
        String selectedColor = "";
        for (int i = 0; i < tries; i++) {
            logger.info(String.format("Trying %d time(s)", i+1));
            try {
                selectedColor = productPage.selectRandomColor(colors);
                selectedSize = productPage.selectRandomSize(sizes);
                Utilities.sleep(2);
                productPage.addToCart();
            } catch (NoSuchElementException | StaleElementReferenceException | TimeoutException e) {
                System.out.println(e);
                continue;
            }
            break;
        }
        Assert.assertEquals(homePage.getNumbersItemsInCart(),1);
        homePage.openCart();
        Assert.assertEquals(cartPage.getTextProductSize(), selectedSize);
        Assert.assertEquals(cartPage.getTextProductColor(), selectedColor);
        Assert.assertEquals(cartPage.getProductQuantity(), 1);
    }
}
