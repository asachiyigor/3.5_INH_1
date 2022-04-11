package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    private Smartphone first = new Smartphone(1, "8800", 10000, "Nokia");

    @Test
    void shouldMatchesTrue() {
        assertTrue(first.matches("8800"));
    }

    @Test
    void shouldMatchesFalse() {
        assertTrue(first.matches("Nokia"));
    }
}
