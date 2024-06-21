
import java.lang.System;
import java.util.Scanner;


class AreaOfTriangle1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of triangle : ");
        float height = sc.nextFloat();
        System.out.println("Enter the base of triangle : ");
        float base = sc.nextFloat();

        float area = 0.5f*base*height;

        System.out.println("Area of triangle is : " + area);
        sc.close();
    }
}
