package ru.netology.unit;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void shouldRemain100() {
        int amount = 900;
        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldRemain1000() {
        int amount = 0;
        int actual = cashbackHackService.remain(amount);
        int expected = 1000;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldRemain0() {
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);

    }
}