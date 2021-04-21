package Practice1;

import java.util.Arrays;

public class JavaAdvanceEx3 {
    static int[] removeAnElement(int[] array, int skipIndex) {
        int length = array.length;
        int increment = 0;
        int[] removedElementArray = new int[length-1];
        for(int i = 0; i < length - 1; i++) {
            if(i == skipIndex) {
                increment++;
            }
            removedElementArray[i] = array[i + increment];
        }
        return removedElementArray;
    }

    static int[] findMinWithIndex(int[] array) {
        int min = array[0];
        int index = 0;

        for(int i = 1; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
                index = i;
            }
        }

        return new int[]{min, index};
    }

    static int[] sortArrayAsc(int[] array) {
        int length = array.length;
        int[] sortedArray = new int[length];
        int[] minAndIndex;
        int min;
        int index = 0;
        int[] tempArray = array;

        for(int i = 0; i < length; i++) {
            if(i != 0) {
                tempArray = removeAnElement(tempArray, index);
            }
            minAndIndex = findMinWithIndex(tempArray);
            min = minAndIndex[0];
            index = minAndIndex[1];
            sortedArray[i] = min;
        }

        return sortedArray;
    }
}
