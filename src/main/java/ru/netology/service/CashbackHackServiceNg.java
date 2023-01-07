package ru.netology.service;
public class CashbackHackServiceNg {
    private final int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }
}
