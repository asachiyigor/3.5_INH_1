package ru.netology.repository;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {
    private Repository repository = new Repository();

    private Product first = new Product(1, "Pen", 1000);
    private Book second = new Book(2, "Alice in Wonderland", 500, "Lewis Carroll");
    private Smartphone third = new Smartphone(3, "8800 Sirocco Edition", 10000, "Nokia");

    @Test
    void removeById() {
        repository.save(first);
        repository.save(second);
        repository.save(third);

        repository.removeById(2);

        Product[] actual = repository.findAll();
        Product[] expected = {first, third};

        assertArrayEquals(expected, actual);
    }
}