/***
 * @author Roderick Davis
 * LeetCode #1 Two Sum
 * return indices of the two numbers such that they add up to the target number
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int x = 0; x < nums.length; x++){
            for(int y = x + 1; y < nums.length; y++){
                if((nums[x] + nums[y]) == target){
                    return new int[] {x, y} ;
                }
            }
        }
        return null;
    }
}
