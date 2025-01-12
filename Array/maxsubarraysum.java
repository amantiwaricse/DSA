import java.util.*;

public class maxsubarraysum{

    public static void maxsubarraysum(int numbers[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0; i<numbers.length; i++){         //Loop1
            int start = i;
            for(int j=i; j<numbers.length; j++){       //Loop2
                int end  = j; 
                currsum = 0;
                for(int k = start; k<=end; k++){       //Loop3
                currsum += numbers[k];

                }
                System.out.println(currsum);
                if(maxsum < currsum){
                    maxsum = currsum;
                }

            }
        }
        System.out.println("Max Subarray Sum : " + maxsum);



    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        maxsubarraysum(numbers);

    }
}