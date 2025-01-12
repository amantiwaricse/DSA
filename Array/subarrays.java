import java.util.*;

public class subarrays{

    public static void printsubarrays(int numbers[]){
        int ts=0;
        for(int i = 0; i<numbers.length; i++){         //Loop1
            int start = i;
            for(int j=i; j<numbers.length; j++){       //Loop2
                int end  = j;
                for(int k = start; k<=end; k++){       //Loop3
                System.out.print(numbers[k]+" ");      //To print subarrays
                ts++;
                }
                System.out.println();


            }
                    System.out.println();
        }
        System.out.println(ts);


    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        printsubarrays(numbers);

    }
}