public class PositiveCountlab4 {

    public static int countPositiveAtIndexesDivisibleByThree(int[] array) {
        if (array == null) {
            throw new NullPointerException("Масив не може бути null");
        }

        int count = 0;
        for (int i = 0; i < array.length; i += 3) {
            if (array[i] > 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array1 = {1, -2, 3, 4, 5, -6, 7, -8, 9};
        int[] array2 = {1, 2, 3, 4, 5, 6, -7, 8, 9, 10};
        int[] array3 = {-1, -2, -3, -4, -5, -6, -7, -8, -9};

        System.out.println("Кількість (масив 1): " + countPositiveAtIndexesDivisibleByThree(array1)); // Виведе 3
        System.out.println("Кількість (масив 2): " + countPositiveAtIndexesDivisibleByThree(array2)); // Виведе 3
        System.out.println("Кількість (масив 3): " + countPositiveAtIndexesDivisibleByThree(array3)); // Виведе 0
    }
}