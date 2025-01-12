import java.util.*;

public class maxsubarraysum2{

    public static void maxsubarraysum(int numbers[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];

        //Calculate prefix array
        for(int i = 1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];

        }
        for(int i = 0; i<numbers.length; i++){         //Loop1

            for(int j=i; j<numbers.length; j++){       //Loop2

                currsum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
               
                if(maxsum < currsum){
                    maxsum = currsum;
                }

            }
        }
        System.out.println("Max Subarray Sum : " + maxsum);
    }
    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0; i<numbers.length; i++){
        cs = cs + numbers[i];
        if(cs<0){
            cs = 0;
        }
        ms = Math.max(cs,ms);
        }
        System.out.println("Max array sum : " + ms);
    }


    public static void main(String args[]){
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);

    }
}