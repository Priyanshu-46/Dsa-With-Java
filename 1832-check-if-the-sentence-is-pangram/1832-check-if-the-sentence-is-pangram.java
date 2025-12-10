class Solution {
    public boolean checkIfPangram(String sentence) {
        int n = sentence.length();
        if (n < 26) {
            return false;
        }

        boolean[] seen = new boolean[26];

        for (char c : sentence.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                seen[c - 'a'] = true;
            }
        }

        for (boolean b : seen) {
            if (!b) return false;
        }

        return true;
    }
}
