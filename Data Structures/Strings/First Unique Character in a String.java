class Solution {
    public int firstUniqChar(String s) {
        
        Map<Character, Integer> dup = new HashMap<>();
        
        for(int i=0; i< s.length(); i++)
        {
          if(dup.containsKey(s.charAt(i)))
          {
              int count = dup.get(s.charAt(i));
              count++;
              dup.put(s.charAt(i), count);
          }
          else
          {
             dup.put(s.charAt(i), 1); 
          }        
        }
        
        for(int i=0; i< s.length(); i++)
        {
            if(dup.get(s.charAt(i)) == 1)
            {
               return i; 
            }
        }
        
        return -1;
}
}