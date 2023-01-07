package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackService4Test {

    @Test
    public void remain() {
        CashbackHackService4 service4 = new CashbackHackService4();
        int amount = 900;
        int expected = 100;
        int actual = service4.remain(900);
        assertEquals(expected,actual);

    }
    @Test
    public void buyEqualsBoundary() {
        CashbackHackService4 service4 = new CashbackHackService4();
        int amount = 2000;
        int expected = 1000;
        int actual = service4.remain(2000);
        assertEquals(expected,actual);
    }
    @Test
    public void buyNotEqualsBoundary() {
        CashbackHackService4 service4 = new CashbackHackService4();
        int amount = 1800;
        int expected = 200;
        int actual = service4.remain(800);
        assertEquals(expected,actual);
    }
    @Test
    public void buyThousand() {
        CashbackHackService4 service4 = new CashbackHackService4();
        int amount = 1000;
        int expected = 0;
        int actual = service4.remain(1000);
        assertEquals(expected,actual);
    }
}