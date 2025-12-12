class Solution {
    public int reverseDegree(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            int reverseValue = 26 - (c - 'a');

            int position = i + 1; 

            result += reverseValue * position;
        }

        return result;
    }
}
