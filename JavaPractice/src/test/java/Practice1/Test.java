package Practice1;

import java.util.Arrays;

public class Test {
    static void testJavaBasicEx2() {
        int testA = 5;
        int testB = 10;
        int[] temp = JavaBasicEx2.swapInt(testA, testB);
        testA = temp[0];
        testB = temp[1];
        System.out.println("testA = " + testA);
        System.out.println("testB = " + testB);
    }

    static void testJavaBasicEx1() {
        int[] testArray = {1, 2, 3, 4, 5};
        JavaBasicEx1.findOddAndEven(testArray);
    }

    static void testJavaBasicEx3() {
        int[] testArray = {-2, 1, 5, 2, 4, 6, 10, 8};
        int max = JavaBasicEx3.findMaxInt(testArray);
        System.out.println("Max number = " + max);
    }

    static void testJavaBasicEx4() {
        int testScore = 5;
        JavaBasicEx4.findGradeByScore(testScore);
    }

    static void testJavaBasicEx5() {
        int[] testArray1 = {1, 2, 3, 4, 5};
        int[] testArray2 = {1, 2, 6, 9, 5};
        JavaBasicEx5.findReplacementInt(testArray1, testArray2);
    }

    static void testJavaAdvanceEx1() {
        int testA = 5;
        int testB = 100;
        int[] temp = JavaAdvanceEx1.swapInt(testA, testB);
        testA = temp[0];
        testB = temp[1];
        System.out.println("testA = " + testA);
        System.out.println("testB = " + testB);
    }

    static void testJavaAdvanceEx2() {
        int testMonth = 4;
        int testYear = 2021;
        int numberOfDays = JavaAdvanceEx2.findNumberOfDays(testMonth, testYear);
        System.out.println(numberOfDays);
    }

    static void testJavaAdvanceEx4() {
        String testDob = "20/08/1996";
        int age = JavaAdvanceEx4.calAge(testDob);
        System.out.println("age = " + age);
    }

    static void testJavaAdvanceEx3() {
        int[] testArray = {2, 4, 1, 3, 1, 4, 5, 6};
        int[] sortedArray = JavaAdvanceEx3.sortArrayAsc(testArray);
        System.out.println(Arrays.toString(sortedArray));
    }

    public static void main(String[] args) {
        testJavaAdvanceEx3();
    }
}