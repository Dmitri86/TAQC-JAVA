package Task6.src.LuckyTiсkets;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LuckyTicketsTest {

    @Test
    public void testToStringFirstPositive() {
        LuckyTickets luckyTickets = new LuckyTickets(1000001, 1999999);
        String expected = "======== It's a draw! ========\nQuantity happy tickets with simple way: 55251\nQuantity " +
                "happy tickets with difficult way: 55251";
        String result = luckyTickets.toString();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testToStringSecondPositive() {
        LuckyTickets luckyTickets = new LuckyTickets(1000001, 1000055);
        String expected = "======== Win \"Difficult way\" method! ========\nQuantity happy tickets with simple way: 0\nQuantity " +
                "happy tickets with difficult way: 5";
        String result = luckyTickets.toString();
        Assert.assertEquals(expected, result);
    }
}