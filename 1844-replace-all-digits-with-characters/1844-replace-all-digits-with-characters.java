   class Solution {
    public String replaceDigits(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                result.append(s.charAt(i));  
            } else {
                char prev = s.charAt(i - 1);
                int shift = s.charAt(i) - '0'; 
                char shifted = (char) (prev + shift);
                result.append(shifted);
            }
        }

        return result.toString();
    }
}
 
