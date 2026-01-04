/*
 * PROBLEM: Valid Anagram
 * LINK: https://neetcode.io/problems/is-anagram
 * -------------------------------------------------------------------------
 * APPROACH EVOLUTION:
 * 1. Brute Force: O(n^2) - Using .includes() and .replace() inside a loop. (Function: isAnagram)
 * 2. Optimized:   O(n)   - Frequency mapping using a Hash Map. (Function: isAnagram2)
 * -------------------------------------------------------------------------
 * TIME COMPLEXITY:  O(n) - Single pass to count, single pass to verify.
 * SPACE COMPLEXITY: O(k) - Where k is the number of unique characters (max 26 for alphabet).
 * PERFORMANCE: Beats 83.39% in Runtime
 * -------------------------------------------------------------------------
 * OPTIMIZATION STRATEGY: 
 * Used a Frequency Counter pattern. The initial length check provides an O(1) 
 * early exit. The Map ensures constant time O(1) lookups and updates.
 * -------------------------------------------------------------------------
 */

function isAnagram(s: string, t: string): boolean{
    if(s.length !== t.length){
        return false
    }
    for(let letter of s){
        if(!t.includes(letter)){
            return false
        }
        t = t.replace(letter, "");
    }
    return true;
}

function isAnagram2(s: string, t: string): boolean{
    if(s.length !== t.length)return false;

    let count = new Map<string, number>();

    for(const char of s) {
        count.set(char, (count.get(char) || 0) + 1);
    }
    for(const char of t) {
        const currentCount = count.get(char);

        if(!currentCount){
            return false;
        }

        count.set(char, currentCount - 1)
    }
    return true;
}