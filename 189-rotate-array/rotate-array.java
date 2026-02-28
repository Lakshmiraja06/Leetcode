class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        int value = n-k; 
        reverse(nums,0,value-1);
        reverse(nums,value,n-1);
        reverse(nums,0,n-1);
    }
    public void reverse(int[] arr, int left, int rig){
        while(left < rig){
            int temp = arr[left];
            arr[left] = arr[rig];
            arr[rig] = temp;

            left++;
            rig--;
        }
    }
}