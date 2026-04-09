public class evenodd {
    public static void main(String[] args){
        int[]arr={1,2,3,4,5};
        int a=0;
        int b=0;
        for(int num:arr){

            if(num%2==0){
                a+=num;
            }
            else{
                b+=num;
            }
        }
        System.out.println("ODD num:"+b);
        System.out.println("EVEN num:"+a);
    }
}

// sum of odd and even numbers