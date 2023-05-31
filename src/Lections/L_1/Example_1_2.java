package Lections.L_1;

public class Example_1_2 {

    public static void main(String[] args) {
//        int[] ints = new int[10];
//        System.out.println(ints[1000]);
        a();
    }

    public static void a() {
        b();
    }
    public static void b() {
        c();
    }
    public static void c() {
        int[] ints = new int[10];
        System.out.println(ints[1000]);
    }
}
