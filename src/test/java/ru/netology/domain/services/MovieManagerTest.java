package ru.netology.domain.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class MovieManagerTest {

    MovieManager manager = new MovieManager();

    // Добавление нового фильма и вывод всех фильмов в порядке добвления
    @Test
    void addNewMovieZero() {  // добавили 0 фильмов
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void addNewMovieOne() {  // добавили 1 фильм
        manager.addMovie("Бладшот");

        String[] expected = {"Бладшот"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void addNewMovieTwo() {  // добавили 2 фильма
        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");

        String[] expected = {"Бладшот", "Вперед"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void addNewMovieFour() {  // добавили 4 фильма
        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");

        String[] expected = {"Бладшот", "Вперед", "Отель Белград", "Джентельмены"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    void addNewMovieFive() {  // добавили 5 фильмов
        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек-невидимка");

        String[] expected = {"Бладшот", "Вперед", "Отель Белград", "Джентельмены", "Человек-невидимка"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void addNewMovieSix() {  // добавили 6 фильмов
        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Тролли. Мировой тур");

        String[] expected = {"Бладшот", "Вперед", "Отель Белград", "Джентельмены", "Человек-невидимка", "Тролли. Мировой тур"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    // Вывод последних пяти добавленных фильмов
    @Test
    void addNewMovieZeroLast() {  // добавили 0 фильмов
        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void addNewMovieOneLast() {  // добавили 1 фильм
        manager.addMovie("Бладшот");

        String[] expected = {"Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void addNewMovieTwoLast() {  // добавили 2 фильма
        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");

        String[] expected = {"Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void addNewMovieFourLast() {  // добавили 4 фильма
        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентльмены");

        String[] expected = {"Джентльмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    void addNewMovieFiveLast() {  // добавили 5 фильмов
        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентльмены");
        manager.addMovie("Человек-невидимка");

        String[] expected = {"Человек-невидимка", "Джентльмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void addNewMovieSixLast() {  // добавили 6 фильмов
        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентльмены");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Тролли. Мировой тур");

        String[] expected = {"Тролли. Мировой тур", "Человек-невидимка", "Джентльмены", "Отель Белград", "Вперед"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

// Вывод последних фильмов в обратном порядке по пользовательскому лимиту пример 7

    MovieManager managerCustom = new MovieManager(7);

    @Test
    void addNewMovieZeroLastCustom() {  // добавили 0 фильмов
        String[] expected = {};
        String[] actual = managerCustom.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void addNewMovieOneLastCustom() {  // добавили 1 фильм
        managerCustom.addMovie("Бладшот");

        String[] expected = {"Бладшот"};
        String[] actual = managerCustom.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void addNewMovieTwoLastCustom() {  // добавили 2 фильма
        managerCustom.addMovie("Бладшот");
        managerCustom.addMovie("Вперед");

        String[] expected = {"Вперед", "Бладшот"};
        String[] actual = managerCustom.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void addNewMovieThreeLastCustom() {  // добавили 2 фильма
        managerCustom.addMovie("Бладшот");
        managerCustom.addMovie("Вперед");
        managerCustom.addMovie("Отель Белград");

        String[] expected = {"Отель Белград", "Вперед", "Бладшот"};
        String[] actual = managerCustom.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void addNewMovieFourLastCustom() {  // добавили 4 фильма
        managerCustom.addMovie("Бладшот");
        managerCustom.addMovie("Вперед");
        managerCustom.addMovie("Отель Белград");
        managerCustom.addMovie("Джентльмены");

        String[] expected = {"Джентльмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = managerCustom.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void addNewMovieFiveLastCustom() {  // добавили 5 фильмов
        managerCustom.addMovie("Бладшот");
        managerCustom.addMovie("Вперед");
        managerCustom.addMovie("Отель Белград");
        managerCustom.addMovie("Джентльмены");
        managerCustom.addMovie("Человек-невидимка");

        String[] expected = {"Человек-невидимка", "Джентльмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = managerCustom.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void addNewMovieSixLastCustom() {  // добавили 6 фильмов
        managerCustom.addMovie("Бладшот");
        managerCustom.addMovie("Вперед");
        managerCustom.addMovie("Отель Белград");
        managerCustom.addMovie("Джентльмены");
        managerCustom.addMovie("Человек-невидимка");
        managerCustom.addMovie("Тролли. Мировой тур");

        String[] expected = {"Тролли. Мировой тур", "Человек-невидимка", "Джентльмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = managerCustom.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void addNewMovieSevenLastCustom() {  // добавили 7 фильмов
        managerCustom.addMovie("Бладшот");
        managerCustom.addMovie("Вперед");
        managerCustom.addMovie("Отель Белград");
        managerCustom.addMovie("Джентльмены");
        managerCustom.addMovie("Человек-невидимка");
        managerCustom.addMovie("Тролли. Мировой тур");
        managerCustom.addMovie("Номер один");

        String[] expected = {"Номер один", "Тролли. Мировой тур", "Человек-невидимка", "Джентльмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = managerCustom.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void addNewMovieEightLastCustom() {  // добавили 8 фильмов
        managerCustom.addMovie("Бладшот");
        managerCustom.addMovie("Вперед");
        managerCustom.addMovie("Отель Белград");
        managerCustom.addMovie("Джентльмены");
        managerCustom.addMovie("Человек-невидимка");
        managerCustom.addMovie("Тролли. Мировой тур");
        managerCustom.addMovie("Номер один");
        managerCustom.addMovie("Аватар");

        String[] expected = {"Аватар", "Номер один", "Тролли. Мировой тур", "Человек-невидимка", "Джентльмены", "Отель Белград", "Вперед"};
        String[] actual = managerCustom.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
