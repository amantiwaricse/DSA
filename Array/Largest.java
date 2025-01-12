import java.util.*;

public class Largest{

    public static int getLargest(int number[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i< number.length; i++){
            if(largest < number[i]){
                largest = number[i];
            }
            if(smallest > number[i]){
                smallest = number[i];
            }
        }
        System.out.println("Smallest number in the array is :" +smallest);
        return largest;
    }

    public static void main(String args[]){

        int number[] = {1,2,6,3,5};

        System.out.println("Largest number in the array is :" +getLargest(number));


    }
}