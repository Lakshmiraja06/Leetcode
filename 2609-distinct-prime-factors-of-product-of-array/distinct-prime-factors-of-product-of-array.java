class Solution {
    public int distinctPrimeFactors(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int n=0;n<nums.length;n++){

           int pro=nums[n];

            for(int i=2;i*i<=pro;i++){
                while(pro%i==0){
                    pro /= i;
                    set.add(i);
                }
            }
            if(pro>1){
            set.add(pro);
        }
        }
        return set.size();
    }
}