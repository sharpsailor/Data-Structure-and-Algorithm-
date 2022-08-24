import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code hidxre
        Scanner sc = new Scanner(System.in);
        int idx = sc.nextInt();
        int[] arr = new int[idx];
        for(int i  =0;i<idx;i++){
            arr[i]= sc.nextInt();
        }
        displayArrReverse(arr,idx-1);
        
    }

    public static void displayArrReverse(int[] arr, int idx) {
            if(idx<0){
                return;
            }
            System.out.println(arr[idx]);
            displayArrReverse(arr,idx-1);
    }

}
