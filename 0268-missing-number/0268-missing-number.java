class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0,count=0;
        for(int n:nums){
            sum+=n;
        }
        for(int i=1;i<=nums.length;i++){
            count+=i;
        }
        return count-sum;
    }
}