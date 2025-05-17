//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            
            String inputLine1[] = br.readLine().trim().split(" "); 
            int i=0;
            int N = Integer.parseInt(inputLine1[i++]);
            int leaves = Integer.parseInt(inputLine1[i++]);
            
            int frogs[] = new int[(int)(N)];
            
            String inputLine2[] = br.readLine().trim().split(" ");
            for ( i = 0; i < N; i++) {
                frogs[i] = Integer.parseInt(inputLine2[i]);
            }
        
            Solution ob = new Solution();
            System.out.println(ob.unvisitedLeaves(N, leaves, frogs));
            
        
System.out.println("~");
}
	}
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int unvisitedLeaves(int N, int leaves, int frogs[]) {
        // Code here
       int[] visited=new int[leaves+1];
       for(int i=0;i<N;i++){
           int target=frogs[i];
           if(target<=leaves && visited[target]==0){
               for(int j=target;j<=leaves;j+=target){
                   visited[j]=1;
               }
           }
       }
       for(int i=0;i<visited.length;i++){
           if(visited[i]==1){
               leaves--;
           }
       }
       return leaves;
    }
}
