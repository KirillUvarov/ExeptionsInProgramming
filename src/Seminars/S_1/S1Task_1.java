package Seminars.S_1;

//Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
//Если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки, иначе - длину массива.

import java.util.Arrays;

public class S1Task_1 {
    public static void main(String[] args) {
        int[] array = {0, 1, 2};
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 2;

        }
        System.out.println(Arrays.toString(array));
    }

//    public static int exept (int[] array) {
//        if (!file.exists()){
//            return -1L; //Если файла нет, то возвращает код ошибки "-1"
//        }
//        return array.length();
//
//    }

//}

//package Praktika;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] massiv = new int[2];
//        for (int i = 0; i < massiv.length; i++) {
//            massiv[i] = i +2;
//        }
//        System.out.println(f1(massiv));
//    }
//    public static int f1(int[] massiv){
//        if (massiv.length < 5){
//            return -1;
//        }
//        return massiv.length;
//    }
//
//
//
//
//
}