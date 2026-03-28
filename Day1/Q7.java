
import java.util.Scanner;

public class Q7{
   // max between two numbers
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       int num1  = sc.nextInt();
       int num2 = sc.nextInt();
       max(num1, num2);

    }
    public static  void max(int num1 , int num2){
        
        if(num1>num2){
            System.out.println(" num1 is big than num2");
        }
        else{
            System.out.println("num2 is bigger than num1");
        }
    }
}