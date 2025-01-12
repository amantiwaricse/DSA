import java.util.*;

public class BInarysearch{

    public static int binarysearch(int numbers[], int key){
        int start = 0;
        int end = numbers.length-1;
        while(start<=end){
            int mid = (start + end)/2;
            //comparison
            if(numbers[mid] == key){         //found
            return mid;
            }
            if(numbers[mid] < key){        //Right
                start = mid +1;
            }
            if(numbers[mid]>key){         //left
                end = mid -1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 52;
        System.out.println("Index of the key is :" +binarysearch(numbers,key));

    }
}