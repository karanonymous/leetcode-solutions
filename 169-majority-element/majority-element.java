class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i = 0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
 
        int max=0;
        for(Map.Entry<Integer,Integer> child : hm.entrySet()){
            if(child.getValue()>nums.length/2)
             max=child.getKey();
        }
         return max;

    }
}