package Practice1;

public class JavaAdvanceEx4 {
    static int calAge(String dob) {
        int age;
        String[] splittedDob = dob.split("/");
        int year = Integer.parseInt(splittedDob[2]);
        int currentYear = 2021;
        age = currentYear - year;
        return age;
    }
}
