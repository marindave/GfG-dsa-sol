//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            String line = sc.nextLine();
            String[] tokens = line.split(" ");
            int[] nums = Arrays.stream(tokens).mapToInt(Integer::parseInt).toArray();

            Solution ob = new Solution();
            System.out.println(ob.numOfSubset(nums));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int numOfSubset(int[] arr) {
        // Your code goes here
        Arrays.sort(arr);
        int i=0;
        int j=1;
        int count=0;
        while(j<arr.length){
            if(arr[j]-arr[i]!=1) count++;
            i++;
            j++;
        }
        return count+1;
    }
}