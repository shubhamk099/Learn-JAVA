
import java.lang.System;
import java.util.Scanner;

public class IfElse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = sc.nextInt();

        if(age>=18)
            System.out.println("Yes, you can vote.");
        else
            System.out.println("You cannot vote.");
        sc.close();
    }
}