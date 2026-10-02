class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        return IntStream.range(0, nums.length)
            .filter(i -> {
                Integer diff = target - nums[i];
                if (seen.containsKey(diff))
                    return true;
                seen.put(nums[i], i);
                return false;
            })
            .mapToObj(i -> new int[] {seen.get(target - nums[i]), i})
            .findFirst()
            .orElseGet(() -> new int[0]);
    }
}
