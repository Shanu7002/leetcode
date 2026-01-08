/*
 * PROBLEM: Valid Anagram
 * LINK: https://neetcode.io/problems/is-anagram
 * -------------------------------------------------------------------------
 * APPROACH EVOLUTION:
 * 1. Optimized:   O(n)   - Frequency mapping using a Map.
 * -------------------------------------------------------------------------
 * TIME COMPLEXITY:  O(n) - Single pass to count, single pass to verify.
 * SPACE COMPLEXITY: O(k) - Where k is the number of unique characters (max 26 for alphabet).
 * -------------------------------------------------------------------------
 */

package main

func isAnagram(s, t string) bool {
	if len(s) != len(t) {
		return false
	}
	letters := make(map[string]int)

	for _, letter := range s {
		letters[string(letter)]++
	}

	for _, letter := range t {

		if letters[string(letter)] == 0 {
			return false
		}

		letters[string(letter)]--
	}
	return true
}

func main() {

}
