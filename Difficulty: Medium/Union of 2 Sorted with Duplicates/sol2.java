

// User function Template for Java

// a,b : the arrays
class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int m=a.length;
        int n=b.length;
        int i=0;
        int j=0;
        while(i<m||j<n){
            if(i<m&&i>0&&a[i]==a[i-1]){
                i++;
                continue;
            } 
            if(j<n&&j>0&&b[j]==b[j-1]){
                j++;
                continue;
            
            } 
            if(j==n){
                list.add(a[i]);
                i++;
            }else if(i==m){
                list.add(b[j]);
                j++;
            }else if(a[i]==b[j]){
                list.add(a[i]);
                i++;
                j++;
            }else if(a[i]>b[j]){
                list.add(b[j]);
                j++;
            }else if(b[j]>a[i]){
                list.add(a[i]);
                i++;
            }
            
            
        }
       return list;
    }
}
