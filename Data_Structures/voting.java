import java.util.*;
public class voting {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you age in Numerical:");
        int n=sc.nextInt();
        if (n<18){
            int d=18-n;
            System.out.println("You are allowed to vote after "+d+" years");

        }
        else{
        System.out.println("Your are eligible");
        }
    }
}
