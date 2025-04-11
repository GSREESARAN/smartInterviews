//Optimal Solution
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            if(map.containsKey(target-num)){
                return new int[]{i,map.get(target-num)};
            }
            map.put(num,i);
        }
        return new int[]{};
    }
}

//Brute Force Solution
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}

