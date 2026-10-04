class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> grouped = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            List<String> strList = grouped.getOrDefault(sorted, new ArrayList<>());
            
            strList.add(str);

            grouped.put(sorted, strList);
        }

        List<List<String>> result = new ArrayList<>(grouped.values());

        return result;
    }
}
