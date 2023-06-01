package Seminars.S_1;

import java.util.Random;

//Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
//        Необходимо посчитать и вернуть сумму элементов этого массива. При этом накладываем на метод 2 ограничения:
//        метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
//        Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
public class S1Task_3 {
    public static void main(String[] args) {
        int [][] array = new int[6][6];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(2);
            }
        }
        f1(array);
    }
// [ [1, 2, 3, 4, 5],
// [1, 2, 3, 4, 5],
// [1, 2, 3, 4, 5],
// [1, 2, 3, 4, 5] ]
    public static int f1(int[][] arr) {
        if (arr.length != arr[0].length){
            throw new RuntimeException("Двумерный массив не является квадратным");
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] != 0 && arr[i][j] != 1)
                    throw new RuntimeException("Значение элемента массива не соответствует условию задачи ");
                sum = sum + arr[i][j];
                System.out.print(arr[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print(sum);
        return sum;
    }
}
