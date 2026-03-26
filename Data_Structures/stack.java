package Data_Structures;

import java.util.ArrayDeque;
import java.util.Deque;

public class stack {
    public static void main(String[] args){
            Deque<Integer> stack=new ArrayDeque<>();
    stack.push(10);
    stack.push(10);
    System.out.println(stack.pop());
    }
}
