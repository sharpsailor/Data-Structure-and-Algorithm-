import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<>();
        String str = sc.nextLine();
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch =='(' || ch=='{'||ch=='['){
                st.push(ch);
            }else if(ch==')'){
                // if(st.size==0||st.peek()==
                boolean val =balance(st,'(');
                if(val==false){
                    System.out.println(val);
                    return;
                }
                
            }else if (ch=='}'){
                boolean val =balance(st,'{');
                if(val==false){
                    System.out.println(val);
                    return;
                }
                
            }else if (ch==']'){
                boolean val =balance(st,'[');
                if(val==false){
                    System.out.println(val);
                    return;
                }
            }else{
                
            }
        }
        
        if(st.size()==0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
    public static boolean balance(Stack<Character> st ,char  c){
        if(st.size()==0 || st.peek()!=c){
            return false;
        }else{
            st.pop();
            return true;
        }
    }

}
