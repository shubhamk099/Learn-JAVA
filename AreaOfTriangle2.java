
import java.lang.System;
import java.util.Scanner;

class AreaOfTriangle2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of side A : ");
        int a = sc.nextInt();
        System.out.println("Enter the length of side B : ");
        int b = sc.nextInt();
        System.out.println("Enter the length of side C : ");
        int c = sc.nextInt();

        float s = (a+b+c)/2f;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("Area of triangle is : " + area);
        sc.close();
    }
}