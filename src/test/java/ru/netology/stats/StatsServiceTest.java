package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test

    void shouldCalculateSum() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        int [] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int expected = 180;
        //вызываем целевой метод теста:
        int actual = service.calculateSum(sales);
        //производим проверку - сравниваем ожидаемый и фактический результаты:
        assertEquals(expected, actual);
    }

    @Test

    void shouldCalculateAverage() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        int [] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int expected = 15;
        //вызываем целевой метод теста:
        int actual = service.calculateAverage(sales);
        //производим проверку - сравниваем ожидаемый и фактический результаты:
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMax() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        int [] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int expected = 8;
        //вызываем целевой метод теста:
        int actual = service.findMax(sales);
        //производим проверку - сравниваем ожидаемый и фактический результаты:
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMin() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        int [] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int expected = 9;
        //вызываем целевой метод теста:
        int actual = service.findMin(sales);
        //производим проверку - сравниваем ожидаемый и фактический результаты:
        assertEquals(expected, actual);
    }


    @Test
    void shouldCalculateMAverage() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        int [] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int expected = 5;
        //вызываем целевой метод теста:
        int actual = service.moreAverage(sales);
        //производим проверку - сравниваем ожидаемый и фактический результаты:
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateLAverage() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        int [] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int expected = 5;
        //вызываем целевой метод теста:
        int actual = service.lessAverage(sales);
        //производим проверку - сравниваем ожидаемый и фактический результаты:
        assertEquals(expected, actual);
    }
}