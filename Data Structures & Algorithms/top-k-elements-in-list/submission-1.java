class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> res = new HashMap<>(); // num -> count

        for (int num : nums) {
            int count = res.getOrDefault(num, 0);
            res.put(num, count + 1);
        }

        return res.entrySet()
            .stream()
            .sorted((a, b) -> Integer.compare(b.getValue(), a.getValue()))
            .limit(k)
            .map(Map.Entry::getKey)
            .mapToInt(Integer::intValue)
            .toArray();
    }
}
