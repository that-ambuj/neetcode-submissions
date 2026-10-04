class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> grouped = new HashMap<>();

        for (String str : strs) {
            int[] count = new int[26];

            for (char ch : str.toCharArray()) {
                count[ch - 'a']++;
            }

            String key = Arrays.toString(count);
            grouped.putIfAbsent(key, new ArrayList<>());
            grouped.get(key).add(str);
        }

        return new ArrayList<>(grouped.values());
    }
}
