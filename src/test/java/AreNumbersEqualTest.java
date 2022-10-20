import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumbersEqualTest {

    /*
     * 1.6. Test Data:
     * 89, 89
     * Expected result: 0
     */

    @Test
    public void testAEqualB_PositiveHappyPath() {
        //arrange
        int a = 89;
        int b = 89;
        int expectedResult = 0;

        //act
        int actualResult = new AreNumbersEqual().areNumbersEqual(a,b);

        // Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    /*
     * -89, 89
     * Expected result: -1
     */
    @Test
    public void testALessThanB_PositiveHappyPath() {
        //arrange
        int a = -89;
        int b = 89;
        int expectedResult = -1;

        //act
        int actualResult = new AreNumbersEqual().areNumbersEqual(a,b);

        // Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    /*
    * 89, -89
    * Expected result: 1
    */
    @Test
    public void testABiggerThanB_PositiveHappyPath() {
        //arrange
        int a = 89;
        int b = -89;
        int expectedResult = 1;

        //act
        int actualResult = new AreNumbersEqual().areNumbersEqual(a,b);

        // Assert
        Assert.assertEquals(actualResult,expectedResult);
    }
}
