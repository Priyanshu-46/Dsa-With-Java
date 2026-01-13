class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high= maxNum(nums);
        int result=high;
    

    while(low<=high){
        int mid =low + (high-low)/2;

        int sum=0;
        for(int num:nums){
            sum+=Math.ceil((double) num/mid);
        }
        if(sum<=threshold){
            result =mid;
            high=mid-1;
            
        }else {
            low=mid+1;
        }

    }
    
        return result;
    }

    private int  maxNum(int[] nums){
        int max=0;
        for(int i=0; i<nums.length; i++){
           max=Math.max(max,nums[i]);
        }
        return max;
    }
  
    }

