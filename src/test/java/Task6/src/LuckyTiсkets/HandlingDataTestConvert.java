package Task6.src.LuckyTiсkets;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class HandlingDataTestConvert {
    private int input;
    private int[] expected;

    public HandlingDataTestConvert(int input, int[] expected){
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {1111111, new int[]{1, 1, 1, 1, 1, 1}},
                {1000001, new int[]{0, 0, 0, 0, 0, 1}},
                {1234, new int[]{2, 3, 4}},
                {58984, new int[]{8, 9, 8, 4,}},

        });
    }

    @Test
    public void testConvertFromIntToArrayInt(){
        Assert.assertArrayEquals(expected, HandlingData.convertFromIntToArrayInt(input));
    }
}
