public class CreateArray {

    /*
     * 1.1.1. Написать метод createIntArray(), который принимает на вход 5 целых чисел,  и возвращает массив из этих
     * же чисел.
     */

    public int[] createIntArray(int a, int b, int c, int d, int e) {
        int[] array = {a, b, c, d, e};
        return array;
    }

    /*
     * 1.1.2. Написать метод createDoubleArray(), который принимает на вход 5 чисел типа double,
     * и возвращает массив из этих же чисел
     */

    public double[] createDoubleArray(double a, double b, double c, double d, double e) {
        double[] array = {a, b, c, d, e};
        return array;
    }

    /*
     * 1.1.3. Написать метод createStringArray(), который принимает на вход 5 слов, и возвращает массив из этих слов
     */

    public String[] createStringArray(String val1, String val2, String val3, String val4, String val5) {
        String[] array = {val1, val2, val3, val4, val5};
        return array;
    }

    /*
     * 1.1.4. Написать метод createArrayFromText(), который принимает на вход предложение из нескольких слов и
     * возвращает массив из этих слов.
     */

    public String[] createArrayFromText(String text) {
        String[] arrayFromText = text.split(" ");
        return arrayFromText;
    }

}
