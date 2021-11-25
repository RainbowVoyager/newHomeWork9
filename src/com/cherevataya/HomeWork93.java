package com.cherevataya;
/*
3*) Написать метод который ищет при помощи бинарного поиска есть ли число в отсортированном массиве.
Входящие параметры: массив и число.
(считаем что массива который нам передали отсортирован, проверять это не нужно)
 */

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork93 {
    public static void main(String args[]) {
        int counter, num, item, array[], first, last;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements of the array: ");
        num = input.nextInt();

        array = new int[num];

        System.out.println("Enter " + num + " the number");

        for (counter = 0; counter < num; counter++)
            array[counter] = input.nextInt();

        Arrays.sort(array);

        System.out.println("Enter an element for binary search: ");
        item = input.nextInt();
        first = 0;
        last = num - 1;

        binarySearch(array, first, last, item);
    }

    public static void binarySearch(int[] array, int first, int last, int item) {
        int position;
        int comparisonCount = 1;

        position = (first + last) / 2;

        while ((array[position] != item) && (first <= last)) {
            comparisonCount++;
            if (array[position] > item) {
                last = position - 1;
            } else {
                first = position + 1;
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println(item + " is an " + ++position + " element in array");
            System.out.println("Binary search method found number after " + comparisonCount +
                    " comparison");
        } else {
            System.out.println("The item was not found in the array. Binary search method exited after "
                    + comparisonCount + " comparison");
        }
    }

}
