class Solution {
    public int[] searchRange(int[] nums, int target) {
       
        int firstOcc= findBound(nums,target,true);
        int lastOcc=findBound(nums,target ,false);

        return new int[]{firstOcc,lastOcc};
        
    }
    private int findBound(int[] nums,int target,boolean isfirst){
 int left=0;
        int right=nums.length-1;
   int bound=-1;
   while(left<=right){
    int mid=left+(right-left)/2;
    if(nums[mid]==target){
        bound=mid;
        if (isfirst){
            right=mid-1;
        }else{
            left=mid+1;
        }
    }else if(nums[mid]>target){
        right=mid-1;

    }else{
        left=mid+1;
    }
   }
   return bound;

    }
}