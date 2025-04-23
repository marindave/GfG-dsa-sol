


class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
       ArrayList<Integer> list=new ArrayList<>();
       int n=arr.length;
       for(int i=0;i<n;i++){
           int sum=arr[i];
          if(sum==target){
              list.add(i+1);
              list.add(i+1);
                  return list;
          }
           for(int j=i+1;j<n;j++){
               sum=sum+arr[j];
               if(sum==target){
                   list.add(i+1);
                   list.add(j+1);
                   return list;
               }
           }
       }
        list.add(-1);
        return list;
    }
}
