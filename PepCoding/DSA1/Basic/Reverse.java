import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here  
     Scanner sc  = new Scanner(System.in);
     int n = sc.nextInt();
     while(n!=0){
         int temp = n%10;
         n=n/10;
         System.out.println(temp);
         
     }
    }
   }
