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

    console.log(bucket)
    console.log(m)

    return answer.slice(0, k)
}

console.log(topKFrequent([5, 1, 2, 3, 4, 1, 2, 3], 1))