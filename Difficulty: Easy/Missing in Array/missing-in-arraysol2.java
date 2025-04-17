

class Solution {
    int missingNumber(int arr[]) {
        Arrays.sort(arr);
        int n=arr.length;
        int sum1=0;
        int sum2=0;
        for(int i=1;i<=n+1;i++){
            sum1=sum1+i;
        }
        for(int i=0;i<n;i++){
            sum2=sum2+arr[i];
        }
        return sum1-sum2;
        }
        
        
    }
