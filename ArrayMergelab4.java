import java.util.Arrays;

public class ArrayMergelab4 {

    public static int[] mergeArrays(int[] arrayA, int[] arrayB) {
        if (arrayA == null || arrayB == null) {
            throw new NullPointerException("Жоден з масивів не може бути null");
        }

        int[] mergedArray = new int[arrayA.length + arrayB.length];
        for (int i = 0; i < arrayA.length; i++) {
            mergedArray[i] = arrayA[i];
        }
        for (int j = 0; j < arrayB.length; j++) {
            mergedArray[arrayA.length + j] = arrayB[j];
        }
        return mergedArray;
    }

    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3};
        int[] arrayB = {4, 5, 6};
        int[] arrayC = mergeArrays(arrayA, arrayB);
        System.out.println("Об'єднаний масив: " + Arrays.toString(arrayC));

        int[] arrayD = {7, 8};
        int[] arrayE = {9, 10, 11};
        int[] arrayF = mergeArrays(arrayD, arrayE);
        System.out.println("Об'єднаний масив: " + Arrays.toString(arrayF));
    }
}