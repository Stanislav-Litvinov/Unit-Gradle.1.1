package ru.netology.unit;

import junit.framework.TestCase;
import org.junit.Test;

public class CashbackHackServiceTest extends TestCase {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void shouldRemain100() {
        int amount = 900;
        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);

    }

    @Test
    public void shouldRemain1000() {
        int amount = 0;
        int actual = cashbackHackService.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);

    }

    @Test
    public void shouldRemain0() {
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);

    }
}