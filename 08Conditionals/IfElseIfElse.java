
import java.lang.System;
import java.util.Scanner;

public class IfElseIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        if(age>=50){
            System.out.println("Senior Citizen");
        }
        else if(age>=30){
            System.out.println("Mature Adults");
        }
        else if(age>=18){
            System.out.println("Young Adults");
        }
        else{
            System.out.println("Underage");
        }
        
        sc.close();
    }
}
