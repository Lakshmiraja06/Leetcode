class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int[] arr1= new int[n/2];
        int[] arr2 = new int[n/2];
        int k=0;
        int l=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                arr1[k++]=nums[i];
            }
            else{
                arr2[l++] = nums[i];
            }
        }
        boolean sub = true;
        for(int i=0;i<arr1.length;i++){
            for(int j=i+1;j<arr1.length;j++){
                if(arr1[i]==arr1[j]) sub = false;
            }
        }
        boolean su = true;
        for(int i=0;i<arr2.length;i++){
            for(int j=i+1;j<arr2.length;j++){
                if(arr2[i]==arr2[j]) su = false;
            }
        }
        return sub&su?true:false;
    }
}