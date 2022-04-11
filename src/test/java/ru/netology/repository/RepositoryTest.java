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
    private Smartphone fourth = new Smartphone(3, "6610", 10000, "Nokia");

    @Test
        // Задание 1. NotFoundException (обязательное к выполнению)
    void shouldRemoveById() { // первый должен проверять успешность удаления существующего элемента
        repository.save(first);
        repository.save(second);
        repository.save(third);

        repository.removeById(2);

        Product[] actual = repository.findAll();
        Product[] expected = {first, third};

        assertArrayEquals(expected, actual);
    }

    @Test
        // Задание 1. NotFoundException (обязательное к выполнению)
    void shouldGenerateNotFoundException() { // второй - генерации NotFoundException при попытке удаления несуществующего элемента
        repository.save(first);
        repository.save(second);
        repository.save(third);

        repository.removeById(2);

        assertThrows(NotFoundException.class, () -> {
            repository.removeById(2);
        });
    }

    @Test
        //Задание 2*. AlreadyExistsException (НЕобязательная задача)
    void shouldAddNewProduct() { // первый должен проверять успешность добавления элемента
        repository.save(first);
        repository.save(second);
        repository.save(third);

        Product[] actual = repository.findAll();
        Product[] expected = {first, second, third};

        assertArrayEquals(expected, actual);
    }

    @Test
        //Задание 2*. AlreadyExistsException (НЕобязательная задача)
    void shouldGenerateAlreadyExistsException() { // второй - генерации AlreadyExistsException при попытке добавить элемент с повторяющимся id.
        repository.save(first);
        repository.save(second);
        repository.save(third);

        assertThrows(AlreadyExistsException.class, () -> {
            repository.save(fourth);
        });
    }
}
