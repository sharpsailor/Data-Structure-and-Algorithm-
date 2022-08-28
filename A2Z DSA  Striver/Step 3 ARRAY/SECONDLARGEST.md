    ###  LINK:https://bit.ly/3pFvBcN
Approach :
case 1 :
Sort array and return the 2nd last element and also see if its not a repeating element 
Not coded since would give o(n(logn)) complexity 


case 2:
traverse the array using for loop and declare max and max 2 with the Integer.MIN_VALUE ..traverse declare current element max if greater and declare max2 value 
with max previous value else if current element is gretear than max2 and is not equal to max then declare current element as max 2.
Time complexity : O(n) since only one single for loop is involved 
```
class Solution {
    int print2largest(int arr[], int n) {
        // code here
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i =0;i<n;i++){
            if(arr[i]>max){
                max2=max; 
                max= arr[i];
            }else if (arr[i]>max2 && arr[i]!=max){
                max2 = arr[i];
            }
        }
        return max2==Integer.MIN_VALUE ?-1:max2 ;
     
    }
}
```
