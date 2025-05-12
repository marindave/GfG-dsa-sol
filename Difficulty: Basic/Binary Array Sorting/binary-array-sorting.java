//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // Number of test cases
        for (int g = 0; g < t; g++) {
            String[] str =
                (br.readLine()).trim().split(" "); // Reading input as a string array
            int arr[] = new int[str.length]; // Creating integer array from the input
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            // Getting the result from the Solution class
            new Solution().binSort(arr);

            // Output the sorted array
            for (int i = 0; i < arr.length; i++) {
                if (i != 0) System.out.print(" ");
                System.out.print(arr[i]);
            }
            System.out.println();
            System.out.println("~");
        }
    }
}

// } Driver Code Ends



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
