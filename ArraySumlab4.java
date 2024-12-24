public class ArraySumlab4 {

    public static int calculateSum(int[] array) {
        if (array == null) {
            throw new NullPointerException("Масив не може бути null");
        }

        int sum = 0;
        for (int num : array) {
            if (num > 1 && num < 5) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {0, -1, 2, 3, 4, 5, 6};
        int[] array3 = {1, 5, 6};

        System.out.println("Сума (масив 1): " + calculateSum(array1)); // Виведе 9
        System.out.println("Сума (масив 2): " + calculateSum(array2)); // Виведе 9
        System.out.println("Сума (масив 3): " + calculateSum(array3)); // Виведе 0
    }
}