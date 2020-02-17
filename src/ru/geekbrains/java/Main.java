package ru.geekbrains.java;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
//Задание 3
    public static void main(String[] args) {
        System.out.println("Угадай число с трёх раз!");
        int range = 9;
        int number = (int) (Math.random() * range);
        playLevel(number);
        scanner.close();
    }
    private static void playLevel(int number) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Угадай число от 0 до 9");
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("Вы угадали.");
                break;
            } else if (i == 2) {
                System.out.println("Количество попыток закончилось. Вы не угадали.");
            } else if (input_number > number) {
                System.out.println("Число меньше.");
            } else {
                System.out.println("Число больше.");
            }
        }
    }
}