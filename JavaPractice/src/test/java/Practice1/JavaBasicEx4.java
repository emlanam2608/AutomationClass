package Practice1;

public class JavaBasicEx4 {
    static void findGradeByScore(int score) {
        if(score >= 9) {
            System.out.println("Excellent");
        }
        else if(score >= 7) {
            System.out.println("Good");
        }
        else if(score >= 5) {
            System.out.println("Normal");
        }
        else {
            System.out.println("Bad");
        }
    }
}
