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
    }
}