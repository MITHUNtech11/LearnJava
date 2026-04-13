package zoho;

public class stock {
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        
        int min = prices[0];
        int maxProfit = 0;
        
        for(int i=1;i<prices.length;i++){
            if(prices[i] < min)
                min = prices[i];
            
            int profit = prices[i] - min;
            
            if(profit > maxProfit)
                maxProfit = profit;
        }
        
        System.out.println(maxProfit);
    }
}
