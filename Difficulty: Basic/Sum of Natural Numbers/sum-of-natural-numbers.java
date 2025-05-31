
class Solution {
    public static int seriesSum(int n) {
        // code here
        //int i=1;
       if(n==1) return 1;
       return n+seriesSum(n-1);
    }
}
