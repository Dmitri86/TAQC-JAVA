package Task6.src.LuckyTiсkets;

import org.junit.Assert;
import org.junit.Test;

public class HandlingDataTest {

    @Test
    public void testModifiedDataSixDigitPositive() {
        String[] inputData = {"111111", "222222"};
        int[] expected = {1111111, 1222222};
        int[] result = HandlingData.modifiedData(inputData);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testModifiedDataLessSixDigitsPositive() {
        String[] inputData = {"001", "11"};
        int[] expected = {1000001, 1000011};
        int[] result = HandlingData.modifiedData(inputData);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testModifiedDataNegative() {
        String[] inputData = {"001", "11"};
        int[] expected = {1, 11};
        int[] result = HandlingData.modifiedData(inputData);
        Assert.assertNotEquals(result, expected);
    }

    @Test
    public void testConvertFromIntToArrayIntSixDigitPositive(){
        int input = 1111111;
        int[] expected = {1, 1, 1, 1, 1, 1};
        int[] result = HandlingData.convertFromIntToArrayInt(input);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testConvertFromIntToArrayIntPositive(){
        int input = 1111111;
        int[] expected = {1, 1, 1, 1, 1, 1};
        int[] result = HandlingData.convertFromIntToArrayInt(input);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testConvertFromIntToArrayIntNumberWithZeroPositive(){
        int input = 1000001;
        int[] expected = {0, 0, 0, 0, 0, 1};
        int[] result = HandlingData.convertFromIntToArrayInt(input);
        Assert.assertArrayEquals(expected, result);
    }
}