class Solution {
    public int countConsistentStrings(String allowed, String[] words) {

        int count = 0;

        for(String w : words){          
            boolean flag = true;

            for(char c : w.toCharArray()){   
                if(!allowed.contains(String.valueOf(c))){
                    flag = false;
                    break;
                }
            }

            if(flag){
                count++;
            }
        }
        return count;
    }
}
