class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] freq = new List[nums.length + 1];
        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        count.forEach((num, occurences) -> freq[occurences].add(num));
        
        List<Integer> res = new ArrayList<>();

        for (int i = freq.length - 1; i >= 0; i--) {
            for (int val : freq[i]) {
                res.add(val);
                if (res.size() == k) {
                    return res.stream().mapToInt(Integer::intValue).toArray();
                }
            }
        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
