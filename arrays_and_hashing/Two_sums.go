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

func main() {
	fmt.Println(twoSum([]int{3, 4, 5, 6}, 7))
}
