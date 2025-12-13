class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
       int count=0;
        String[] texts= text.split(" ");
        for(String s : texts){
            boolean flag =true;
            for(char c: brokenLetters.toCharArray()){
                if(s.contains(""+c)){
                    flag =false;
                 break;
                }
                

            }
            if(flag){
                count++;
            }
        }
        return count;
    }
}