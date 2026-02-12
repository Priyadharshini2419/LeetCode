class Solution {
    public boolean isVowel(char c){
        return c=='a' ||c=='e'||c=='i'||c=='o'||c=='u';
    }
    public int maxVowels(String s, int k) {
        int c=0;
        int m=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                c++;
            }
        }
        m=c;
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                c++;
            }
            if(isVowel(s.charAt(i-k))){
                c--;
            }
            m=Math.max(c,m);
        }
return m;
    }
}