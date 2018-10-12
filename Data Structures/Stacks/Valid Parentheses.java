class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        for(char c: s.toCharArray())
        {
            if(c == '{' || c == '[' || c == '(')
            {
              stack.push(c);  
            }
            else 
            {
                if(!stack.isEmpty() && isBalanced(stack.peek(), c)){
                stack.pop();
                }
                else return false;
            }
        }
        
        return stack.isEmpty();
        
        }
    
    public boolean isBalanced(Character a, Character b){
        if((a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']')){
            return true;
        }
        else return false;
    }
}