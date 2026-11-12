class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s:strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String temp = new String(arr);
            if(map.containsKey(temp)){
                map.get(temp).add(s);
            }else{
                map.put(temp,new ArrayList<String>());
                map.get(temp).add(s);
            }
        }
        for(String s:map.keySet()){
            ans.add(map.get(s));
        }
        return ans;
    }
   
}