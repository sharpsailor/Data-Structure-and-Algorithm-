## Basic Operations of a stack are 
  - Push ->add elements of stack
  - POP  ->remove elements of stack
  - Peek ->fetch the top element of stack
  - size ->fetch the size of the stack
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
#### if there is no element left after poping in the stack , then empty stack exception occurs denoting no element to fetch in case of peek opertaion.
