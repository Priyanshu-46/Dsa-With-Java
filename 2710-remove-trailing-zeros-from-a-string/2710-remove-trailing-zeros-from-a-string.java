class Solution {
    public String removeTrailingZeros(String num) {
       int n =num.length();
       int i=0;
        for( i=n-1;i>0;i--){
            if(num.charAt(i)!='0'){
                break;
            }
        }
        String s= num.substring(0,i+1);
        return s;
    }
}