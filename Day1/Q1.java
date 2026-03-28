import java .util.*;
public class Q1{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n= 2;
        int mul = 1;
        for(int i = 1 ; i<=n;i++){
           int temp = sc.nextInt();
           mul = mul*temp;
        }
        System.out.println(mul);
    }
}