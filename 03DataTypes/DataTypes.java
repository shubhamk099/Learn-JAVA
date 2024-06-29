
import java.lang.System;

public class DataTypes{
    public static void main(String[] args) {
        byte by1 = 14;          // byte (1byte) - default(0) :  [-128, 127]
        short s1 = 384;         // short (2bytes) - default(0) :  [-32768, 32767]
        int n1 = 373;           // int (4bytes) - default(0)  : [-2147483648, 2147483647]
        long l1 = 36535353l;     // long (8bytes) - default(0l) : Very long integers
        float f1 = 374.45f;      // float (4bytes) - default(0f) : 6-7 decimal digits
        double d1 = 37378.377d;  // double (8bytes) - default(0d) : 15 decimal digits
        boolean bo1 = true;      // boolean (1bit) - default(false)  : true/false
        char c1 = 'A';           // char (2bytes) - default('\u0000') : Unicode + ASCII

        System.out.println(by1);
        System.out.println(s1);
        System.out.println(n1);
        System.out.println(l1);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(bo1);
        System.out.println(c1);
    }
}

// These are all primitive data types
// By default integers are (int) and floating points are (double)