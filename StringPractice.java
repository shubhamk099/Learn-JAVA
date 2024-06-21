
import java.lang.System;
import java.lang.String;

class StringPractice{
    public static void main(String args[]){
        String str1 = "Java";
        System.out.println(str1);

        String str2 = new String("Java");
        System.out.println(str2);

        System.out.println(str1==str2);

        char letters[] = {'A','B','C','D'};
        String str3 = new String(letters);
        System.out.println(str3);

        byte alpha[] ={65,66,67,68,69};
        String str4 = new String(alpha);
        System.out.println(str4);
    }
}