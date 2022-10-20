import org.testng.Assert;
import org.testng.annotations.Test;

public class ConditionalActionsResultTest {

    /*
     * 1.7. Given an integer M perform the following conditional actions:
     * If M is multiple of 7 and 9 then return "Good Number".
     */

    @Test
    public void testMMultipleOf7And9_HappyPath() {
        //arrange
        int m = 63;
        String expectedResult = "Good Number";

        //act
        String actualResult = new ConditionalActionsResult().conditionalActionsResult(m);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

     /*
      * If M is only multiple of 9 and not of 7  then return "Bad Number"
      */
     @Test
     public void testMMultipleOf9_HappyPath() {
         //arrange
         int m = 18;
         String expectedResult = "Bad Number";

         //act
         String actualResult = new ConditionalActionsResult().conditionalActionsResult(m);

         //Assert
         Assert.assertEquals(actualResult, expectedResult);
     }
      /*
       * If M is only multiple of 11 then return "Poor Number"
       */

    @Test
    public void testMMultipleOf11_HappyPath() {
        //arrange
        int m = 220;
        String expectedResult = "Poor Number";

        //act
        String actualResult = new ConditionalActionsResult().conditionalActionsResult(m);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /*
     * If M doesn't satisfy any of the above conditions then return "-1"
     */

    @Test
    public void testException_HappyPath() {
        //arrange
        int m = 222;
        String expectedResult = "-1";

        //act
        String actualResult = new ConditionalActionsResult().conditionalActionsResult(m);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }








}
