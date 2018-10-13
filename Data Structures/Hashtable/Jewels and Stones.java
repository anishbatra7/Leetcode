class Solution {
    public int numJewelsInStones(String J, String S) {
        
        Set<Character> stoneSet = new HashSet<>();
        
        for(char c: J.toCharArray()){
           stoneSet.add(c);
        }
        
        int ans = 0;
        
        for(char c: S.toCharArray()){
            if(stoneSet.contains(c)){
                ans++;
            }
        }
        
        return ans;
    }
}