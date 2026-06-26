class Solution {
    public int findMiddleIndex(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        int total=prefix[prefix.length-1];
        int left=0;
        for(int i=0;i<nums.length;i++){
            int right=total-left-nums[i];
            if(left==right){
                return i;
            }
            left+=nums[i];
        }
        return -1;
    }
}