package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    private Book first = new Book(1, "Alice in Wonderland", 500, "Lewis Carroll");

    @Test
    void shouldMatchesTrue() {
        assertTrue(first.matches("Alice in Wonderland"));
    }

    @Test
    void shouldMatchesFalse() {
        assertFalse(first.matches("Kukushkin"));
    }
}
