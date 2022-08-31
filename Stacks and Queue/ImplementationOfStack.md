## Basic Operations of a stack are 
  - Push ->add elements 
  - POP  ->remove elements 
  - Peek ->fetch the top element
## Implementation

```
import java.util.*;

public class Main{
    public static void main (String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(10);
        System.out.println(st+"->"+st.peek()+" "+st.size());
        st.push(20);
        System.out.println(st+"->"+st.peek()+" "+st.size());
        st.push(30);
        System.out.println(st+"->"+st.peek()+" "+st.size());
        st.pop();
        System.out.println(st+"->"+st.peek()+" "+st.size());
        st.pop();
        System.out.println(st+"->"+st.peek()+" "+st.size());
        st.pop();
        System.out.println(st+"->"+" "+st.size());
    }
}
```
### Output generated 
```
[10]->10 1
[10, 20]->20 2
[10, 20, 30]->30 3
[10, 20]->20 2
[10]->10 1
[]-> 0
```
