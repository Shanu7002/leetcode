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

function isAnagram2(s: string, t: string): boolean{
    if(s.length !== t.length){
        return false
    }
    let count = new Map<string, number>();

    for(const char of s) {
        count.set(char, (count.get(char) || 0) + 1);
    }
    for(const char of t) {
        if(!count.has(char) || count.get(char) === 0){
            return false;
        }
        count.set(char, count.get(char)! - 1)
    }
    return true;
}

console.log(isAnagram2("anagram", "nagaraj"))