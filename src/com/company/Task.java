package com.company;

import java.util.Random;

public class Task {

    /**
     * Задание 1: Написать программу
     * <p>
     * p.s. больше никаких требований, поэтому можно просто внутри main написать весь код
     * <p>
     * выбрал пункт 5 (у вас его нет)
     * 5) выводящую на экран случайно сгенерированное целое число от -555 до 555 и сумму его
     * цифр
     */
    public static void main(String[] args) {
        //генерируем число от -555 до 555
        int randomNumber = new Random().nextInt(1111) - 555;
        System.out.println("random number = " + randomNumber);
        //конвертируем в положительное число
        if (randomNumber < 0) {
            randomNumber = -randomNumber;
        }
        //считаем сумму его цифр
        int sum = 0;
        do {
            sum += randomNumber % 10;
            randomNumber /= 10;
        }
        while (randomNumber != 0);
        System.out.println("sum = " + sum);
    }
}
