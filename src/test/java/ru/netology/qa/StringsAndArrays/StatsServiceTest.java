package ru.netology.qa.StringsAndArrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void sumSales() {
        StatsService service = new StatsService();
        int[] arr = {8, 15, 13, 15, 17, 21, 19, 20, 7, 14, 14, 18
        };
        int expected = 181;
        int actyal = service.sumSales(arr);
        Assertions.assertEquals(expected, actyal);

    }

    @Test
    public void maxAverageNumberSales() {
        StatsService service = new StatsService();
        int[] arr = {8, 15, 13, 15, 17, 21, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.maxAmount(arr);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void minAverageNumberSales() {
        StatsService service = new StatsService();
        int[] arr = {8, 15, 13, 15, 17, 21, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.minAmount(arr);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void AverageNumberSales() {
        StatsService service = new StatsService();
        int[] arr = {8, 15, 13, 15, 17, 21, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.AverageNumberSales(arr);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void maxMonth() {
        StatsService service = new StatsService();
        int[] arr = {8, 15, 13, 15, 17, 21, 19, 20, 7, 14, 14, 18

        };

        int expected = 6;
        int acttual = service.maxSales(arr);
        Assertions.assertEquals(expected, acttual);
    }

    @Test
    public void minMonth() {
        StatsService service = new StatsService();
        int[] arr = {8, 15, 13, 15, 17, 21, 19, 20, 7, 14, 14, 18

        };

        int expected = 9;
        int acttual = service.minSales(arr);
        Assertions.assertEquals(expected, acttual);


    }

}
