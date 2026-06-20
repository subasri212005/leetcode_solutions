class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[]sorted = nums.clone();
        Arrays.sort(sorted);

        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
             if(!map.containsKey(sorted[i])){
                map.put(sorted[i],i);
             }
        }        
        for(int i=0;i<nums.length;i++){
            nums[i]=map.get(nums[i]);
        }
        return nums;
    }
}