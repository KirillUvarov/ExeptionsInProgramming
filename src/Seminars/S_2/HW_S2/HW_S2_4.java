package Seminars.S_2.HW_S2;

//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class HW_S2_4 {
    public static void main(String[] args) {
        scanner();
    }

    public static String scanner () {
        Scanner str = new Scanner(System.in);
        System.out.println("Введите хоть что-то: ");
        String tryString = str.nextLine();
        while (true) {
            try {
                //System.out.println(tryString.length());
                float res = (int) 1 / tryString.length();
            } catch (RuntimeException e) {
                System.out.println("Вы не ввели ни одно символа!!! Исключение: "+ e.getMessage() + " | "+ e.getClass());
            } finally {
                System.out.println("Выполнено \n");
                scanner();
//                str.close();

            }
        }
    }
}
