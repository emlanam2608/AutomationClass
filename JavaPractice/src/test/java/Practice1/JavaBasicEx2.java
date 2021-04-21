package Practice1;

public class JavaBasicEx2 {
    static int[] swapInt(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
        return new int[]{a, b};
    }
}
