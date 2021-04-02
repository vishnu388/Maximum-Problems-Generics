import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {

    private FindMaximum findMax;

    @Test
    public void whenGivenThreeStrings_ShouldReturnMaximumString() {
        String str1 = "Apple", str2 = "Peach", str3 = "Banana", str4 = "Orange", str5 = "Pineapple";
        findMax = new FindMaximum(str1, str2, str3, str4, str5);
        Object result = findMax.findMaximum();
        Assert.assertEquals(str5, result);
    }

    @Test
    public void whenGivenThreeNumbers_ShouldReturnMaximumNumber() {
        Integer int1 = 12, int2 = 5, int3 = 7, int4 = 3, int5 = 2;
        findMax = new FindMaximum(int1, int2, int3, int4, int5);
        Object result = findMax.findMaximum();
        Assert.assertEquals(int1, result);
    }

    @Test
    public void whenGivenThreeFloatNumbers_ShouldReturnMaximumFloatNumber() {
        Float float1 = 5.7f, float2 = 3.2f, float3 = 8.1f, float4 = 3.7f, float5 = 5.5f;
        findMax = new FindMaximum(float1, float2, float3, float4, float5);
        Object result = findMax.findMaximum();
        Assert.assertEquals(float3, result);
    }
}
