import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner (System.in);
    String str = sc.next();
    ArrayList<String> res = gss(str);
    System.out.println(res);
  }

  public static ArrayList<String> gss(String str) {
    if (str.length() == 0) {
      ArrayList<String> bres = new ArrayList<>();
      bres.add("");
      return bres;
    }
    char ch = str.charAt(0);//a
    String ros = str.substring(1); //bc
    ArrayList<String>rres = gss(ros); // [--,-b,-c,bc]
    ArrayList<String> mres = new ArrayList<>();
    
    for (String val : rres) {
      mres.add("" + val);
    }
    for (String val : rres) {
      mres.add(ch + val);
    }
    return mres;
  }

}
