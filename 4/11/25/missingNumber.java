//Brute Force Solution

class Solution {
    public int missingNumber(int[] nums) {
        for(int i=0;i<=nums.length;i++){
            int flag =0;
            for(int j=0;j<nums.length;j++){
                if(i==nums[j]){
                    flag =1;
                    break;
                }
            }
            if(flag==0){
                return i;
            }
        }
        return 0;
    }
}


//Optimal Solution 

class Solution {
    public int missingNumber(int[] nums) {
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            ans^=i^nums[i];
        }
        return ans^nums.length;
    }
}
