class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        for(char c: s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[')
                stack.push(c);
            
            else {
                if(!stack.empty()) {
                    if(stack.peek() == '(' && c == ')')
                        stack.pop();
                    else if(stack.peek() == '[' && c == ']')
                        stack.pop();
                    else if(stack.peek() == '{' && c == '}')
                        stack.pop();
                    else
                        return false;
                }
                
                else 
                    return false;
            }
        }
        
        return stack.empty();
            
        
        
        
        
    }
}
