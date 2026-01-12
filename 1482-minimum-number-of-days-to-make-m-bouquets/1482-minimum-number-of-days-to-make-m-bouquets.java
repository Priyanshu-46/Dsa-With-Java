class Solution {
        public boolean possible(int[] bloomDay, int day, int m, int k) {
          int flowerCount = 0; 

         int bouquetCount = 0; 

        for (int i = 0; i < bloomDay.length; i++) {

           
            if (bloomDay[i] <= day) { 
                flowerCount++; 
            } else {
                bouquetCount += (flowerCount / k);

                flowerCount = 0; 
            }
        }
      bouquetCount += (flowerCount / k);

      return bouquetCount >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        long totalFlowersNeeded = (long) m * k;
        
        if (totalFlowersNeeded > bloomDay.length) {
            return -1;
        }
        
           int minDay = Integer.MAX_VALUE;
        int maxDay = Integer.MIN_VALUE;

        for (int i = 0; i < bloomDay.length; i++) {
            minDay = Math.min(minDay, bloomDay[i]);
            maxDay = Math.max(maxDay, bloomDay[i]);
        }

        int low = minDay;
        int high = maxDay;

        while (low <= high) {
            int mid = (low + high) / 2;

              if (possible(bloomDay, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return low;
    }
}