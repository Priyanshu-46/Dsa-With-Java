class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
         int count=0;
         int n=colors.length;
         for(int i=0; i<n;i++){
            if(colors[i]==0){
                if(colors[(i+1)%n]==1 && colors[((i-1)+n)%n]==1){
                    count ++;
                }
            }else {
                if(colors[(i+1)%n]==0 && colors[((i-1)+n)%n]==0){
                    count++;
                }
                
                
                
            }
         }
     return count;   
    }
}