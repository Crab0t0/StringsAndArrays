package ru.netology.qa.StringsAndArrays;

import org.jetbrains.annotations.NotNull;

public class StatsService {
    // все продажи
    public int sumSales(int @NotNull [] arr) {
        int summa = 0;
        for (int i = 0; i < arr.length; i++) {
            summa += arr[i];


        }
        return summa;
    }

    // больше среднего
    public int maxAmount(int @NotNull [] arr) {
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > AverageNumberSales(arr)) {
                min++;
            }
        }

        return min;
    }

    // средняя сумма продаж в месяц
    public int AverageNumberSales(int @NotNull [] arr) {
        int total = sumSales(arr) / 12;
        return total;
    }

    // меньше среднего
    public int minAmount(int @NotNull [] arr) {
        int min = 0;
        int total = sumSales(arr) / 12;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < total) {
                min++;
            }
        }

        return min;
    }


    // номер месяца, в котором был максимум продаж
    public int maxSales(int @NotNull [] arr) {
        int maxMonth = 0; // номер месяца с максимальными продажами.

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= arr[maxMonth]) {
                maxMonth = i;
            }

        }
        return maxMonth + 1;

    }

    // номер месяца, в котором был минимум продаж
    public int minSales(int @NotNull [] arr) {
        int minMonth = 0; // номер месяца с мин продажами.

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= arr[minMonth]) {
                minMonth = i;
            }

        }
        return minMonth + 1;

    }


}
