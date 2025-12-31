class Solution {
    public int balancedStringSplit(String s) {
        int n=s.length();
        int Rcount=0;
        int Lcount=0;
        int count=0; 
            for(int j=0;j<n;j++){
            if(s.charAt(j)=='R'){
                Rcount++;
            }else{
                Lcount++;
            }
            if(Rcount==Lcount){
                count++;
                Rcount=0;
                Lcount=0;
            }

            }
        
        return count;
    }
}