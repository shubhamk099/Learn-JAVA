
import java.util.Scanner;
import java.lang.System;

class Welcome{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("May i Know your name : ");
        String name = s.nextLine();
        System.out.println("Welcome, " + name);
        s.close();
    }
}