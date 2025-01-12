import java.util.*;

public class Passingarrays{

    public static void update(int marks[]){
        int nonchangeable = 10;
        for(int i=0; i<marks.length; i++)
        marks[i]= marks[i] + 1;
    }

    public static void main(String args[]){
        int nonchangeable = 5;
        int marks[] = {73,73,83};
        update(marks);

//To print the marks
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");  //Marks updates because the array is passed by reference.
        }
        System.out.println();

        System.out.println(nonchangeable);  // the nonchamngeable variable does not changes because it is passed by value.

    }
}