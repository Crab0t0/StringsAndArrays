package ru.netology.qa.StringsAndArrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void sumSales() {
        StatsService service = new StatsService();
        long[] arr = {8, 15, 13, 15, 17, 21, 19, 20, 7, 14, 14, 18
        };
        long expected = 181;
        long actyal = service.sumSales(arr);
        Assertions.assertEquals(expected, actyal);

    }

    @Test
    public void maxAverageNumberSales() {
        StatsService service = new StatsService();
        long[] arr = {8, 15, 13, 15, 17, 21, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.maxAmount(arr);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void minAverageNumberSales() {
        StatsService service = new StatsService();
        long[] arr = {8, 15, 13, 15, 17, 21, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.minAmount(arr);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void AverageNumberSales() {
        StatsService service = new StatsService();
        long[] arr = {8, 15, 13, 15, 17, 21, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.AverageNumberSales(arr);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void maxMonth() {
        StatsService service = new StatsService();
        long[] arr = {8, 15, 13, 15, 17, 21, 19, 20, 7, 14, 14, 18

        };

        long expected = 6;
        long acttual = service.maxSales(arr);
        Assertions.assertEquals(expected, acttual);
    }

    @Test
    public void minMonth() {
        StatsService service = new StatsService();
        long[] arr = {8, 15, 13, 15, 17, 21, 19, 20, 7, 14, 14, 18

        };

        long expected = 9;
        long acttual = service.minSales(arr);
        Assertions.assertEquals(expected, acttual);


    }

}
