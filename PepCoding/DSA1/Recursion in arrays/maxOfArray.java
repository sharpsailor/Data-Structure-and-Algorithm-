import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
            Scanner sc = new Scanner(System.in);
        int idx = sc.nextInt();
        int[] arr = new int[idx];
        for(int i  =0;i<idx;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(maxOfArray(arr,0));
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int max = maxOfArray(arr,idx+1);
        if(max>arr[idx]){
            return max;
        }else{
            return arr[idx];
        }
    }

}
