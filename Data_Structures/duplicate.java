package Data_Structures;
    import java.util .*;
public class duplicate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2); list.add(1); list.add(3);
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < list.size(); i++) {
            int val = list.get(i);
            if(!result.contains(val))
                result.add(val);
            System.out.println(result);

        }
    }
}