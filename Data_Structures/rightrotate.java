package Data_Structures;

import java.util.ArrayList;

public class rightrotate {
    public static void main(String[] args){
        ArrayList<Integer> List= new ArrayList<>();
        List.add(1);List.add(2);List.add(3);List.add(4);List.add(5);
        int k=2;
        for(int i=0;i<k;i++){
            int first=List.remove(0);
            List.add(first);
        }
        System.out.println(List);
    }
}
