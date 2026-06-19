class Solution {
    public int largestAltitude(int[] gain) {
        int[] arr = new int[gain.length+1];
        arr[0] = 0; 
        for(int i=0;i<gain.length;i++){
            int num =arr[i]+gain[i];
            arr[i+1] = num;
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(arr[i],max);
        }
        return max;
    }
}