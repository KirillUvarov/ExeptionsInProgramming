package Lections.L_1;

public class Example_1_3 {
    public static void main(String[] args) {
        System.out.println(divide(-10,0));
    }

    public static int divide(int a1, int a2) {
        if (a2 == 0){
            throw new RuntimeException("На ноль делить НЕЛЬЗЯ!!!");
        }
        return a1/a2;

    }
}
