/*
 * PROBLEM: Group Anagrams
 * LINK: https://neetcode.io/problems/anagram-groups
 * -------------------------------------------------------------------------
 * APPROACH EVOLUTION:
 * 1. Sorting-Based: Sort each string and use it as a key & anagrams share the same sorted form. (groupAnagrams)
 * 2. Frequency Counter (Optimized): Count character frequencies (26 letters) & use the count as a unique key. (groupAnagrams2)
 * -------------------------------------------------------------------------
 * TIME COMPLEXITY:
 * - groupAnagrams:  O(n * k log k)
 * - groupAnagrams2: O(n * k)
 * -------------------------------------------------------------------------
 * SPACE COMPLEXITY:
 * - O(n * k) for storing grouped anagrams
 * - O(1) extra space for the frequency array
 * -------------------------------------------------------------------------
 * OPTIMIZATION STRATEGY:
 * - Use a Hash Map for grouping.
 * - Avoid sorting by using character counts.
 * -------------------------------------------------------------------------
 */

function groupAnagrams(strs: string[]): string[][] {
    const map = new Map<string, string[]>();

    for(const str of strs) {
        const key = str.split("").sort().join("")

        if (!map.has(key)) {
            map.set(key, []);
        }
        map.get(key)!.push(str)
    }

    return Array.from(map.values())
}

function groupAnagrams2(strs: string[]): string[][] {
    const map = new Map<string, string[]>();

    for (const str of strs) {
        const count = new Array(26).fill(0);

        for (const char of str) {
            count[char.charCodeAt(0) - 97]++;
        }

        const key = count.join('#');

        if (!map.has(key)) {
            map.set(key, []);
        }
        map.get(key)!.push(str);
    }

    return Array.from(map.values());
}