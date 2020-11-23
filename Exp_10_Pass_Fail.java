 import java.util.Scanner;

public class Exp_10_Pass_Fail {
    
    public static void main(String args[]){
       int n;
       Scanner reader = new Scanner(System.in);
        System.out.println("Enter marks: ");
         n = reader.nextInt();

        if (n>40){

           System.out.println("Pass");
       }
        else
       System.out.println("Fail"); 
    }
}
