import java.util.*;

public class Stockprofit{
    public static int maxprofit(int price[]){
        int bp =Integer.MAX_VALUE;
        int maxprofit = 0;
        
        for(int i=0; i<price.length; i++){
            if(bp < price[i]){
                int profit = price[i] - bp;
                maxprofit = Math.max(maxprofit, profit);
            }
            else{
                bp = price[i];
            }
        }
        return maxprofit;
    }

    public static void main(String args[]){
        int price[] = {7,1,5,3,6,4};

        System.out.print(maxprofit(price));


    }
}