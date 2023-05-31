package Lections.L_1;

import java.io.File;

public class Example_1_1 {
    public static void main(String[] args) {
        //System.out.println(getFileLength(new File("C:\\JAVA\\Program\\MistakesAndExeption\\src\\123.txt"))); //Возвращает вес файла
        System.out.println(divide(-10,0)); //Вызываем функцию деления и в аргументы вписываем 0, как делитель
    }

    public static int divide(int a1, int a2) {
        if (a2 == 0){
            return -1;
        }
        return a1/a2;

    }

    public static long getFileLength(File file) {
        if (!file.exists()){
            return -1L; //Если файла нет, то возвращает код ошибки "-1"
        }
        return file.length();

    }

}
