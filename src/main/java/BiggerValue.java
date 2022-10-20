public class BiggerValue {

    /*
     * 1.4. Напишите алгоритм BiggerValue, который из двух параметров типа int возвращает бОльшее значение.
     */

    public int biggerValue(int a, int b) {
        int max;
        if (a >= b) {
            max = a;
        } else {
            max = b;
        }

        return max;
    }
}
