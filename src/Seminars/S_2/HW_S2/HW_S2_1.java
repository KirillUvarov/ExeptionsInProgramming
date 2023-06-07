package Seminars.S_2.HW_S2;

//1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
// приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.Scanner;

public class HW_S2_1 {
    public static void main(String[] args) {
        scanner();
    }

    public static float scanner () {
        Scanner flt = new Scanner(System.in);
        while (true) {
            String tryFloat = null;
            try {
                System.out.println("Введите вещественное число (не текст!): ");
                tryFloat = flt.nextLine();
                return Float.parseFloat(tryFloat);
            } catch (NumberFormatException e) {
                System.out.println("Введено невещественное число или иные символы.\nИсключение: "+ e.getMessage() + " | "+ e.getClass());
                //System.out.println("Словили исключение - catch exception: " + e.getMessage().getClass().getSimpleName());
            } finally {
                System.out.println("Выполнено \n");
                scanner();
//                flt.close();

            }
        }
    }




}
