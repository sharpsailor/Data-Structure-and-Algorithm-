import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int[] a1= new int[n1];
    for(int i = 0;i<n1;i++){
        a1[i]=sc.nextInt();
    }
    int n2 = sc.nextInt();
    int[] a2= new int[n2];
    for(int i = 0;i<n2;i++){
        a2[i]=sc.nextInt();
    }
    int[] sub = new int[n2];
    int i = n1-1;
    int j = n2-1;
    int k = sub.length-1;
    int c  =0;
    while(k!=0){
        
        int alv =i>=0?a1[i]:0;
        
        if(a2[j]+c>=alv){
            sub[k]=a2[j]+c-alv;
            c=0;
        }else{
            sub[k]=a2[j]+c+10-alv;
            c=-1;
        }
        i--;
        j--;
        k--;
    }
    int idx =0;
    while(idx<sub.length){
        if(sub[idx]==0){
            idx++;
        }else{
            break;
        }
    }
    while(idx<sub.length){
        System.out.println(sub[idx]);
        idx++;
    }
 }

}
