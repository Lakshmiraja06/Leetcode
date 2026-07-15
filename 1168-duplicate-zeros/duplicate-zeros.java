class Solution {
    public void duplicateZeros(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int[] nums = arr;
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            if(nums[i]==0){
                for(int k=0;k<2;k++){
                    list.add(nums[i]);
                }
                j--;
            }
            else{
                list.add(nums[i]);
            }
            i++;
        }
        for(int k=0;k<arr.length;k++){
            arr[k]=list.get(k);
        }
    }
}