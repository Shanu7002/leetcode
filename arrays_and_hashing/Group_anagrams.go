/*
 * PROBLEM: Group Anagrams
 * LINK: https://neetcode.io/problems/anagram-groups
 * -------------------------------------------------------------------------
 * APPROACH EVOLUTION:
 * 1. Frequency Counter: Count character frequencies (26 letters) & use the count as a unique key.
 * -------------------------------------------------------------------------
 * TIME COMPLEXITY: O(n * k)
 * -------------------------------------------------------------------------
 * SPACE COMPLEXITY: O(1) extra space for the frequency array
 * -------------------------------------------------------------------------
 */

 package main

func keyByCount(s string) string {
	count := [26]int{}

	for _, ch := range s {
		count[ch-'a']++
	}

	return fmt.Sprint(count)
}


func anagramGroups(strs []string) [][]string {
	m := make(map[string][]string)

	for _, str := range strs {
		key := keyByCount(str)
		m[key] = append(m[key], str)
	}

	result := [][]string{}
	for _, group := range m {
		result = append(result, group)
	}

	return result
}

func anagramGroups2(strs []string) [][]string {
	m := make(map[[26]int][]string)

	for _, str := range strs {
		var count [26]int

		for _, ch := range str {
			count[ch-'a']++
		}
		
		m[count] = append(m[count], str)
	}

	result := make([][]string, 0, len(m))
	for _, group := range m {
		result = append(result, group)
	}

	return result
}