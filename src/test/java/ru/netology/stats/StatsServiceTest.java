package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSum(managerSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAvg() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.findAvg(managerSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthMax() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 21, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.findMonthMax(managerSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthMin() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 21, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.findMonthMin(managerSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindBelowAvg() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 21, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.findMonthBelowAvg(managerSales);
        assertEquals(expected, actual);
    }

    @Test
     void shouldFindAboveAvg() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 21, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.findMonthAboveAvg(managerSales);
        assertEquals(expected, actual);
    }
}