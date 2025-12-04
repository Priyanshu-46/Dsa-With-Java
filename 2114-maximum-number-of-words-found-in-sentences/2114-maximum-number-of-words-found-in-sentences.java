
 class Solution {
    public int mostWordsFound(String[] sentences) {
        int freq = 0;

        for (int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].split(" ");
            int count = words.length;
            freq = Math.max(freq, count);
        }

        return freq;
    }
}
