import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {
    private static FindMaximum findMax;

    @Test
    public void whenGivenThreeStrings_ShouldReturnMaximumString() {
        String str1 = "Apple", str2 = "Peach", str3 = "Banana";
        findMax = new FindMaximum(str1, str2, str3);
        Object result = findMax.findMaximum();
        Assert.assertEquals(str2, result);
    }

    @Test
    public void whenGivenThreeNumbers_ShouldReturnMaximumNumber() {
        Integer int1 = 12, int2 = 5, int3 = 7;
        findMax = new FindMaximum(int1, int2, int3);
        Object result = findMax.findMaximum();
        Assert.assertEquals(int1, result);
    }

    @Test
    public void whenGivenThreeFloatNumbers_ShouldReturnMaximumFloatNumber() {
        Float float1 = 5.7f, float2 = 3.2f, float3 = 8.1f;
        findMax = new FindMaximum(float1, float2, float3);
        Object result = findMax.findMaximum();
        Assert.assertEquals(float3, result);
    }
}
