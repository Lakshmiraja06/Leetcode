class Solution {
    public int[] sortArray(int[] nums) {
        int[] arr = new int[nums.length];
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        Collections.sort(list);
        for(int i=0;i<nums.length;i++){
            arr[i] = list.get(i);
        }
        return arr;

        // int i=0;
        // int i=nums.length;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]>nums[j]){
        //             int temp = nums[i];
        //             nums[i]=nums[j];
        //             nums[j]=temp;
        //         }
        //     }
        // }
        //  return nums;
    }
}