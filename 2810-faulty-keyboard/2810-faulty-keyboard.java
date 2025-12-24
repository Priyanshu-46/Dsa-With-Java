class Solution {
    public String finalString(String s) {
        StringBuilder st=new StringBuilder();
     int   n=s.length();
        for(int i=0; i<n;i++){
           if(s.charAt(i)!='i') {
            st.append(s.charAt(i));
           }else{
            st.reverse();
           }
        }
        return st.toString();
    }
}