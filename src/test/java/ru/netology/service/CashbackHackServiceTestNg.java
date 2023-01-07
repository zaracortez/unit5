package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTestNg {


    @Test
    public void adviceToBuyMore() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(900);
        assertEquals(actual, expected);

//    @Test
  //  public void testRemain() {
    }
}