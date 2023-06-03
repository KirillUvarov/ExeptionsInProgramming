package Lections.L_2;

import java.util.Collections;

public class L2_Example_2 {
    public static void main(String[] args) {
        int number = 1;
        try {
            number = 10 / 1;
            String test = null;
            //System.out.println(test.length());
            Collections.emptyList().add(new Object());
        } catch (ArithmeticException e){
            System.out.println("На ноль делить НЕЛЬЗЯ!!! - operation divide by zero not supported");
        } catch (NullPointerException e){
            System.out.println("Объект пуст - nullpointer exception");
        } catch (Exception e){
            System.out.println("Исключение - exception");
        }
        System.out.println(number);

//        System.out.println(divide(10, 0));
    }
//    public static int divide(int a1, int a2) {
//        if (a2 == 0){
//            throw new RuntimeException("На ноль делить НЕЛЬЗЯ!!!");
//        }
//        return a1/a2;
//
//    }
}
