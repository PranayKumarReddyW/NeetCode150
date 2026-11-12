class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> map = new HashMap<>();   
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            if(!map.containsKey(c) || map.get(c) == 0) return false;
            map.put(c,map.get(c)-1);
        }
        return true;
    }
}

// Need to check whether having same freq of chars in both or not..
// Base case : if lengths are not same 
// Storing freq - HashMap or 26 sized array to store freq