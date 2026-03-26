package Data_Structures;

import java.util.HashMap;

public class anagram {
    public static void main(String[] args){
        String arr[]={"eat","tea","ale","lea"};
        HashMap<String, ArrayList<String>>mao=new Hashmap<>();
        for(String word:arr){
            char ch[]=word.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
        }
    }
}
