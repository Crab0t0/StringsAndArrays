package ru.netology.qa.StringsAndArrays;

import org.jetbrains.annotations.NotNull;

public class StatsService {
    // все продажи
    public long sumSales(long @NotNull [] arr) {
        long summa = 0;
        for (int i = 0; i < arr.length; i++) {
            summa += arr[i];


        }
        return summa;
    }

    // больше среднего
    public long maxAmount(long @NotNull [] arr) {
        long min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > AverageNumberSales(arr)) {
                min++;
            }
        }

        return min;
    }

    // средняя сумма продаж в месяц
    public long AverageNumberSales(long @NotNull [] arr) {
        long total = sumSales(arr) / 12;
        return total;
    }

    // меньше среднего
    public long minAmount(long @NotNull [] arr) {
        long min = 0;
        long total = sumSales(arr) / 12;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < total) {
                min++;
            }
        }

        return min;
    }


    // номер месяца, в котором был максимум продаж
    public long maxSales(long @NotNull [] arr) {
        int maxMonth = 0; // номер месяца с максимальными продажами.

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= arr[maxMonth]) {
                maxMonth = i;
            }

        }
        return maxMonth + 1;

    }

    // номер месяца, в котором был минимум продаж
    public long minSales(long @NotNull [] arr) {
        int minMonth = 0; // номер месяца с мин продажами.

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= arr[minMonth]) {
                minMonth = i;
            }

        }
        return minMonth + 1;

    }


}
