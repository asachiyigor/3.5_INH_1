package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    private Product first = new Product(1, "Pen", 1000);

    @Test
    void shouldMatchesTrue() {
        assertTrue(first.matches("Pen"));
    }
}