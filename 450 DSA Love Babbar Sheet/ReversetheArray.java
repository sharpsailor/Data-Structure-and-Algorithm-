Link :https://practice.geeksforgeeks.org/problems/reverse-an-array/0
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
		    a[i]= sc.nextInt();
		}
		int i =0;
		int k=a.length-1;
		while(i<=k){
		    int temp = a[k];
		    a[k]= a[i];
		    a[i]= temp;
		    i++;
		    k--;
		}
		for(int x :a){
		    System.out.print(x+" ");
		}
		System.out.println();
		}
	}
}
