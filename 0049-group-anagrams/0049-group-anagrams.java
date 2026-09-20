class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String currStr=strs[i];
            char[] ch=currStr.toCharArray();
            Arrays.sort(ch);
           String key = new String(ch);
           map.putIfAbsent(key, new ArrayList<>());
           map.get(key).add(currStr);
        }
        return new ArrayList<>(map.values());
    }
}