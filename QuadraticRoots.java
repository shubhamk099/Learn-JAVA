
import java.lang.System;
import java.util.Scanner;

class QuadraticRoots{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coefficient of x power 2 : ");
        int a = sc.nextInt();
        System.out.println("Enter the coefficient of x power 1 : ");
        int b = sc.nextInt();
        System.out.println("Enter the coefficient of x power 0 : ");
        int c = sc.nextInt();

        double root1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
        double root2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);

        System.out.println("First root is : " + root1);
        System.out.println("Second root is : " + root2);

        sc.close();
    }
}