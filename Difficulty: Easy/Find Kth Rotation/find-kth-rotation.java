//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input1 = sc.nextLine();
            Scanner ss1 = new Scanner(input1);
            while (ss1.hasNextInt()) {
                arr.add(ss1.nextInt());
            }
            Solution ob = new Solution();
            int res = ob.findKRotation(arr);
            System.out.println(res);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findKRotation(List<Integer> arr) {
        int[] nums=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            nums[i]=arr.get(i);
        }
         int pivot=findPivot(nums);
         return pivot+1;
        // Code here
    }
    public static int findPivot(int[] nums){
    int start=0;
    int end=nums.length-1;
    while(start<=end){
        int mid=start+(end-start)/2;
        if(mid<end&&nums[mid]>nums[mid+1]){
            return mid;
        }
        if(mid>start&&nums[mid]<nums[mid-1]){
            return mid-1;
        }
        if(nums[start]>=nums[mid]){
            end=mid-1;
        }else{
            start=mid+1;
        }
    }
    return -1;
}
}