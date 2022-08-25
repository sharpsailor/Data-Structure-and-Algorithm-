/*This is 1st approach which consist of starting from the right side which indirectly means returning the value which is encountered 1st from the last .
This will work out to be easiest since last will be first when iterated upon . */
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr= new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(lastIndex(arr,n-1,x));
    }

  public static int lastIndex(int[] arr, int idx, int x){
        if(idx == -1) return -1;

        if(arr[idx] == x) return idx;
        int liisa = lastIndex(arr, idx-1, x);
        return liisa;
    }

}
/* This is 2nd approach which say to first iterate over the array and reach the last where we have already declared it -1 by assuming the base case,
if this is -1 then now we will take a nested condition which says if found then store the last value at the index else we will store -1 after this at the end we will c
come out of else condition which will return last value*/
 public static int lastIndex(arr,idx,x){
 if(idx==arr.length-1){
   return -1;
 }
   int lissa = lastIndex(arr,idx+1,x);
   if(liisa==-1){
    if(arr[idx]==x){
      
            return idx;
    }else{
     return -1;
    }
     else{
       return lissa;
   }
 }




