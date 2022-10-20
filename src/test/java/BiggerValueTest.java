import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {

    /*
     * 1.4. Test Data:
     * 3333, 9999
     * Expected Result = 9999
     */

    @Test
    public void testABiggerThanB_PositiveHappyPath() {
        //arrange
        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;

        //act
        int actualResult = new BiggerValue().biggerValue(a,b);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /*
     * a = 100;
     * b = -100;
     * expRes = 100;
     */
    @Test
    public void testBBiggerThanA_PositiveHappyPath() {
        //arrange
        int a = 100;
        int b = -100;
        int expectedResult = 100;

        //act
        int actualResult = new BiggerValue().biggerValue(a,b);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /*
     * a = 80;
     * b = 80;
     * expRes = 80;
     */

    @Test
    public void testAEqualsB_PositiveHappyPath() {
        //arrange
        int a = 80;
        int b = 80;
        int expectedResult = 80;

        //act
        int actualResult = new BiggerValue().biggerValue(a,b);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
