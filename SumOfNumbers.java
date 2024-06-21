
import java.lang.System;
import java.util.Scanner;

class SumofNumbers{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1,num2,sum;
        System.out.print("Enter the first number : ");
        num1 = s.nextInt();
        System.out.print("Enter the second number : ");
        num2 = s.nextInt();
        sum = num1+num2;
        System.out.println("Sum : " + sum);
        s.close();
    }
}