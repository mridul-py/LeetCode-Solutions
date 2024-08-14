class Solution {
    // Method to check if a substring is a palindrome
    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        int maxLength = 0;
        String result = "";
        
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPalindrome(s, i, j) && (j - i + 1) > maxLength) {
                    maxLength = j - i + 1;
                    result = s.substring(i, j + 1);
                }
            }
        }
        
        return result;
    }
}
