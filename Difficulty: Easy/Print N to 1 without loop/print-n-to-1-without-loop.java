class Solution {

    void printNos(int N) {
        // code here
      System.out.print(N+" ");
        if(N==1) return;
        printNos(N-1);
        
       return;
    }
}