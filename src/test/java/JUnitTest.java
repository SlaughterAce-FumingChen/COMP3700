import org.junit.Test;
public class JUnitTest {
    @Test
    public void TestFindMax_True() {
        FinderWithTwoFunctions FindMax = new FinderWithTwoFunctions();
        int[] intArray = {98, 2, 3, 45, 56, 7, 7, 8, 544, 84, 8};
        int result = FindMax.findMax(intArray);
    }

    @Test
    public void TestFindMin_True() {
        FinderWithTwoFunctions FindMin = new FinderWithTwoFunctions();
        int[] intArray = {98, 2, 3, 45, 56, 7, 7, 8, 544, 84, 8};
        int result = FindMin.findMin(intArray);
    }

    @Test
    public void TestFindMax_False() {
        FinderWithTwoFunctions FindMax = new FinderWithTwoFunctions();
        int[] intArray = {};
        int result = FindMax.findMax(intArray);
    }
    @Test
    public void TestFindMin_False() {
        FinderWithTwoFunctions FindMin = new FinderWithTwoFunctions();
        int[] intArray = {};
        int result = FindMin.findMax(intArray);
    }
}
