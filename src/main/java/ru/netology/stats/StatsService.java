package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }


    public int calculateMiddleSum(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int calculateMonthMaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int calculateMonthMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int calculateCountMonthSalesBelowMiddleSale(int[] sales) {
        int counter = 0;
        int middleSale = calculateSum(sales) / sales.length;
        for (int sale : sales) {
            if (sale < middleSale) {
                counter++;
            }
        }
        return counter;
    }

    public int calculateCountMonthSalesAboveMiddleSale(int[] sales) {
        int counter = 0;
        int middleSale = calculateSum(sales) / sales.length;
        for (int sale : sales) {
            if (sale > middleSale) {
                counter++;
            }
        }
        return counter;
    }
}
