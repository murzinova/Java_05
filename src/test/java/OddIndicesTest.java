import org.testng.Assert;
import org.testng.annotations.Test;

public class OddIndicesTest {

    /*
     * 1.2. Test Data:
     * Input = {-45, 590, 234, 985, 12, 68}
     * Expected Result =  {590, 985, 68}
     */

    @Test
    public void testReturnOddIndices_HappyPath() {
        //arrange
        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        // act
        int[] actualResult = new OddIndices().oddIndices(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /*
     * if (array.length < 2)
     */

    @Test
    public void testArrayLengthLessThanTwo_NegativeTesting() {

        // arrange
        int[] array = {2};
        int[] expectedResult = {};

        // act
        int[] actualResult = new OddIndices(). oddIndices(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
