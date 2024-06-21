
import java.lang.System;
import java.util.Scanner;

class Cuboid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of cuboid : ");
        int length = sc.nextInt();
        System.out.println("Enter the bredth of cuboid : ");
        int bredth = sc.nextInt();
        System.out.println("Enter the height of cuboid : ");
        int height = sc.nextInt();

        int frontOrBackArea = length*height;
        int leftOrRightArea = bredth*height;
        int bottomOrTopArea = length*bredth;

        System.out.println("Front or Back area : " + frontOrBackArea);
        System.err.println("Left or Right area : " + leftOrRightArea);
        System.out.println("Bottom or Top area : " + bottomOrTopArea);

        int totalArea = 2*(frontOrBackArea + leftOrRightArea + bottomOrTopArea);
        System.out.println("Total Area of cuboid : " + totalArea);

        int volume = (length*bredth*height);
        System.out.println("Volume of cuboid : " + volume);
        
        sc.close();
    }
}