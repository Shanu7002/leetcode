/*
 * PROBLEM: Two sums
 * LINK: https://neetcode.io/problems/two-integer-sum
 * -------------------------------------------------------------------------
 * APPROACH EVOLUTION:
 * 1. Brute Force: O(n^2) - Nested loops (Function: twoSum)
 * 2. Optimized: O(n) - Hash Map one pass (Funciont: twoSum2)
 * -------------------------------------------------------------------------
 * TIME COMPLEXITY:  O(n) - Constant time loop with Map
 * SPACE COMPLEXITY: O(n) - Storing up to N elements in the Map 
 * PERFORMANCE: Beats 74.55% in Runtime
 * -------------------------------------------------------------------------
 */

function twoSum(nums: number[], target: number): number[] {
    for(let i = 0;i < nums.length;i++){
        for(let j = i + 1;j < nums.length;j++){
            if(nums[i] + nums[j] === target){
                return [i, j];
            }
        }
    }
    return [];
};
console.log(twoSum([2,7,11,15], 9));

function twoSum2(nums: number[], target: number): number[] {
    const prevMap = new Map<number, number>();

    for(let i = 0; i < nums.length; i++) {
        const currentNum = nums[i];
        const completeNum = target - currentNum;

        if(prevMap.has(completeNum)){
            return [prevMap.get(completeNum)!, i];
        }

        prevMap.set(currentNum, i);
    }
    return [];
}
console.log(twoSum2([2,7,11,15], 9));