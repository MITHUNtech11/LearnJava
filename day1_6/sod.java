public class sod {
    public static void main(String[] args){
        int n=1234, s=0;
        while (n>0){
            for (int i=1; i+1<=n; i++){ 
                System.out.print(" ");
            }
            s+=n%10;
            n/=10;
        }
        System.out.println("Sum:"+s);
    }
}


