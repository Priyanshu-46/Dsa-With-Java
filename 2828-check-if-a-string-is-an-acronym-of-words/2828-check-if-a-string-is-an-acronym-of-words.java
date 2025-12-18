class Solution {
    public boolean isAcronym(List<String> words, String s) {
       String acr="";
        for(String word :words){
          acr+=word.charAt(0);  
        }
        return (acr.equals(s));
    }
}