import java.util.*;

public class ques1{
    public static int delete(int nums[]){
        int n = nums.length;
        int expectedNums[] = new int[n];
        int k=0;
        for(int i=0; i<n; i++){..
            if(i<n-1 && nums[i] == nums[i+1]){
                continue;
            }
            expectedNums[k] = nums[i];
            k++;
        }
        return k;

    }
    public static void main(String args[]){
        int nums[] = {1,1,2};
        delete(nums);

    }
}