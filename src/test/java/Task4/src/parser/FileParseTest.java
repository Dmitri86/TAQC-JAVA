package Task4.src.parser;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FileParseTest {

    @Test
    public void getQuantityMatchesFirstPositive() {
        FileParse fileParse = new FileParse("src/test/resources/Task4/parserTest.txt",
                "JDK");
        int expected = 7;
        int result = fileParse.getQuantityMatches();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void getQuantityMatchesSecondPositive() {
        FileParse fileParse = new FileParse("src/test/resources/Task4/parserTest.txt",
                "1");
        int expected = 5;
        int result = fileParse.getQuantityMatches();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void getQuantityMatchesThirdPositive() {
        FileParse fileParse = new FileParse("src/test/resources/Task4/parserTest.txt",
                "a");
        int expected = 213;
        int result = fileParse.getQuantityMatches();
        Assert.assertEquals(expected, result);
    }
}