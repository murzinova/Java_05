import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateArrayTest {

    /*
     * 1.1.1. Например, createIntArray(1, 2, 3, 4, 5) -> {1, 2, 3, 4, 5}
     */

    @Test
    public void testCreateIntArray_HappyPath() {
        //arrange
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int[] expectedResult = {1, 2, 3, 4, 5};

        //act
        int[] actualResult = new CreateArray().createIntArray(a, b, c, d, e);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /*
     * 1.1.2. Например, createDoubleArray(1.1, 2.5, 3.7, 4.0, 5.5) -> {1.1, 2.5, 3.7, 4.0, 5.5}
     */

    @Test
    public void testCreateDoubleArray_HappyPath() {
        //arrange
        double a = 1.1;
        double b = 2.5;
        double c = 3.7;
        double d = 4.0;
        double e = 5.5;
        double[] expectedResult = {1.1, 2.5, 3.7, 4.0, 5.5};

        //act
        double[] actualResult = new CreateArray().createDoubleArray(a,b,c,d,e);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /*
     * 1.1.3. Например, createStringArray(“It”, “was”, “an”, “apple”, “pie”) -> {“It”, “was”, “an”, “apple”, “pie”}
     */

    @Test
    public void testCreateStringArray_HappyPath() {
        //arrange
        String val1 = "It";
        String val2 = "was";
        String val3 = "an";
        String val4 = "apple";
        String val5 = "pie";
        String[] expectedResult = {"It", "was", "an", "apple", "pie"};

        //act
        String[] actualResult = new CreateArray().createStringArray(val1,val2,val3,val4,val5);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    /*
     * 1.1.4. Например, createArrayFromText(“It was an apple pie”) -> {“It”, “was”, “an”, “apple”, “pie”}
     */

    @Test
    public void testCreateArrayFromText_HappyPath() {
        //arrange
        String text = "It was an apple pie";
        String[] expectedResult = {"It", "was", "an", "apple", "pie"};

        //act
        String[] actualResult = new CreateArray().createArrayFromText(text);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }


}
