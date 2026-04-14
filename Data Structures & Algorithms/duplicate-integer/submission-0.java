class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashSet<Integer> number= new HashSet<>();
        for(Integer num: nums){
            if(!number.add(num)){
               return true;
            }            
        }
        return false;
    }
}