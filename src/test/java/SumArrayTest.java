import org.testng.Assert;
import org.testng.annotations.Test;

public class SumArrayTest {

    /*
     * 1.3. Test Data:
     * {0, 1, 2, 3, 4, 5} → 15
     */

    @Test
    public void testSumPositiveNumbers_PositiveHappyPath() {
        //arrange
        int[] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        //act
        int actualResult = new SumArray().sumArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /*
     * Test Data: {-7, -3} → -10
     */

    @Test
    public void testSumNegativeNumbers_PositiveHappyPath() {
        //arrange
        int[] array = {-7, -3};
        int expectedResult = -10;

        //act
        int actualResult = new SumArray().sumArray(array);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
