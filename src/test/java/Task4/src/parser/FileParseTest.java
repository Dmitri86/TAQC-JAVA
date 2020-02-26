package Task4.src.parser;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class FileParseTest {

    @Test
    public void getQuantityMatchesFirstPositive() {
        FileParse fileParse = new FileParse("src/test/resources/Task4/parserTest.txt",
                "JDK");
        String expected = "7";
        String result = fileParse.startProgram();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void getQuantityMatchesSecondPositive() {
        FileParse fileParse = new FileParse("src/test/resources/Task4/parserTest.txt",
                "1");
        String expected = "5";
        String result = fileParse.startProgram();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void getQuantityMatchesThirdPositive() {
        FileParse fileParse = new FileParse("src/test/resources/Task4/parserTest.txt",
                "a");
        String expected = "213";
        String result = fileParse.startProgram();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void getReplaceWordPositive() {
        FileParse fileParse = new FileParse("src/test/resources/Task4/parserTest2.txt",
                "a", "a");
        String expected = "Succeeded!";
        String result = fileParse.startProgram();
        Assert.assertEquals(expected, result);
    }

    @Test()
    public void getReplaceWithIncorrectPath(){
        FileParse fileParse = new FileParse("parserTest.txt",
                "a", "a");
        String expected = "";
        String result = fileParse.startProgram();
        Assert.assertEquals(expected, result);
    }

    @Test()
    public void getQuantityMatchesWithoutMatchesString(){
        FileParse fileParse = new FileParse("src/test/resources/Task4/parserTest.txt",
                "");
        String expected = "3292";
        String result = fileParse.startProgram();
        Assert.assertEquals(expected, result);
    }
}