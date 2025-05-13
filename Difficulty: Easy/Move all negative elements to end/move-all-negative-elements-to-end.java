//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        while (T > 0) {
            String[] input = sc.nextLine().trim().split(" ");
            int[] a = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                a[i] = Integer.parseInt(input[i]);
            }
            Solution ob = new Solution();
            ob.segregateElements(a);
            for (int num : a) {
                System.out.print(num + " ");
            }
            System.out.println();
            T--;
        
System.out.println("~");
}
        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public void segregateElements(int[] arr) {
      int[] ans=new int[arr.length];
      int count=0;
      for(int i=0;i<arr.length;i++){
          if(arr[i]>=0){
              ans[count]=arr[i];
              count++;
          }
      }
      for(int i=0;i<arr.length;i++){
          if(arr[i]<0){
              ans[count]=arr[i];
              count++;
          }
      }
      for(int i=0;i<ans.length;i++){
          arr[i]=ans[i];
      }
    }
}