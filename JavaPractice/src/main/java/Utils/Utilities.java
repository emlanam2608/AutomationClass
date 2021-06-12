package Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Utilities {
    public static void sleep(long sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    static String emailValidator(String email) {
        //abc@xyz.com
        if (email.contains("@")) {
            String[] splitEmail = email.split("@");
            String username = splitEmail[0];
            String domain = splitEmail[1];

            if (!username.contains("@") && !domain.contains("@") && domain.contains(".")) {
                return email;
            } else {
                throw new IllegalStateException("Unexpected value: " + email);
            }

        } else {
            throw new IllegalStateException("Unexpected value: " + email);
        }
    }

    public static int[] dateOfBirthValidator(String dateOfBirth) {
        //dd-mm-yyyy
        String[] listOfSeparatesSymbol = {"/", "-",};
        String[] splitDateOfBirth = {};

        for (String s : listOfSeparatesSymbol) {
            if (dateOfBirth.contains(s)) {
                splitDateOfBirth = dateOfBirth.split(s);
            }
        }

        if (splitDateOfBirth.length == 3) {
            int day = Integer.parseInt(splitDateOfBirth[0]);
            int month = Integer.parseInt(splitDateOfBirth[1]);
            int year = Integer.parseInt(splitDateOfBirth[2]);

            if (year < 0 || month < 0 || day < 0 || month > 12 || day > 31) {
                throw new IllegalStateException("Unexpected value: " + dateOfBirth);
            }

            int maxDay;
            switch(month) {
                case 2:
                    if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                        maxDay = 29;
                    }
                    else {
                        maxDay = 28;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    maxDay = 30;
                    break;
                default:
                    maxDay = 31;
                    break;
            }

            if (day > maxDay) {
                throw new IllegalStateException("Unexpected value: " + dateOfBirth);
            }

            return new int[]{day, month, year};
        } else {
            throw new IllegalStateException("Unexpected value: " + dateOfBirth);
        }
    }

    public static void scrollToBottom(JavascriptExecutor js) {
        //This will scroll the web page till end.
        long scrollHeight = 0;

        while ((long) js.executeScript("return document.body.scrollHeight") > scrollHeight) {
            scrollHeight = (long) js.executeScript("return document.body.scrollHeight");
            js.executeScript(String.format("window.scrollTo(0, %d)", scrollHeight));
        }
    }

    public static void scrollInElement(JavascriptExecutor js, Actions action, WebElement element) {
        //Hover and scroll in element
        action.moveToElement(element).perform();
        js.executeScript("scrollTo(0, 200)");
    }
}
