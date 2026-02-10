class Solution {
    public int uniqueMorseRepresentations(String[] words) {
           String []m={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    
    Set<String>Set=new HashSet<>();
    for(String word:words){
        StringBuilder sb=new StringBuilder();
        for(char ch:word.toCharArray()){
            sb.append(m[ch-'a']);
            
        }
        Set.add(sb.toString());
    }
        return Set.size();
    }
}