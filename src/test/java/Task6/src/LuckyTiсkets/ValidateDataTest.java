package Task6.src.LuckyTiсkets;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ValidateDataTest {
    private String[] input;
    private boolean expected;

    public ValidateDataTest(String[] input, boolean expected){
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {new String[]{"111111", "222222"}, true},
                {new String[]{"11", "22222"}, true},
                {new String[]{"-5", "22222"}, false},
                {new String[]{"111111", "2222222"}, false},
                {new String[]{"222222", "111111"}, false},
                {new String[]{"15.8", "111111"}, false},
                {new String[]{"111111", "cat"}, false},
                {new String[]{"cat", "22.89"}, false},
                {new String[]{"", "2222222"}, false},
                {new String[]{"111111", " "}, false},
                {new String[]{"1g1111", "22ag22"}, false},
                {new String[]{"1 11 11", " 22 22 22"}, false}
        });
    }

    @Test
    public void testIsInputtedDataValid(){
        Assert.assertEquals(expected, ValidateData.isInputtedDataValid(input));
    }
}
