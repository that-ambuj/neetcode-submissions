class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indices =
            IntStream.range(0, nums.length)
                .boxed()
                .collect(Collectors.toMap(i -> nums[i], i -> i, (a, newIdx) -> newIdx));

        return IntStream.range(0, nums.length)
            .filter(i -> {
                Integer j = indices.get(target - nums[i]);
                return j != null && j != i;
            })
            .mapToObj(i -> new int[] {i, indices.get(target - nums[i])})
            .findFirst()
            .orElseGet(() -> new int[0]);
    }
}
