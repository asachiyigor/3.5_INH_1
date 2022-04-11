package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.Repository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ProductManagerTest {
    private Repository repository = new Repository();
    private ProductManager manager = new ProductManager(repository);

    private Product first = new Product(1, "Pen", 1000);
    private Book second = new Book(2, "Alice in Wonderland", 500, "Lewis Carroll");
    private Smartphone third = new Smartphone(3, "8800 Sirocco Edition", 10000, "Nokia");

    @Test
    void shouldAdd() {
        manager.add(first);
        manager.add(second);
        manager.add(third);

        Product[] actual = repository.findAll();
        Product[] expected = {first, second, third};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchByBook() {
        manager.add(second);
        manager.add(first);

        Product[] actual = manager.searchBy("Alice");
        Product[] expected = {second};

        assertArrayEquals(expected, actual);
    }


}