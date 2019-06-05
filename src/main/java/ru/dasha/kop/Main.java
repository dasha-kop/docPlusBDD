package ru.dasha.kop;

import java.util.Scanner;

public class Main {

    private static final int RELOAD = 99;
    private static final int ONE = 1;
    private static final int REBOOT = 1;
    private static final int HEAD = 1;
    private static final int BACK = 2;

    public static void main(String[] args) {
        BackHealth backHealth = new BackHealth();
        HeadHealth headHealth = new HeadHealth();
        Therapist therapist;

        headHealth.welcome();

        while (true) {
            headHealth.printTitle();
            backHealth.printTitle();

            System.out.println("Введи номер, что бы проконсультироваться по определенной части тела:");
            int num = getInput();
            System.out.println("Какие у вас симптомы? \n Что бы вернуться назад введите " +
                    "99");
            switch (num) {
                case HEAD:
                    therapist = new Therapist(headHealth);
                    break;
                case BACK:
                    therapist = new Therapist(backHealth);
                    break;
                case RELOAD:
                    continue;
                default:
                    System.out.println("Введите правильное число");
                    continue;
            }
            therapist.printQuestions();
            while (true) {
                num = getInput();
                if (num == RELOAD) {
                    break;
                } else if (num <= therapist.getCount()) {
                    therapist.getAnswer(num - ONE);
                }
                break;
            }
            System.out.println("Еще раз 1/0");
            num = getInput();
            if (num == REBOOT) {
                continue;
            }
            return;
        }
    }

    private static int getInput() {
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                String str = in.next();
                return Integer.valueOf(str);
            } catch (NumberFormatException ex) {
                System.out.println("Попробуем еще разочек");
            }
        }
    }
}
