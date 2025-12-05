class Solution {
   public String reversePrefix(String word, char ch) {
    int index = -1;

    for (int i = 0; i < word.length(); i++) {
        if (ch == word.charAt(i)) {
            index = i;
            break; // stop at first occurrence
        }
    }

    if (index < 0) {
        return word;
    } else {
        String prefix = word.substring(0, index + 1);
        String remainder = word.substring(index + 1);

        return new StringBuilder(prefix).reverse().toString() + remainder;
    }
}

}