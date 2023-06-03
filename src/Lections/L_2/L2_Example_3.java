package Lections.L_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class L2_Example_3 {
    public static void main(String[] args) throws IOException {
        FileReader test = null;
        try {
//             test = new FileReader(new File("test"));
            test = new FileReader(new File("src/123.txt"));
//             test.read();

        } catch (RuntimeException | IOException e) {
            System.out.println("Словили исключение - catch exception: " + e.getClass().getSimpleName());
        } finally {
            System.out.println("Файл закрывается - finally start");
            if (test != null){
                try {
                    test.close();
                } catch (IOException e) {
                    System.out.println("Файла не закрыт - exception while close");
                }
            }
            System.out.println("Файл закрыт - finally finished");
        }
    }
}
