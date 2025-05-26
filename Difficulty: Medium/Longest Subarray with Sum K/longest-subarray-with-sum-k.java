// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer>map=new HashMap<>();
       int n=arr.length;
       int sum=0;
       int max=0;
       for(int i=0;i<n;i++){
           sum=sum+arr[i];
           if(sum==k) max=Math.max(max,i+1);
           if(!map.containsKey(sum)) map.put(sum,i);
           int temp=sum-k;
           if(map.containsKey(temp)) max=Math.max(max,i-map.get(temp));
       }
       return max;
    }
}
