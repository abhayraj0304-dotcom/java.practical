class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

        // Step 1: clean string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                sb.append(ch);
            } 
            else if (ch >= '0' && ch <= '9') {
                sb.append(ch);
            }
        }

        // Step 2: check palindrome
        int left = 0;
        int right = sb.length() - 1;

        while (left <= right) {
            if (sb.charAt(left) != sb.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}