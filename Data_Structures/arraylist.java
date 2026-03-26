package Data_Structures;
import java.util.*;
public class arraylist {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Final List: "+ list);
        list.remove(1);
        System.out.println("First Index: "+list.get(1));
        System.out.println("Size: "+list.size());
        System.out.println("Contains 10: "+list.contains(10));
        Collections.sort(list);
        System.out.println("Final List: "+ list);
    }
}