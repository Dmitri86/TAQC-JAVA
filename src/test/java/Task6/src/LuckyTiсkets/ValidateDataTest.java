package Task6.src.LuckyTiсkets;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidateDataTest {
    @Test
    public void testIsInputtedDataValidSixDigitNumber(){
        String[] inputData = {"111111", "222222"};
        boolean result = ValidateData.isInputtedDataValid(inputData);
        Assert.assertTrue(result);
    }

    @Test
    public void testIsInputtedDataValidLessSixDigitNumber(){
        String[] inputData = {"11", "22222"};
        boolean result = ValidateData.isInputtedDataValid(inputData);
        Assert.assertTrue(result);
    }

    @Test
    public void testIsInputtedDataValidLessZero(){
        String[] inputData = {"-5", "22222"};
        boolean result = ValidateData.isInputtedDataValid(inputData);
        Assert.assertFalse(result);
    }

    @Test
    public void testIsInputtedDataValidMoreSixDigitNumber(){
        String[] inputData = {"111111", "2222222"};
        boolean result = ValidateData.isInputtedDataValid(inputData);
        Assert.assertFalse(result);
    }

    @Test
    public void testIsInputtedDataValidNumberFirstTicketMoreSecond(){
        String[] inputData = {"222222", "111111"};
        boolean result = ValidateData.isInputtedDataValid(inputData);
        Assert.assertFalse(result);
    }

    @Test
    public void testIsInputtedDataValidFistNotInteger(){
        String[] inputData = {"15.8", "111111"};
        boolean result = ValidateData.isInputtedDataValid(inputData);
        Assert.assertFalse(result);
    }

    @Test
    public void testIsInputtedDataValidSecondNotInteger(){
        String[] inputData = {"111111", "cat"};
        boolean result = ValidateData.isInputtedDataValid(inputData);
        Assert.assertFalse(result);
    }

    @Test
    public void testIsInputtedDataValidFirstAndSecondNotInteger(){
        String[] inputData = {"cat", "22.89"};
        boolean result = ValidateData.isInputtedDataValid(inputData);
        Assert.assertFalse(result);
    }

    @Test
    public void testIsInputtedDataValidFirstEmpty(){
        String[] inputData = {"", "2222222"};
        boolean result = ValidateData.isInputtedDataValid(inputData);
        Assert.assertFalse(result);
    }

    @Test
    public void testIsInputtedDataValidSecondBlank(){
        String[] inputData = {"111111", " "};
        boolean result = ValidateData.isInputtedDataValid(inputData);
        Assert.assertFalse(result);
    }

    @Test
    public void testIsInputtedDataValidNumbersWithSymbols(){
        String[] inputData = {"1g1111", "22ag22"};
        boolean result = ValidateData.isInputtedDataValid(inputData);
        Assert.assertFalse(result);
    }
}