package Lections.L_2;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class L2_Example_1_1 {
    public static void main(String[] args) {
//        String name = null;
//        System.out.println(name.length()); // NullPointerException: Cannot invoke "String.length()" because "name" is null - строка не имеет символов.

        //Object object = new String("123");
        //File file = (File) object;
        //System.out.println(file); //ClassCastException: class java.lang.String cannot be cast to class java.io.File - Объект String не может быть преобразован в тип File

        //String number = "123fq";
        //int result = Integer.parseInt(number);
        //System.out.println(result); //NumberFormatException: For input string: "123fq" - Строка не может быть преобразована к числу.

        List<Object> emptyList = Collections.emptyList();
        emptyList.add(new Object()); // UnsupportedOperationException - метод .add не поддерживается для объекта emptyList




    }
}
