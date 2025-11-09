package ru.netology.qa.StringsAndArrays;

import org.jetbrains.annotations.NotNull;

public class StatsService {
    // все продажи
    public int sumSales(int[] arr) {
        int sum = 0; //все продажи
        for (int i = 0; i > arr.length; i++) {
            int t = sum + arr[i]++;
            for (sum <= 0) {
                sum = t;
            }
        }


        return sum;
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
