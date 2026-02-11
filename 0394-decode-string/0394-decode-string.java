import java.util.Stack;

class Solution {
    public String decodeString(String str) {

        Stack<Integer> n = new Stack<>();
        Stack<StringBuilder> st = new Stack<>();

        StringBuilder ans = new StringBuilder();
        int num = 0;  

        for(char c : str.toCharArray()) {

            if(Character.isDigit(c)) {
                num = (num * 10) + (c - '0');
            }

            else if(c == '[') {
                n.push(num);                           num = 0;

                st.push(ans);         
                ans = new StringBuilder();
            }

            else if(c == ']') {
                String temp = ans.toString();
                ans = new StringBuilder(
                        temp.repeat(n.pop())
                );

                ans = st.pop().append(ans);
            }

            else {
                ans.append(c);
            }
        }

        return ans.toString();
    }
}
