class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int left=1;
       int right=findMaxPiles(piles);

       while(left<=right){
        int mid= left+(right-left)/2;
      int hourSpent= calculateHoursSpent(piles,mid);
         if(hourSpent<=h){
            right=mid-1;
         }   else{
            left=mid+1;
         }
    
       }
       return left; 
    }

 private int  findMaxPiles(int[] piles){
       int max=piles[0];
        for(int i=1; i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        return max;
    }
private int calculateHoursSpent(int[] piles, int k) {
      
        int hoursSpent = 0; 
        for (int pile : piles) {
            hoursSpent += Math.ceil((double)(pile) / (double)(k));
        }

        return hoursSpent; 
    }

}