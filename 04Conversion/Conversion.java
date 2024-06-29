
import java.lang.System;

public class Conversion {
    public static void main(String[] args) {
        int num1 = 2344;
        long num2 = num1;               // Implicit conversion from int to long
    
        float val1 = 3747.45f;
        double val2 = val1;             // Implicit conversion from float to double
    
        long marks = 34;
        int studentMarks = (int)marks;      // Explicit conversion from long to int - Lossy

        int age = 150;
        byte newAge = (byte)age;             // Explicit conversion from int to byte - Lossy

        System.out.println(num2);
        System.out.println(val2);
        System.out.println(studentMarks);
        System.out.println(newAge);
    }
}
