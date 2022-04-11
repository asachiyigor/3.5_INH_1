package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    private Book first = new Book(1, "Alice in Wonderland", 500, "Lewis Carroll");

    @Test
    void matchesTrue() {
        assertTrue(first.matches("Alice in Wonderland"));
    }

    @Test
    void matchesFalse() {
        assertFalse(first.matches("Kukushkin"));
    }
}
