/*
 * PROBLEM: Top K Frequent Elements
 * LINK: https://neetcode.io/problems/top-k-elements-in-list
 * -------------------------------------------------------------------------
 * APPROACH EVOLUTION:
 * 1. Sorting Approach (topKFrequent2): 
 * - Frequency Map + Sort keys by value.
 * - Time: O(n log n) due to sorting, where n is the number of unique elements.
 * - Space: O(n) to store the map and keys.
 * * 2. Optimized Bucket Sort (topKFrequent):
 * - Frequency Map + Index-based grouping (Bucket Sort).
 * - Time: O(n) - Linear scan for frequency, then linear scan of buckets.
 * - Space: O(n) - To store the map and the bucket array.
 * -------------------------------------------------------------------------
 * SELECTION NOTE: 
 * Implementation #1 (Bucket Sort) is prioritized for Big Tech standards as it 
 * achieves O(n) linear time complexity. By leveraging the fact that the 
 * maximum frequency is capped at nums.length, we trade space for optimal speed, 
 * avoiding the O(n log n) overhead of traditional sorting.
 * -------------------------------------------------------------------------
 * PERFORMANCE METRICS:
 * TIME COMPLEXITY:  O(n) - Linear time traversal for both Map and Bucket array.
 * SPACE COMPLEXITY: O(n) - Linear space for the Map and the Bucket structure.
 * -------------------------------------------------------------------------
 */

function topKFrequent(nums: number[], k: number): number[] {
    let m = new Map<number, number>();
    const bucket: number[][] = Array.from({ length: nums.length + 1}, () => []);
    const answer: number[] = [];


    for (let num of nums) {
        m.set(num, (m.get(num) || 0) + 1);
    }

    for(const [num, freq] of m) {
        bucket[freq].push(num)
    }

    for(let i = bucket.length - 1; i >= 0 && answer.length < k; i--) {
        if (bucket[i].length > 0) {
            answer.push(...bucket[i])
        }
    }
    return answer.slice(0, k)
}

function topKFrequent2(nums: number[], k: number): number[] {
let m = new Map<number, number>();
  nums.forEach(n => {
    if (!m.has(n)) {
      m.set(n, 1);
    } else {
      m.set(n, m.get(n)! + 1);
    }
  });
  let keys = Array.from(m.keys());
  keys.sort((a, b) => m.get(b)! - m.get(a)!);
  return keys.slice(0, k);
}