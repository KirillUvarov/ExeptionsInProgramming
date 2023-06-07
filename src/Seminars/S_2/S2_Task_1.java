package Seminars.S_2;

//1.  Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
//        При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//        2.  Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
//        Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
//        должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
//        3.  В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и
//        MyArrayDataException и вывести результат расчета.


import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class S2_Task_1 {
//    public static void main(String[] args) {
//
//}
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, null); // Выкидываем NullPointerException -> Указатель не может указывать на null!
            int[] abc = { 1, 2, 4, 8 };
            abc[4] = 9; // Выкидываем IndexOutOfBoundsException -> Массив выходит за пределы своего размера!
            abc[3] = 9 / 0; // Выкидываем Exception -> Throwable -> Что-то пошло не так...
            System.out.println(Arrays.toString(abc));
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!" + ex);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) throws Exception  {
        System.out.println(a + b);
    }

//    static Random = new Random;
//
//    public static String[][] generateArray() {
//
//        String[][] = new String[4][4];
//    }
//
//abstract class MyException extends Exception{
//    private final int x;
//    private final int y;
//    Float.parseFloat();
//    public MyException(String message, int x, int y) {
//        super(message);
//        this.x = x;
//        this.y = y;
//    }
//
//    public int getX(){
//        return x;
//    }
//
//    public int getY(){
//        return y;
//    }
//
//    class MyArraySizeException(String message, int x, int y){
//
//    }
}