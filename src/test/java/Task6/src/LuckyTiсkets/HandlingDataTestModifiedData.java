package Task6.src.LuckyTiсkets;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class HandlingDataTestModifiedData {
    private String[] inputData;
    private int[] expected;

    public HandlingDataTestModifiedData(String[] inputData, int[] expected){
        this.inputData = inputData;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static List<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {new String[]{"111111", "222222"}, new int[]{1111111, 1222222}},
                {new String[]{"001", "11"}, new int[]{1000001, 1000011}},
                {new String[]{"111", "888"}, new int[]{1000111, 1000888}},
                {new String[]{"0125", "1100"}, new int[]{1000125, 1001100}},
        });
    }

    @Test
    public void handlingDataTestModifiedDataTest(){
        Assert.assertArrayEquals(expected, HandlingData.modifiedData(inputData));
    }
}
