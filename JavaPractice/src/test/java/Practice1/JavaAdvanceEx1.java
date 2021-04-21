package Practice1;

public class JavaAdvanceEx1 {
    static int[] swapInt(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        return new int[]{a, b};
    }
}
