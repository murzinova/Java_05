import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {

    /*
     * 1.5. Проверьте работу метода на числах 555, 0 и -555.
     */

    @Test
    public void testABiggerThanZero_PositiveHappyPath() {
        //arrange
        int a = 555;
        boolean expectedResult = true;

        //act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(a);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    /*
     * Test data: 0
     */
    @Test
    public void testAEqualZero_PositiveHappyPath() {
        //arrange
        int a = 0;
        boolean expectedResult = true;

        //act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(a);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    /*
     * Test Data: -555
     */
    @Test
    public void testALessThanZero_PositiveHappyPath() {
        //arrange
        int a = -555;
        boolean expectedResult = false;

        //act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(a);

        //Assert
        Assert.assertEquals(actualResult,expectedResult);
    }

}
