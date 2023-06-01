package Seminars.S_1.HW_S1;

import java.io.File;

import static java.lang.Character.getName;

//1) Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
public class HW_S1_Task_1 {
    public static void main(String[] args) {
        //exception1(21);
        //exception2("Прикол");
        isSimple(4);
    }
    public static void exception1(int num){
        if((num % 2) != 0){
            throw new RuntimeException("Это нечётное число");
        }
    }

    public static void exception2(String wordFiveletters){
        for (int i = 0; i < wordFiveletters.length(); i++) {
            if(wordFiveletters.length() != 5) {
                throw new RuntimeException("Это слово состоит не из 5 букв");
            }
        }
    }

    public static void isSimple(int num) {
        for (int i = 2; i < num -1 ; i++) {
            if (num % i == 0){
                throw new RuntimeException("Число не является простым");
            }
        }
    }
}
