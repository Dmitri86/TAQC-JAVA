package Task6.src.LuckyTiсkets;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class LuckyTicketsTest {

    @Test
    public void testCalculateLuckyTicketsFirstPositive() {
        LuckyTickets luckyTickets = new LuckyTickets(1000001, 1999999);
        Map<String, Integer> expected = new HashMap<>();
        expected.put("simple way", 55251);
        expected.put("difficult way", 55251);
        Map<String, Integer> result = luckyTickets.calculateLuckyTickets();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testCalculateLuckyTicketsSecondPositive() {
        LuckyTickets luckyTickets = new LuckyTickets(1000001, 1000055);
        Map<String, Integer> expected = new HashMap<>();
        expected.put("simple way", 0);
        expected.put("difficult way", 5);
        Map<String, Integer> result = luckyTickets.calculateLuckyTickets();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testCalculateLuckyTicketsThirdPositive() {
        LuckyTickets luckyTickets = new LuckyTickets(1111110, 1111150);
        Map<String, Integer> expected = new HashMap<>();
        expected.put("simple way", 2);
        expected.put("difficult way", 4);
        Map<String, Integer> result = luckyTickets.calculateLuckyTickets();
        Assert.assertEquals(expected, result);
    }
}