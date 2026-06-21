class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set = new HashSet<>();
        for(int n1:nums1){
            for(int n2:nums2){
                if(n1==n2 && !set.contains(n1)){
                    set.add(n1);
                }
            }
        }
        int[]res = new int[set.size()];
        int i=0;
        for(int n:set){
            res[i++]=n;
        }
        return res;
    }
}