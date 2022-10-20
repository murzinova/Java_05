public class OddIndices {

    /*
     * 1.2. Написать алгоритм OddIndices, который принимает массив целых чисел,  и возвращает массив значений
     * нечетных индексов
     */

    public int[] oddIndices(int[] array) {
        int[] result = new int[array.length / 2];
        int number = 0;
        if (array.length > 1) {
            for (int i = 1; i < array.length; i += 2) {
                result[number++] = array[i];
            }
            return result;
        }

        return new int[0];
    }
}




