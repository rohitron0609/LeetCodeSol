/*
public class MinAddToMakeParenthesisValid {
    public int minAddToMakeValid(String s){
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if (c == '(')
                st.push('(');
            else{
                if(!st.isEmpty() && st.peek() == '('){
                    st.pop();
                }else{
                    st.push(')');
                }
            }
        }
        return st.size();
    }
}
 */