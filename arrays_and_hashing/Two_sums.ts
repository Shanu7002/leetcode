/*
 * PROBLEM: Two sums
 * LINK: https://neetcode.io/problems/two-integer-sum
 * -------------------------------------------------------------------------
 * APPROACH EVOLUTION:
 * 1. Brute Force: O(n^2) - Nested loops
 * -------------------------------------------------------------------------
 * TIME COMPLEXITY:  O(n^2) - Single pass each array number
 * SPACE COMPLEXITY: O(1) -
 * PERFORMANCE: Beats 74.55% in Runtime
 * -------------------------------------------------------------------------
 */
class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums: [], target: number) {
        for(let i = 0;i < nums.length;i++){
            for(let j = i + 1;j < nums.length;j++){
                if(nums[i] + nums[j] === target){
                    return [i, j];
                }
            }
        }
    }
}