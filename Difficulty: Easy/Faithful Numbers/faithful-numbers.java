//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.nthFaithfulNum(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static Long nthFaithfulNum(int N) {
        // code here
       int count=0;
       long temp=0;
       while(N>0){
           count++;
           if(N%2!=0){
               
             temp= temp+ (long) Math.pow(7,count-1);
           }
           N=N>>1;
       }
       return temp;
    }
};