import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {

    /*
     * 1.1. В классе OddEven создать алгоритм oddEven(), который принимает на вход целое число, возвращает “Odd”,
     * если число нечетное, и “Even”, если число четное.
     * Test Data:
     * -345 →  “Odd”
     * 0 →  “Even”
     * 222222 →  “Even”
     */

    /*
     * Positive Testing_Happy Path
     * if (a % 2 != 0)
     * return "Odd"
     */

    @Test
    public void testAIsOddNumber_HappyPath() {

        //arrange
        int a = -345;
        String expectedResult = "Odd";

        //act
        String actualResult = new OddEven().oddEven(a);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /*
     * Positive Testing_Happy Path
     * if (a % 2 == 0)
     * int a = 0;
     * return "Even"
     */

    @Test
    public void testAIsEvenNumber_HappyPath() {

        //arrange
        int a = 0;
        String expectedResult = "Even";

        //act
        String actualResult = new OddEven().oddEven(a);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /*
     * Positive Testing_Happy Path
     * if (a % 2 == 0)
     * int a = 222222;
     * return "Even"
     */

    @Test
    public void testAIsEvenNumber_HappyPath1() {

        //arrange
        int a = 222222;
        String expectedResult = "Even";

        //act
        String actualResult = new OddEven().oddEven(a);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
