import java.util.*;
public class Twosum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int needed = target - num;
            if(mpp.containsKey(needed)){
                return  new int[]{mpp.get(needed),i};
            }
            mpp.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
} 
    

