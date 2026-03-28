package Day_13;
import java.util.*;
public class Uppercase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<>();
        list.add("Mit");
        list.add("Sudar");
        list.add("Jam");
        list.add("Shake");
        list.stream()
            .map(String::toUpperCase)
            .forEach(System.out::println);
    }
}
