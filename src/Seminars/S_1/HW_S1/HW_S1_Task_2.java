package Seminars.S_1.HW_S1;

//2) Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый
// элемент которого равен разности элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.

import java.util.Arrays;

public class HW_S1_Task_2 {
    public static void main(String[] args) {
        int arr1[] = {10, 8, 6};
//        int arr2[] = {4, 5, 6};
        int arr2[] = {4, 5, 6, 7};
        arrSum(arr1, arr2);
    }

    public static void arrSum(int[] arr1, int[] arr2) {
        if(arr1.length == arr2.length) {
            int[] arr3 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                int res = arr1[i] - arr2[i];
                arr3[i] = res;
            }
            System.out.println(Arrays.toString(arr3));
        }else {
            throw new RuntimeException("Массивы не равны по длине");
        }
    }
}