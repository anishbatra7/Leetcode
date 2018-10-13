class Solution {
    public boolean isAnagram(String s, String t) {
        
         Map<Character, Integer> count = new HashMap<>();
        
        for(char c : s.toCharArray()){
            if(count.containsKey(c)){
                int number = count.get(c);
                count.put(c, number + 1);
            }
            else{
                count.put(c, 1);
            }
        }
        
        for(char c: t.toCharArray()){
         if(count.containsKey(c)){
             int number = count.get(c);
             count.put(c, number - 1);
             
             if(count.get(c) == 0)
             {
                 count.remove(c);
             }
         }
         else
         {
             return false;
         }
        }
                
        return count.isEmpty();
    }
}