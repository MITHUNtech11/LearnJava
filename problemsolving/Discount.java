package problemsolving;
import java.util.*;
public class Discount {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double amount=sc.nextDouble();
        int discount=0;
        if(amount<1000){
            discount=5;
        }
        else if(amount<=5000){
            discount=10;
        }
        else{
            discount=15;
        }
        double finalAmount=amount-(amount*discount/100);
        System.out.printf("%.2f%n",finalAmount);
    }
}
