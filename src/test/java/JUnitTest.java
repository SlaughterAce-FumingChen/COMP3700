import org.junit.Test;
import static org.junit.Assert.assertEquals;

    public class JUnitTest {
        @Test
        public void test_findMax() {
            FinderWithTwoFunctions findMax = new FinderWithTwoFunctions();
            int array[] = new int[]{1, 2, 3, 4, 5, 6};
            Integer Max = 6;
            Integer actualMax = findMax.findMax(array);
            assertEquals(actualMax, Max);
        }

        @Test
        public void test_findMin() {
            FinderWithTwoFunctions findMin = new FinderWithTwoFunctions();
            int array[] = new int[]{1, 2, 3, 4, 5, 6};
            Integer Min = 1;
            Integer actualMin = findMin.findMin(array);
            assertEquals(actualMin, Min);
        }

        @Test
        public void test_findMaxNullArray() {
            FinderWithTwoFunctions findMax = new FinderWithTwoFunctions();
            int array[] = new int[]{};
            Integer Max = null;
            Integer actualMax = findMax.findMax(array);
            assertEquals(actualMax, Max);
        }

        @Test
        public void test_findMinNullArray() {
            FinderWithTwoFunctions findMin = new FinderWithTwoFunctions();
            int array[] = new int[]{};
            Integer Min = null;
            Integer actualMin = findMin.findMin(array);
            assertEquals(actualMin, Min);
        }

        @Test
        public void test_findMaxNEmptyArray() {
            FinderWithTwoFunctions findMax = new FinderWithTwoFunctions();
            int array[] = new int[0];
            Integer Max = null;
            Integer actualMax = findMax.findMax(array);
            assertEquals(actualMax, Max);
        }

        @Test
        public void test_findMinEmptyArray() {
            FinderWithTwoFunctions min = new FinderWithTwoFunctions();
            int array[] = new int[0];
            Integer Min = null;
            Integer actualMin = min.findMin(array);
            assertEquals(actualMin, Min);
        }
    }
