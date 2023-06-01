package Seminars.S_1.HW_S1;

//1) Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
public class HW_S1_Task_1 {
    public static void main(String[] args) {

    }

    public void exception1(int num){
        if((num % 2) != 0){
            throw new RuntimeException("Это нечётное число");
        }
    }
}
