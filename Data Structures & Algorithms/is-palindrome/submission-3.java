class Solution {
    public boolean isPalindrome(String s) {
        char[] charArr = s.toLowerCase().toCharArray();

        int begin = 0;
        int end = charArr.length - 1;

        for (int i = 0; i < charArr.length; i++) {
            char head = charArr[begin];
            char tail = charArr[end];

            if (!Character.isLetterOrDigit(head)) {
                begin++;
                continue;
            }

            if (!Character.isLetterOrDigit(tail)) {
                end--;
                continue;
            }

            if (head != tail) {
                return false;
            }

            begin++;
            end--;
        }

        return true;
    }
}
