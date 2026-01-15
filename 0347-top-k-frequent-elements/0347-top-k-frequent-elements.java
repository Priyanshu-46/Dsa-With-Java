class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freqmp= new HashMap<>();
        for(int num:nums){
            freqmp.put(num,freqmp.getOrDefault(num,0) +1);
        }

        PriorityQueue<Integer> pq= new PriorityQueue<>((a,b)->freqmp.get(a)-freqmp.get(b));

        for(int num:freqmp.keySet()){
            pq.offer(num);
            if(pq.size()>k){
                pq.poll();

            }
        }

        int[] result= new int[k];
        int index=0;
        while(!pq.isEmpty()){
            result[index++]=pq.poll();
        }
        return result;
    }
}