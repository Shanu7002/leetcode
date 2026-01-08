/*
 * PROBLEM: Contains Duplicate
 * LINK: https://neetcode.io/problems/duplicate-integer
 * -------------------------------------------------------------------------
 * APPROACH EVOLUTION:
 * 1. Optimized (Manual Set): O(n) - Single pass with early exit (O(n) Space).
 * -------------------------------------------------------------------------
 * TIME COMPLEXITY:  O(n) - Linear time for set insertions and lookups.
 * SPACE COMPLEXITY: O(n) - Set stores up to N elements.
 * -------------------------------------------------------------------------
 */
package main

func hasDuplicate(nums []int) bool {
	values := make(map[int]int)

	for _, num := range nums {
		if _, ok := values[num]; ok {
			return true
		}

		values[num] += 1
	}

	return false
}

func mainHasDuplicate() {

}
