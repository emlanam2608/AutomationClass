package Practice1;

public class JavaBasicEx1 {
    static void findOddAndEven(int[] array) {
        for(int i=0; i<array.length; i++) {
            if(array[i] % 2 == 0) {
                System.out.println(array[i] + " is even number");
            }
            else {
                System.out.println(array[i] + " is odd number");
            }
        }
    }
}
