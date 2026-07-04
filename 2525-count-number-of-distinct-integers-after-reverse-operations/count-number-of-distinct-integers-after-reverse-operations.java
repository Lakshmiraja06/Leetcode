class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n:nums) set.add(n);
        for(int i=0;i<nums.length;i++){
            int rev=0;
            while(nums[i]!=0){
                int dig = nums[i]%10;
                rev = rev*10+dig;
                nums[i] /= 10;
            }
            set.add(rev);
        }
        return set.size();


        // ArrayList<Integer> list = new ArrayList<>();
        // for(int num:nums){
        //     list.add(num);
        // }
        // int count=1;
        // for(int i=0;i<nums.length;i++){
        //     int rev=0;
        //     int temp=nums[i];
        //     while(temp!=0){
        //         int dig = temp%10;
        //         rev = rev*10+dig;
        //         temp /= 10;
        //     }
        //     list.add(rev); 
        // }
        // Collections.sort(list);
        // for(int i=1;i<list.size();i++){
        //     if(list.get(i-1)<list.get(i)) count++;
        // }
        // return count;
    }
} 