class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
       int n=arr.length;
        int j=n-1;
        int max=0;
        while(j>=0){
         if(arr[j]>=max){
             max=arr[j];
             list.add(arr[j]);
         }  
         j--;
        }
           int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(size - i - 1));
            list.set(size - i - 1, temp);
        }
        return list;
    }
}
