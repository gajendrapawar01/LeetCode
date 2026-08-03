class Solution {
    public int countPrefixes(String[] words, String s) {
        int count =0;
        for(int i=0;i<words.length;i++){
            boolean found=true;
            for(int j=0;j<words[i].length();j++){
                if(words[i].charAt(j)!=s.charAt(j) || words[i].length()>s.length()){
                    found=false;
                    break;
                }
            }
            if(found){
                count++;
            }
        }
        return count;
    }
}