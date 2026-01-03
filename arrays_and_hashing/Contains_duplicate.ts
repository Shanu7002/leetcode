/*
 * PROBLEM: Contains Duplicate
 * LINK: https://neetcode.io/problems/duplicate-integer
 * -------------------------------------------------------------------------
 * APPROACH EVOLUTION:
 * 1. Brute Force: O(n^2) - Nested loops checking every pair (O(1) Space).
 * 2. Optimized (Manual Set): O(n) - Single pass with early exit (O(n) Space).
 * 3. Modern (Set Constructor): O(n) - Cleanest code, but always checks full array.
 * -------------------------------------------------------------------------
 * TIME COMPLEXITY:  O(n) - Linear time for set insertions and lookups.
 * SPACE COMPLEXITY: O(n) - Set stores up to N elements.
 * -------------------------------------------------------------------------
 * SELECTION NOTE: 
 * I chose approach #2 as the primary solution because it supports 
 * "Short-circuiting". It returns TRUE as soon as the first duplicate is 
 * found, saving CPU cycles on large datasets. 
 * Approach #3 is faster to write but forces a full array traversal every time.
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



function containsDuplicate2(nums: number[]): boolean {
    const alreadySeen = new Set<number>();

    for(const number of nums){
        if(alreadySeen.has(number)) {
            return true;
        }
        alreadySeen.add(number)
    }

    return false;
};

function containsDuplicate3(nums: number[]): boolean{
    return new Set(nums).size !== nums.length
}