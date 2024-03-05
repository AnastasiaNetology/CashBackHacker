package ru.netology.service;
import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testRemainMore() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int actual = service.remain(amount);
        int expected = 500;
        assertEquals(actual, expected);
    }

    @org.junit.Test

    public void testRemainMin() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @org.junit.Test

    public void testRemainMax() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1200;
        int actual = service.remain(amount);
        int expected = 800;

        assertEquals(actual, expected);
    }
}
