class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cand1=0,cand2=0,count1=0,count2=0;
        
        for(int num:nums){
            if(cand1==num){
                count1++;
            }else if(cand2==num){
                count2++;
            }
            else if(count1==0){
                cand1=num;
                count1=1;
            }
            else if(count2==0){
                cand2=num;
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int num:nums){
            if(cand1==num)count1++;
            if(cand1!=cand2 && cand2==num)count2++;
        }
        ArrayList <Integer>list=new ArrayList<>();
        if(count1>nums.length/3) list.add(cand1);
        if(count2>nums.length/3) list.add(cand2);
        return list;
    }
}