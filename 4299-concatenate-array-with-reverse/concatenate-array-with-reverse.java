class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int[] arr = new int[nums.length];
        int j=0;
        for(int i=nums.length-1;i>=0;i--){
            arr[j++]=nums[i];
            
        }
        int[] result = new int[n+n];
        for(int i=0;i<nums.length;i++){
            result[i] = nums[i];
        }
        for(int i=0;i<arr.length;i++){
            result[n+i] = arr[i];
        }
       return result; 
    }
}