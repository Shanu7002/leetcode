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

func main() {

}
