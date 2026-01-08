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
