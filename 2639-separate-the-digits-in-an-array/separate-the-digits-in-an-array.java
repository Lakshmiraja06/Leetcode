class Solution {
    public int[] separateDigits(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            int temp = nums[i];
            while(temp!=0){
                int dig = temp%10;
                count++;
                temp /= 10;
            }
        }
        int[] arr = new int[count];
        int j=count -1;
        for(int i=nums.length-1;i>=0;i--){
            int temp = nums[i];
            while(temp!=0){
                int last = temp%10;
                temp /= 10;
                arr[j--] = last;
            }
            
        }
        return arr;
    }
}