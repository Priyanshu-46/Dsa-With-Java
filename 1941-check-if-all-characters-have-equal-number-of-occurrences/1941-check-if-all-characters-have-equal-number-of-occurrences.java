class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> mp= new HashMap<>();
        for(char c:s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0) +1);

        }
        int d=mp.values().iterator().next();
        for(int c :mp.values()){
            if(c!=d){
                return false;
            }
        }
        return true;
    }
}