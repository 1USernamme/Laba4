# Laba4
### Завдання 1: Обчислення суми елементів масиву, більших за 1 і менших за 5

```java
public class ArraySum {
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
```

### Пояснення коду:
1. **Метод `calculateSum`**:
   - Перевіряється, чи масив не є `null`, якщо так, викидається виключення `NullPointerException`.
   - Відкривається цикл для перебору кожного елемента масиву. Якщо елемент більший за 1 і менший за 5, то він додається до змінної `sum`.
   - Після завершення циклу повертається сума.

2. **Метод `main`**:
   - Створюються три масиви `array1`, `array2`, `array3`.
   - Викликаються методи для обчислення суми для кожного масиву, і результати виводяться на екран.

---

### Завдання 2: Підрахунок кількості додатних елементів масиву, індекси яких кратні 3

```java
public class PositiveCount {
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
```

### Пояснення коду:
1. **Метод `countPositiveAtIndexesDivisibleByThree`**:
   - Перевірка масиву на `null` для запобігання помилок.
   - Цикл перебирає масив, збільшуючи індекс на 3 в кожній ітерації (перевіряються лише індекси, кратні 3).
   - Якщо елемент на поточному індексі більше за 0, збільшується лічильник `count`.

2. **Метод `main`**:
   - Три масиви різної довжини.
   - Викликається метод підрахунку для кожного масиву, і результат виводиться на екран.

---

### Завдання 3: Об'єднання двох масивів в один

```java
import java.util.Arrays;

public class ArrayMerge {
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
```

### Пояснення коду:
1. **Метод `mergeArrays`**:
   - Перевіряється, чи є один з масивів `null`. Якщо так, викидається `NullPointerException`.
   - Створюється новий масив, довжина якого є сумою довжин двох вхідних масивів.
   - Перший цикл копіює елементи з масиву `arrayA` в новий масив.
   - Другий цикл копіює елементи з масиву `arrayB` в новий масив після елементів з `arrayA`.

2. **Метод `main`**:
   - Створюються два масиви `arrayA` і `arrayB`.
   - Викликається метод для об'єднання масивів, і результат виводиться через `Arrays.toString`, щоб зручно вивести масив як строку.

---

### Висновки:
- Завдання 1 обчислює суму елементів, які більші за 1 і менші за 5.
- Завдання 2 підраховує кількість додатних елементів масиву з індексами, кратними 3.
- Завдання 3 об'єднує два масиви в один, спочатку копіюючи елементи з одного масиву, а потім з іншого.

