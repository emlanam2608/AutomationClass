package Practice1;

public class JavaBasicEx5 {
    static void findReplacementInt(int[] array, int[] replacedArray) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] != replacedArray[i]) {
                System.out.println("The number '" + array[i] + "' is replaced by number '" + replacedArray[i] + "'");
            }
        }
    }
}
