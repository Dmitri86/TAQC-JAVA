package Task4.src.parser;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidateDataTest {

    @Test
    public void testIsModeCorrectFirstPositive() {
        boolean result = ValidateData.isModeCorrect("1");
        Assert.assertTrue(result);
    }

    @Test
    public void testIsModeCorrectSecondPositive() {
        boolean result = ValidateData.isModeCorrect("2");
        Assert.assertTrue(result);
    }

    @Test
    public void testIsModeCorrectFirstNegative() {
        boolean result = ValidateData.isModeCorrect("a");
        Assert.assertFalse(result);
    }

    @Test
    public void isInputtedDataCorrectPositive() {
        String[] data = {"src/test/resources/Task4/parserTest.txt", "JDK"};
        Assert.assertTrue(ValidateData.isInputtedDataCorrect(data));
    }

    @Test
    public void isInputtedDataCorrectWithoutStringNegative() {
        String[] data = {"src/test/resources/Task4/parserTest.txt", ""};
        Assert.assertFalse(ValidateData.isInputtedDataCorrect(data));
    }

    @Test
    public void isInputtedDataCorrectIncorrectPathNegative() {
        String[] data = {"src/test/resources/", "JDK"};
        Assert.assertFalse(ValidateData.isInputtedDataCorrect(data));
    }
}