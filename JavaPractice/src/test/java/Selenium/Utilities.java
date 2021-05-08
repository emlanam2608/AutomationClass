package Selenium;

public class Utilities {
    static void sleep(long sec) {
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

    static int[] dateOfBirthValidator(String dateOfBirth) {
        //dd-mm-yyyy
        String[] listOfSeperateSymbol = {"/", "-",};
        String[] splitDateOfBirth = {};

        for (int i = 0; i < listOfSeperateSymbol.length; i++) {
            if (dateOfBirth.contains(listOfSeperateSymbol[i])) {
                splitDateOfBirth = dateOfBirth.split(listOfSeperateSymbol[i]);
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
}
