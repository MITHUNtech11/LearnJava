package Data_Structures;
import java.util.*;
public class Fuel {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int petrol[] = new int[n];
        int dist[] = new int[n];

        for(int i=0;i<n;i++)
            petrol[i] = sc.nextInt();

        for(int i=0;i<n;i++)
            dist[i] = sc.nextInt();

        int start = 0, balance = 0, deficit = 0;

        for(int i=0;i<n;i++)
        {
            balance += petrol[i] - dist[i];

            if(balance < 0)
            {
                start = i+1;
                deficit += balance;
                balance = 0;
            }
        }

        if(balance + deficit >= 0)
            System.out.println(start);
        else
            System.out.println(-1);

        sc.close();
    }
}