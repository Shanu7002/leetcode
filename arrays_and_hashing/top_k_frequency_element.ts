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