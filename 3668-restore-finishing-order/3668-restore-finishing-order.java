class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
         ArrayList<Integer>list = new ArrayList<>();
         for(int i=0;i<friends.length;i++){
            list.add(friends[i]);
         }
         int[]rec = new int[friends.length];
         int j=0;
         for(int i=0;i<order.length;i++){
            if(list.contains(order[i])){
                rec[j]=order[i];
                j++;
            }
         }
         return rec;
    }
}