package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    @Test
    public void addAll() {
        PosterManager afisha = new PosterManager();
        afisha.add("movie 1");
        afisha.add("movie 2");
        afisha.add("movie 3");

        String[] actual = afisha.findAll();
        String[] expected = {"movie 1", "movie 2", "movie 3"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast() {
        PosterManager afisha = new PosterManager();
        afisha.add("movie 1");
        afisha.add("movie 2");
        afisha.add("movie 3");
        afisha.add("movie 4");
        afisha.add("movie 5");
        afisha.add("movie 6");

        String[] actual = afisha.findLast();
        String[] expected = {"movie 6", "movie 5", "movie 4", "movie 3", "movie 2", "movie 1"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastLimit() {
        PosterManager afisha = new PosterManager(3);
        afisha.add("movie 1");
        afisha.add("movie 2");
        afisha.add("movie 3");
        afisha.add("movie 4");
        afisha.add("movie 5");
        afisha.add("movie 6");

        String[] actual = afisha.findLast();
        String[] expected = {"movie 6", "movie 5", "movie 4"};

        Assertions.assertArrayEquals(expected, actual);
    }

}