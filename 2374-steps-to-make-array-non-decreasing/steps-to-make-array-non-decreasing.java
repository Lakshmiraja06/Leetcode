class Solution {
    public int totalSteps(int[] nums) {
        int max = 0;
        Stack<int[]> stack = new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            int st = 0;
            while(!stack.isEmpty() && nums[i]>stack.peek()[0]){
                st = Math.max(st+1, stack.peek()[1]);
                stack.pop();
            }

            max = Math.max(max, st);
            stack.push(new int[]{nums[i], st});
        }
        return max;
    }
}