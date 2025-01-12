import java.util.*;

public class Reverse{
    public static void reverse(int numbers[]){
        int first = 0;
        int last = numbers.length - 1;
        while(first<last){
            //for swapping
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        reverse(numbers);

        // to print the reverse array

        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] +" ");
        }


    }
}