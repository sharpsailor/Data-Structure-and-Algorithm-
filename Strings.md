# Strings in Java 
``` 
Its a collection of charactrs 

Deceleration : String str="hello";
print:         System.out.println(str);
 find charcaters : char ch = str.charAt(0);
 //output
 h
 
 ```

```
Printing all charcters :
				for(int i =0;i<str.length();i++){
				char ch= str.charAt(i);
				System.out.println(ch);
				}
//output
h
e
l
l
o
```

```
Substrings :
String ss= str.substring(2,4);
System.out.println(ss);
//output
ll


``` 


## ARRAYLIST
``` 
Dynamic array 
Deceleration: Arraylist<Integer>list= new ArrayList<>();
list.add(10);
list.add(20);
list.add(30);
System.out.println(list+"->"+list.size()));

//Output
[10,20,30]->3

```

```
Printing values using

- for each loop
  for(int val: list){
  System.out.println(val);
  }
- for loop
									for(int i =0;i<list.size();i++){
  /*fetch value of list using get */ int val =list.get(i);
									   System.out.println(val);
									    }
// Output
10
20
30

```

```
Replace elements 
list.set(2,300);
System.out.println(list+"->"+list.size());
Size remains same but changes value at 2
//output
[10,20,300]->3

Insert/add in between
list.add(2,3000);
System.out.println(list+"->"+list.size());
//output
[10,20,3000,300]->4
```