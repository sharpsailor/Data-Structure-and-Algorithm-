import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            ArrayList<String> res= getKPC(str);
            System.out.println(res);
            
    }
    static String[] code= {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0){
            ArrayList<String> bres= new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        String ros= str.substring(1);
        ArrayList<String> rres = getKPC(ros);
        ArrayList<String> mres= new ArrayList<>();
        String codeForCh= code[ch-'0'];
        for(int i =0;i<codeForCh.length();i++){
            char chcode= codeForCh.charAt(i);
            for(String rstr: rres){
                mres.add(chcode+rstr);
            }
        }
        return mres;
    }

}
