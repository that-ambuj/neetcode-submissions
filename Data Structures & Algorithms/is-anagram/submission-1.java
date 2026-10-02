class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false; // return early if lengths don't match
        }

        Map<Character, Integer> countS = new HashMap<>();
        Map<Character, Integer> countT = new HashMap<>();

        for (Character sChar : s.toCharArray()) {
            countS.merge(sChar, 1, Integer::sum);
        }

        for (Character tChar: t.toCharArray()) {
            countT.merge(tChar, 1, Integer::sum);
        }

        return countS.equals(countT);
    }
}
