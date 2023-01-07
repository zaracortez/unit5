package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTestNg {


    @Test
    public void adviceToBuyMore() {
        CashbackHackServiceNg serviceNg = new CashbackHackServiceNg();
        int amount = 900;
        int expected = 100;
        int actual = serviceNg.remain(900);
        assertEquals(actual, expected);
    }
    @Test
    public void testRemain() {
        CashbackHackServiceNg serviceNg = new CashbackHackServiceNg();
        int amount = 700;
        int expected = 300;
        int actual = serviceNg.remain(700);
        assertEquals(actual, expected);

    }
    @Test
    public void buyNotEqualsBoundary(){
        CashbackHackServiceNg serviceNg = new CashbackHackServiceNg();
        int amount = 1750;
        int expected = 250;
        int actual = serviceNg.remain(1750);
        assertEquals(actual,expected );
    }
    @Test
    public void buyThousand(){
        CashbackHackServiceNg serviceNg = new CashbackHackServiceNg();
        int amount = 1000;
        int expected =0;
        int actual = serviceNg.remain(1000);
        assertEquals(actual,expected);
    }
    @Test
    public void buyEqualsBoundary() {
        CashbackHackServiceNg serviceNg = new CashbackHackServiceNg();
        int amount = 3000;
        int expected = 1000;
        int actual = serviceNg.remain(3000);
        assertEquals(actual, expected);
    }

}