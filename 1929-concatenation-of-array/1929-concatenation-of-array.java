class Solution {
    public int[] getConcatenation(int[] nums) {
       int[] numcopy=new int[nums.length*2];
       for(int i=0;i<nums.length;i++){
        numcopy[i]=nums[i];
       }
       int j=0;
       for(int i=nums.length;i<numcopy.length;i++){
        numcopy[i]=nums[j];
        j++;
       } 
       return numcopy;
    }
}