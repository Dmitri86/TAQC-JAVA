package Task4.src.parser;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.ArrayList;
import java.util.List;

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
        List<String> data = new ArrayList<>();
        data.add("src/test/resources/Task4/parserTest.txt");
        data.add("JDK");
        Assert.assertTrue(ValidateData.isInputtedDataCorrect(data));
    }

    @Test
    public void isInputtedDataCorrectWithoutStringNegative() {
        List<String> data = new ArrayList<>();
        data.add("src/test/resources/Task4/parserTest.txt");
        data.add("");
        Assert.assertFalse(ValidateData.isInputtedDataCorrect(data));
    }

    @Test
    public void isInputtedDataCorrectIncorrectPathNegative() {
        List<String> data = new ArrayList<>();
        data.add("src/test/resources/");
        data.add("JDK");
        Assert.assertFalse(ValidateData.isInputtedDataCorrect(data));
    }
}