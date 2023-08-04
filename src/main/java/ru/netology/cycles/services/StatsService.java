package ru.netology.cycles.services;
public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public long sumSales(long[] sales) {
        long wholeSales = 0;
        for (int i = 0; i < sales.length; i++){
            wholeSales += sales[i];
        }
        return wholeSales;
    }

    public long averageSales(long[] sales) {
        long wholeSale = 0;
        for (long sale : sales) {
            wholeSale += sale;
        }
        long averageSales = wholeSale / sales.length;
        return averageSales;
    }

    public int monthMaximumSale(long[] sales) {
        int monthMaximum = 0;
        for (int i = 0;i < sales.length; i++) {
            if (sales[i] >= sales[monthMaximum]){
                monthMaximum = i;
            }
        }
        return monthMaximum + 1;
    }

    public int lessThanAverage(long[] sales) {
        int counter = 0;
        long averageSales = averageSales(sales);
        for (long sale : sales) {
            if (sale < averageSales) {
                counter++;
            }
        }
        return counter;
    }

    public int moreThanAverage(long[] sales) {
        int counter = 0;
        long averageSales = averageSales(sales);
        for (long sale : sales) {
            if (sale > averageSales) {
                counter++;
            }
        }
        return counter;
    }
}
