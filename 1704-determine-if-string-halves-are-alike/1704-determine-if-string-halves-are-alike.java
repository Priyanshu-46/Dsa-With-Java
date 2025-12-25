class Solution {
    public boolean halvesAreAlike(String s) {
     int   n=s.length()/2;
        int count=0;
       String a=   s.toLowerCase().substring(0,n);
       String b= s.toLowerCase().substring(n,s.length());
       for(char ch:a.toCharArray()){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            count++;

        }
       }
        for(char ch:b.toCharArray()){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            count--;

        }
       }
       if(count==0){
        return true;
       }
       return false;
    }
}