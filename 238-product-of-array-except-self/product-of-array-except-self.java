class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        arr[0]=1;
        for(int i=1;i<nums.length;i++){
            arr[i]=arr[i-1]*nums[i-1];
        }
        int ri = 1;
        for(int i=nums.length-1;i>=0;i--){
            arr[i]=arr[i]*ri;
            ri=ri*nums[i];
        }
        return arr;

        
        // for(int i=0;i<nums.length;i++){
        //     int pro =1;
        //    for(int j=0;j<nums.length;j++){
        //     if(i==j) continue;
        //     else{
        //         pro *= nums[j];
        //     }
        // }
        //    arr[i]=pro;
        // }
        // return arr;
    }
}