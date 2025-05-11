//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());

        Solution solution = new Solution();
        while (t-- > 0) {
            String input = reader.readLine().trim();
            String[] parts = input.split("\\s+");
            int[] arr = Arrays.stream(parts).mapToInt(Integer::parseInt).toArray();

            System.out.println(solution.findMissing(arr));

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findMissing(int[] arr) {
        if(arr.length==1) return 2*arr[arr.length-1];
       //finding the most common difference using hashmap
       HashMap<Integer,Integer> map=new HashMap<>();
       //here we first stored the diff as key and value as the no of times that differece occured
       for(int i=0;i<arr.length-1;i++){
           int temp=arr[i+1]-arr[i];
           map.put(temp,map.getOrDefault(temp,0)+1);
       }
       //now we will be finding the most frequent difference from hashmap
       int max=0;
       int diff=0;
       int mindiff=Integer.MAX_VALUE;
       for(Map.Entry<Integer,Integer> entry:map.entrySet()){
           int counter=entry.getKey();
           int count=entry.getValue();
           if(count>=max){
               max=count;
               diff=counter;
               if(Math.abs(diff)<Math.abs(mindiff)){
                   mindiff=diff;
               }
           }
       }
       //now we got the needed diff value 
       //now we going to find the missing terms from ap
       int expected=0;
       int missing=0;
       int start=0;
       int end=arr.length-1;
       while(start<=end){
           int mid=start+(end-start)/2;
           expected=arr[0]+mid*mindiff;
           if(arr[mid]==expected) start=mid+1;
           else {
               missing=expected;
               end=mid-1;
           }
       }
       if(missing==0) return arr[arr.length-1]+mindiff;
       return missing;
    }
}
