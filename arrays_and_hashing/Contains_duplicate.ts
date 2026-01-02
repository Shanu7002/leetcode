/*
 * PROBLEM: Contains Duplicate
 * LINK: https://neetcode.io/problems/duplicate-integer
 * -------------------------------------------------------------------------
 * APPROACH EVOLUTION:
 * 1. Brute Force: O(n^2) -
 * -------------------------------------------------------------------------
 * TIME COMPLEXITY:  O(n) - 
 * SPACE COMPLEXITY: O(n) - 
 * PERFORMANCE:
 * -------------------------------------------------------------------------
 */
function containsDuplicate(nums: number[]): boolean {
    for(let i = 0; i < nums.length; i++){
        for(let j = i + 1;j < nums.length;j++){
            if(nums[i] === nums[j]){
                return true;
            }
        }
    }
    return false;
};