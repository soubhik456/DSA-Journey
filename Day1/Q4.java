
import java.util.Scanner;

public class Q4{
    // simple interest
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int amount = sc.nextInt();
        float interests = sc.nextFloat();
        int year = sc.nextInt();
        float SI = sp(amount, interests, year);
        System.out.println(SI);

    }
    public static float sp(int amount , float interest, int year){
        float SI = (amount * interest * year)/100;
        return SI;
    }
}