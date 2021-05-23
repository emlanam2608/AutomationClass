package Scripts;

import Utils.Utilities;

public class Exercise1_3 extends BaseScript {
    public void TC_ValidateSearchResult() {

        homePage.search("toy");
        Utilities.sleep(2);
        String title3 = searchResultPage.getTextResultTitle(3);
        String title1 = searchResultPage.getTextResultTitle(1);
        String title2 = searchResultPage.getTextResultTitle(2);

        System.out.println(title1);
        System.out.println(title2);
        System.out.println(title3);

        if (title1.toLowerCase().contains("toy") && title2.toLowerCase().contains("toy") && title3.toLowerCase().contains("toy")) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }

}
