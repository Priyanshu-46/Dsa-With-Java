class Solution {
    public String reverseWords(String s) {
      String  revstring="";
        String[] sp = s.split(" ");
       for(String st : sp){
         StringBuilder sb=new StringBuilder(st);
        String rev=   sb.reverse().toString();
              revstring=revstring +rev +" ";

       }

       return revstring.trim() ;
    }
}