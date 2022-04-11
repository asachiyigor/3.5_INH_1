package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    private Smartphone first = new Smartphone(1, "8800", 10000, "Nokia");

    @Test
    void matchesTrue() {
        assertTrue(first.matches("8800"));
    }

    @Test
    void matchesFalse() {
        assertTrue(first.matches("Nokia"));
    }
}
