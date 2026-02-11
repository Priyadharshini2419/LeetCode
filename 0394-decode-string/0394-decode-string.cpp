class Solution {
public:
    string decodeString(string s) {
        stack<pair<string,int>>st;
        int cn=0;
        string cs="";
        for(char ch:s){
            if(isdigit(ch)){
                cn=cn*10+ch-'0';
            }
         else  if(ch=='['){
                st.push({cs,cn});
                cn=0;
                cs="";
            }
            else if(ch==']'){
                auto[p,n]=st.top();
                st.pop();
                string t="";
                for(int i=0;i<n;i++){
                    t+=cs;
                }
                cs=p+t;
            }
            else{
                cs+=ch;
            }
        }
        return cs;
    }
};