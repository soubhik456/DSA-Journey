
import java.util.Scanner;

public class Q6{
    //prime or not
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      boolean res  = prime(num);
      if(res){
        System.err.println("prime");
      }  
      else{
        System.out.println("not prime");
      }
    }
    public static boolean prime(int num){
        for(int i = 2;i<num;i++){
            if(num%i == 0){
              return false;
            }
        }
        return true;
    }
}