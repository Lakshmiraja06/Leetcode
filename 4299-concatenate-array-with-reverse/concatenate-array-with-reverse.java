class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int[] arr = new int[nums.length];
        int j=0;
        for(int i=nums.length-1;i>=0;i--){
            arr[j++]=nums[i];
            
        }
        int n1 = arr.length;
        int[] result = new int[n+n1];
        for(int i=0;i<nums.length;i++){
            result[i] = nums[i];
        }
        for(int i=0;i<arr.length;i++){
            result[n1+i] = arr[i];
        }
       return result; 
    }
}