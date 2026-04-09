package problemsolving;
import java.util.*;
public class sumofcubes {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=0;
        for(int i=a;i<=b;i++){
            sum+=i*i*i;
        }
        System.out.println(sum);
    }
}

//given 2 integers a and b your task is to determine the sum of all the cubes of all numbers in the range of a-b
// a=4
// b=9
// out=1989