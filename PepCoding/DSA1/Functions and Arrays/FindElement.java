import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc  = new Scanner(System.in);
    int n = sc.nextInt();
    int[]a = new int[n];
    for(int i = 0;i<n;i++){
        a[i]=sc.nextInt();
    }
    int d = sc.nextInt();
    int idx =-1;
    for(int i =0;i<n;i++)
    {
        if(a[i]==d){
            idx = i;
        }
    }
    System.out.println(idx);
 }

}
