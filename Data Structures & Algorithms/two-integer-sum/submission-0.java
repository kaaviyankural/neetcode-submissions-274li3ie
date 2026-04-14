class Solution {
    public int[] twoSum(int[] nums, int target) {
        /* brute force solution
        int[] result=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
result[0]=i;
result[1]=j;
break;
                }
            }
        }
        return result; */

// idea is to identify whether do we have a element in the array which 
// on addition gives the target value
        Map<Integer, Integer> numberIndexMap= new HashMap<>();
        for(int i=0;i< nums.length;i++){
            int diff = target-nums[i];
            if(numberIndexMap.containsKey(diff)){
                return new int[]{numberIndexMap.get(diff),i};
            }
            numberIndexMap.put(nums[i],i);
        }
        return new int[]{};
    }
}
