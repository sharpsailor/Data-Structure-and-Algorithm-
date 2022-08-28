### Link : https://bit.ly/3Pld280
### Question :Given an array A[] of size n. The task is to find the largest element in it.
Approch + Code :

case 1: just sort the array and return the last element since this will be the max 
```
class Compute {
    
    public int largest(int arr[], int n)
    {
        Arrays.sort(arr);
        return arr[n-1];
    }
}
```
Time Complexity :Avg- O(n(logn))
                  worst - o(n^2)
 
 case 2:
 Just iterate and compare max with the next elements so that if it is greater then assign it max  else do nothing 
 ```
 class Compute {
    
    public int largest(int arr[], int n)
    {
        int max = arr[0];
        for(int i =0;i<n;i++){
            if(arr[i]>max)
                max =arr[i] ;
        }
        return max;
    }
}
 ```
Time complexity : O(n)

