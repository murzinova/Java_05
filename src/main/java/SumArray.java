public class SumArray {

    /*
     * 1.3. Написать алгоритм SumArray, который возвращает сумму всех чисел массива
     */

    public int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
