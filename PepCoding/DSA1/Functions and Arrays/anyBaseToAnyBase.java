import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b1 = scn.nextInt();
     int  b2= scn.nextInt();
     int d = ans(n, b1,b2);
     System.out.println(d);
   } 
   public static int ans(int n,int b1,int b2 ){
       int a = anyBaseToDecimal(n,  b1);
       int a2 = anyDecimalToBase( a,  b2);
        return a2;
   }
   public static int anyBaseToDecimal(int n, int b){
      int rv =0;
      int p =1;
      while(n!=0){
          int dig = n%10;
          n= n/10;
          rv += dig*p;
          p=p*b;
      }
      
      return rv;
   }
   public static int anyDecimalToBase(int n, int b){
       int rv  = 0;
       int p = 1;
       while(n!=0){
           int cd  = n%b;
           n  = n/b;
          rv +=cd*p;
          p= p*10;
       }
       return rv;
   }
  }
