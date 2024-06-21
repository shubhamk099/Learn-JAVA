
import java.lang.System;

class BitwiseOperator{
    public static void main(String[] args) {
        int x = -0b1010;
        int z = x>>>1;
        System.out.println(String.format("%s",Integer.toBinaryString(x)));
        System.out.println(String.format("%s",Integer.toBinaryString(z)));
    }
}