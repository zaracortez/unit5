package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void remain() {
        int amount = 2000;
        int expected =1000;
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actualCash = cashbackHackService.remain(amount);
        assertEquals(expected,actualCash);

    }
}