import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {
    private static final FindMaximum findMax = new FindMaximum();

    @Test
    public void whenGivenThreeNumbers_AndFirstNumberIsMax_ShouldReturn_true() {
        Integer[] intArray = {3, 2, 1};
        Integer result = findMax.findMaximum(intArray);
        Assert.assertEquals(Integer.valueOf(3), result);
    }

    @Test
    public void whenGivenThreeNumbers_AndSecondNumberIsMax_ShouldReturn_true() {
        Integer[] intArray = {3, 5, 1};
        Integer result = findMax.findMaximum(intArray);
        Assert.assertEquals(Integer.valueOf(5), result);
    }

    @Test
    public void whenGivenThreeNumbers_AndThirdNumberIsMax_ShouldReturn_true() {
        Integer[] intArray = {3, 1, 7};
        Integer result = findMax.findMaximum(intArray);
        Assert.assertEquals(Integer.valueOf(7), result);
    }
}
