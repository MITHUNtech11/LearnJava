package Data_Structures;

import java.util.HashMap;

public class string {
    public static void main(String[] args){
        String s="apple banana apple";
        String[] words=s.split(" ");
        HashMap<String,Integer> map=new HashMap<>();
        for(String word:words){
            if(map.containsKey(word)){
                map.put(word,map.get(word)+1);
            }
            else{
                map.put(word,1);
            }
        }
        System.out.println(map);
    }
}
