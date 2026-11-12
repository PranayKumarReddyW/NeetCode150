class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums){
            if(set.contains(i)) return true;
            set.add(i);
        }
        return false;
    }
}

// --> We need to find whether a duplicate number exists i.e a number with freq > 1
// can use nested loop -> n^2 time and O(1) - space
// use hashmap - O(n) and (O)n  or hashset