package project_utils;

public class Utils {

    /*
     * печать среднего значения в массиве
     */
    public static void printAvgValue(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum / array.length);
    }

    /*
     * метод, который принимает параметры n, m, l,
     * и печатает последовательность нечетных чисел начиная с числа n, с шагом m,  длина последовательности  l.
     */
    public static void printOddNumbers(int n, int l, int m) {
        int countOddNumbers = 0;
        if (n % 2 != 0 || m % 2 != 0) {
            for (int i = n; countOddNumbers < l; i += m) {
                if (i % 2 != 0) {
                    countOddNumbers++;
                    System.out.println(i);
                }
            }
        }
    }

    /*
     * нахождение минимального значения в массиве чисел
     */

    public static void printMinValue(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("The minimal value is " + min);
    }

    /*
     * нахождение максимального значения в массиве
     */

    public static void printMaxValue(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The maximal value is " + max);
    }
}
