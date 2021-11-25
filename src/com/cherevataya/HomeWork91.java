package com.cherevataya;

import java.util.Random;

/*
1) В банк положили s денег. Какой станет сумма вклада через n лет,
если процент 1,5% добавляется к сумме вклада ежемесячно.
Написать метод который принимает 2 параметра - s, n и возвращает сумму денег на счету.
 */
public class HomeWork91 {
    public static void main(String[] args) {
        float deposit = RANDOM.nextInt(1000);
        System.out.println("Initial contribution is " + deposit);
        int years = RANDOM.nextInt(100);
        for (int i = 0; i < years * 12; i++) {
            deposit += interest(deposit);
        }
        System.out.printf("For " + years + " years");
        System.out.println();
        System.out.printf("The amount of money in the account is %f\n", deposit);
    }

    private static long interest(float deposit) {
        float interest = (float) (deposit * 0.015);
        long result = (long) (Math.round(interest));
        return result;
    }

    private static final Random RANDOM = new Random();


}
