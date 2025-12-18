class Solution {
    public String firstPalindrome(String[] words) {
        for (String s : words) {
            StringBuilder rev = new StringBuilder(s);
            rev.reverse();
            if (rev.toString().equals(s)) {
                return s;
            }
        }
        return "";
    }
}
