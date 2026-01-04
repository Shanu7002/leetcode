/*
 * PROBLEM: Valid Anagram
 * LINK: https://neetcode.io/problems/is-anagram
 * -------------------------------------------------------------------------
 * APPROACH EVOLUTION:
 * 1. Brute Force: O(n^2) - Nested loops (Function: isAnagram)
 * -------------------------------------------------------------------------
 * TIME COMPLEXITY:
 * SPACE COMPLEXITY:
 * PERFORMANCE:
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