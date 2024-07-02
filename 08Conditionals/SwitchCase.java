
import java.lang.System;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day number : ");
        int dayNumber = sc.nextInt();

        switch (dayNumber) {            // takes primitive + string 
            case 0:
                System.out.println("Sunday");
                break;
            
            case 1:                      // can write multiple cases together ( case 1:case 2:)
                System.out.println("Monday");   
                break;
            
            case 2:
                System.out.println("Tuesday");
                break;
            
            case 3:
                System.out.println("Wednesday");
                break;
            
            case 4:
                System.out.println("Thrusday");
                break;
            
            case 5:
                System.out.println("Friday");
                break;
            
            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid Input");
                break;
        }

        sc.close();
    }
}
