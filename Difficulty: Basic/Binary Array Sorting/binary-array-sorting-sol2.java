


class Solution {
    // Function to sort the binary array in non-decreasing order
    public void binSort(int[] arr) {
        // code here
        int n=arr.length;
        //count no of 0 in array
        int count1=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0) count1++;
        }
        //count no of 1 in array
        int count2=n-count1;
        for(int i=0;i<count1;i++){
            if(arr[i]==1) arr[i]=1-arr[i];
            else arr[i]=0;
        }
        for(int i=count1;i<n;i++){
            arr[i]=1;
        }
    }
}
