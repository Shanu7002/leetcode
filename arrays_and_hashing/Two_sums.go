/*
 * PROBLEM: Two sums
 * LINK: https://neetcode.io/problems/two-integer-sum
 * -------------------------------------------------------------------------
 * APPROACH EVOLUTION:
 * 1. Optimized: O(n) - Map one pass
 * -------------------------------------------------------------------------
 * TIME COMPLEXITY:  O(n) - Constant time loop with Map
 * SPACE COMPLEXITY: O(n) - Storing up to N elements in the Map
 * -------------------------------------------------------------------------
 */
package main

import "fmt"

func twoSum(nums []int, target int) []int {
	numbers := make(map[int]int)

	for i, num := range nums {
		completeNumber := target - num

		if index, ok := numbers[completeNumber]; ok {
			return []int{index, i}
		}

		numbers[num] = i
	}

	return []int{}
}

func mainTwoSums() {
	fmt.Println(twoSum([]int{3, 4, 5, 6}, 7))
}
