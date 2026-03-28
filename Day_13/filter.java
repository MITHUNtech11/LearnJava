package Day_13;
import java.util.*;
public class filter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> List= Arrays.asList(1,2,3,4,5);
        int result=List.stream()
                        .filter(x-> x%2==0)
                        .map(x->x*x)
                        .reduce(0,Integer::Sum);
        System.out.println(result);
    }
}
