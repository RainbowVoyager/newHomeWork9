package com.cherevataya;

/*
2) Реализовать метод который вернет строку String, в которой через пробел все числа от 1 до 99 со следующими изменениями:
(!!!Сам метод не должен ничего печатать в консоль, он просто должен вернуть строку!!!)
- если число кратно 3 то вывести вместо него Hello
- если число кратно 5 то вывести вместо него World
- если число кратно и 3 и 5 то вывести вместо него HelloWorld
 */
public class Main {

    public static void main(String[] args) {
        helloWorld();
    }

    private static void helloWorld() {
        for (int i = 1; i <= 99; i++) {
            if ((i % 5 != 0) && (i % 3 != 0)) {
                System.out.print(i + " ");
            } else {
                if (i % 5 == 0) {
                    System.out.print("Hello" + " ");
                }
                if (i % 3 == 0) {
                    System.out.print("World" + " ");
                }
                if (i % 5 == 0 && i % 3 == 0) {
                    System.out.print("Hello World" + " ");
                }
            }
        }
    }
}