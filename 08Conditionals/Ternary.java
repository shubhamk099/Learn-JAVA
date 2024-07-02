
import java.lang.System;
import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        String result = (age>=18)?("Can Vote"):("Cannot vote");

        System.out.println(result);

        sc.close();
    }
}
