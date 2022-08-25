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
        int x = sc.nextInt();
        System.out.println(firstIndex(arr,0,x));
    }

    public static int firstIndex(int[] arr, int idx, int x){
        if(idx==arr.length-1){
            return -1;
        }
        if(arr[idx]==x){
            return idx;
        }else{
            return firstIndex(arr,idx + 1,x);
        }
    }

}
