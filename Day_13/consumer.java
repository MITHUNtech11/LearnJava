package Day_13;
import java.util.*;
public class consumer {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        int result=list.stream()
                        .reduce(0,(a,b)->a+b);
        System.out.println(result);
    }
}
