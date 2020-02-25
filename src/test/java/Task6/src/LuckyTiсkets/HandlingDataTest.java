package Task6.src.LuckyTiсkets;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(JUnitParamsRunner.class)
public class HandlingDataTest {

    public static Collection<Object[]> inputDataConvertPositive(){
        return Arrays.asList(new Object[][]{
                {1111111, new int[]{1, 1, 1, 1, 1, 1}},
                {1000001, new int[]{0, 0, 0, 0, 0, 1}},
                {1234, new int[]{2, 3, 4}},
                {58984, new int[]{8, 9, 8, 4,}},

        });
    }

    public static Collection<Object[]> inputDataConvertNegative(){
        return Arrays.asList(new Object[][]{
                {1111111, new int[]{1, 1, 1, 1, 1}},
                {1001, new int[]{0, 0, 0, 0, 0, 1}},
                {14, new int[]{2, 3, 4}},
                {5898544, new int[]{8, 9, 8, 4,}},

        });
    }

    @Test
    @Parameters(method = "inputDataConvertPositive")
    public void testConvertFromIntToArrayIntPositive(int input, int[] expected){
        Assert.assertArrayEquals(expected, HandlingData.convertFromIntToArrayInt(input));
    }

    @Test
    @Parameters(method = "inputDataConvertNegative")
    public void testConvertFromIntToArrayIntNegative(int input, int[] expected){
        Assert.assertNotEquals(expected, HandlingData.convertFromIntToArrayInt(input));
    }

    public static List<Object[]> inputDataModifiedPositive(){
        return Arrays.asList(new Object[][]{
                {new String[]{"111111", "222222"}, new int[]{1111111, 1222222}},
                {new String[]{"001", "11"}, new int[]{1000001, 1000011}},
                {new String[]{"111", "888"}, new int[]{1000111, 1000888}},
                {new String[]{"0125", "1100"}, new int[]{1000125, 1001100}},
        });
    }

    public static List<Object[]> inputDataModifiedNegative(){
        return Arrays.asList(new Object[][]{
                {new String[]{"111111", "222222"}, new int[]{1222222, 1111111}},
                {new String[]{"111", "888"}, new int[]{10001, 1888}},
        });
    }

    @Test
    @Parameters(method = "inputDataModifiedPositive")
    public void handlingDataTestModifiedDataTestPositive(String[] inputData, int[] expected){
        Assert.assertArrayEquals(expected, HandlingData.modifiedData(inputData));
    }

    @Test
    @Parameters(method = "inputDataModifiedNegative")
    public void handlingDataTestModifiedDataTestNegative(String[] inputData, int[] expected){
        Assert.assertNotEquals(expected, HandlingData.modifiedData(inputData));
    }

    public static List<Object[]> inputDataModifiedThrowException(){
        return Arrays.asList(new Object[][]{
                {new String[]{"data", "222222"}},
                {new String[]{"001", "11.55"}},
                {new String[]{"111", "data"}},
                {new String[]{"18.958", "1100"}},
        });
    }

    @Test(expected = NumberFormatException.class)
    @Parameters(method = "inputDataModifiedThrowException")
    public void handlingDataTestModifiedThrowException(String[] input){
        HandlingData.modifiedData(input);
    }
}
