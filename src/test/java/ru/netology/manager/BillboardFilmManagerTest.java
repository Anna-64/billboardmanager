package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.BillboardFilm;

import static org.junit.jupiter.api.Assertions.*;

class BillboardFilmManagerTest {

    @Test
    void getAllMaximum() {
        BillboardFilm first = new BillboardFilm(1, 1, "first", "drama", 1);
        BillboardFilm second = new BillboardFilm(2, 2, "second", "thriller", 2);
        BillboardFilm third = new BillboardFilm(3, 3, "third", "comedy", 3);
        BillboardFilm fourth = new BillboardFilm(4, 4, "fourth", "cartoon", 4);
        BillboardFilm fifth = new BillboardFilm(5, 5, "fifth", "thriller", 5);
        BillboardFilm six = new BillboardFilm(6, 6, "six", "comedy", 6);
        BillboardFilm seven = new BillboardFilm(7, 7, "seven", "thriller", 7);
        BillboardFilm eight = new BillboardFilm(8, 8, "eight", "cartoon", 8);
        BillboardFilm nine = new BillboardFilm(9, 9, "nine", "comedy", 9);
        BillboardFilm ten = new BillboardFilm(10, 10, "ten", "thriller", 10);
        BillboardFilm eleven = new BillboardFilm(11, 11, "eleven", "cartoon", 11);
        BillboardFilm twelve = new BillboardFilm(12, 12, "twelve", "thriller", 12);

        BillboardFilmManager manager = new BillboardFilmManager();

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(six);
        manager.save(seven);
        manager.save(eight);
        manager.save(nine);
        manager.save(ten);
        manager.save(eleven);
        manager.save(twelve);

        BillboardFilm[] expected = {twelve, eleven, ten, nine, eight, seven, six, fifth, fourth, third};
        BillboardFilm[] actual = manager.getAll();

        assertArrayEquals(expected, actual);

    }


    @Test
    void getAllMaximum2() {
        BillboardFilm first = new BillboardFilm(1, 1, "first", "thriller", 2);
        BillboardFilm second = new BillboardFilm(2, 2, "second", "comedy", 1);
        BillboardFilm third = new BillboardFilm(3, 3, "third", "drama", 3);
        BillboardFilm fourth = new BillboardFilm(4, 4, "fourth", "comedy", 4);
        BillboardFilm six = new BillboardFilm(5, 5, "frank", "cartoon", 1);
        BillboardFilm seven = new BillboardFilm(7, 7, "seven", "drama", 7);
        BillboardFilm eight = new BillboardFilm(8, 8, "eight", "comedy", 8);
        BillboardFilm nine = new BillboardFilm(9, 9, "nine", "thriller", 9);
        BillboardFilm ten = new BillboardFilm(10, 10, "ten", "cartoon", 10);
        BillboardFilm eleven = new BillboardFilm(11, 11, "eleven", "thriller", 11);
        BillboardFilm twelve = new BillboardFilm(12, 12, "twelve", "drama", 12);

        BillboardFilmManager manager = new BillboardFilmManager(4);
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(six);
        manager.save(seven);
        manager.save(eight);
        manager.save(nine);
        manager.save(ten);
        manager.save(eleven);
        manager.save(twelve);

        BillboardFilm[] expected1 = {twelve, eleven, ten, nine};
        BillboardFilm[] actual1 = manager.getAll();

        assertArrayEquals(expected1, actual1);
    }


    @Test
    void save() {
        BillboardFilm first = new BillboardFilm(1, 1, "first", "drama", 2);
        BillboardFilm second = new BillboardFilm(2, 2, "second", "thriller", 1);
        BillboardFilm third = new BillboardFilm(3, 3, "third", "comedy", 3);
        BillboardFilm fourth = new BillboardFilm(4, 4, "fourth", "cartoon", 4);


        BillboardFilmManager manager = new BillboardFilmManager();
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);


        BillboardFilm[] expected = {first, second, third, fourth};
        BillboardFilm[] actual = manager.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    void save2() {
        BillboardFilm first = new BillboardFilm(1, 1, "first", "thriller", 2);
        BillboardFilm second = new BillboardFilm(2, 2, "second", "comedy", 1);
        BillboardFilm seven = new BillboardFilm(7, 7, "seven", "drama", 7);
        BillboardFilm eight = new BillboardFilm(8, 8, "eight", "cartoon", 8);
        BillboardFilm nine = new BillboardFilm(9, 9, "nine", "comedy", 9);


        BillboardFilmManager manager = new BillboardFilmManager();
        manager.save(first);
        manager.save(second);
        manager.save(seven);
        manager.save(eight);
        manager.save(nine);


        BillboardFilm[] expected = {first, second, seven, eight, nine};
        BillboardFilm[] actual = manager.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    void findAll() {
        BillboardFilm first = new BillboardFilm(1, 1, "first", "comedy", 1);
        BillboardFilm seven = new BillboardFilm(7, 7, "seven", "thriller", 7);
        BillboardFilm nine = new BillboardFilm(9, 9, "nine", "drama", 9);
        BillboardFilm ten = new BillboardFilm(10, 10, "ten", "thriller", 10);
        BillboardFilm eleven = new BillboardFilm(11, 11, "eleven", "drama", 11);
        BillboardFilm twelve = new BillboardFilm(12, 12, "twelve", "comedy", 12);

        BillboardFilmManager manager = new BillboardFilmManager();


        BillboardFilm[] expected = {};
        BillboardFilm[] actual = manager.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    void findAll2() {
        BillboardFilm first = new BillboardFilm(1, 1, "first", "drama", 2);
        BillboardFilm second = new BillboardFilm(2, 2, "second", "cartoon", 1);
        BillboardFilm third = new BillboardFilm(3, 3, "third", "comedy", 3);
        BillboardFilm fourth = new BillboardFilm(4, 4, "fourth", "thriller", 4);
        BillboardFilm fifth = new BillboardFilm(5, 5, "fifth", "comedy", 5);


        BillboardFilmManager manager = new BillboardFilmManager();
        manager.save(first);
        manager.save(second);
        manager.save(third);


        BillboardFilm[] expected = {first, second, third};
        BillboardFilm[] actual = manager.findAll();

        assertArrayEquals(expected, actual);

    }
}



