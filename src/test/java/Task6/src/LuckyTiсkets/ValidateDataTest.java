package Task6.src.LuckyTiсkets;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.Arrays;
import java.util.Collection;

@RunWith(JUnitParamsRunner.class)
public class ValidateDataTest {

    public static Collection<Object[]> dataPositive(){
        return Arrays.asList(new Object[][]{
                new String[]{"111111", "222222"},
                new String[]{"11", "22222"},
                new String[]{"225", "232222"},
                new String[]{"110", "111"}
        });
    }

    public static Collection<Object[]> dataNegative(){
        return Arrays.asList(new Object[][]{
                new String[]{"-5", "22222"},
                new String[]{"111111", "2222222"},
                new String[]{"222222", "111111"},
                new String[]{"15.8", "111111"},
                new String[]{"111111", "cat"},
                new String[]{"cat", "22.89"},
                new String[]{"", "2222222"},
                new String[]{"111111", " "},
                new String[]{"1g1111", "22ag22"},
                new String[]{"1 11 11", " 22 22 22"}
        });
    }


    @Test
    @Parameters(method = "dataPositive")
    public void testIsInputtedDataValidPositive(String[] input){
        Assert.assertTrue(ValidateData.isInputtedDataValid(input));
    }

    @Test
    @Parameters(method = "dataNegative")
    public void testIsInputtedDataValidNegative(String[] input){
        Assert.assertFalse(ValidateData.isInputtedDataValid(input));
    }
}
