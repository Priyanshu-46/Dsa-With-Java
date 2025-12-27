class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int count0=0;
        int count1=0;
        int left=0;
        int n =s.length();
        int ans=0;
        for(int right=0;right<n;right++){
       char c=s.charAt(right);
         if(c=='0'){
            count0++;
         }else {
            count1++;
         }
         while(count0>k && count1>k){
            char ch=s.charAt(left);
            if(ch=='0'){
            count0--;
         }else {
            count1--;
         }
         left++;
         }
         ans+=(right-left+1);
        }
        return ans;
}    
}