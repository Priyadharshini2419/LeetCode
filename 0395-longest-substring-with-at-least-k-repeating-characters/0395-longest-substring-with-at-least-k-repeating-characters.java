class Solution {
    public static boolean check(int hash[],int k){
        for(int x:hash){
            if(x>0&&x<k){
                return false;
            }
        }
        return true;
    }
    public int longestSubstring(String s, int k) {
        int maxi=0;
        for(int i=0;i<s.length();i++){
            int []hash=new int[26];
            for(int j=i;j<s.length();j++){
                char c=s.charAt(j);
                hash[c-'a']++;
                if(check(hash,k)){
                    int len=j-i+1;
                    maxi=Math.max(len,maxi);
                }
            
            }
        }
        return maxi;
    }
}