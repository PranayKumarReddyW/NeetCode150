class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] ans = new int[k];

        List<List<Integer>> buckets = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            buckets.add(new ArrayList<>());
        }

        for (int i : map.keySet()) {
            int freq = map.get(i);
            buckets.get(freq).add(i);
        }
        int j = 0;
        for (int i = n; n >= n - k - 2; i--) {
            List<Integer> temp = buckets.get(i);
            for(int l=0;l<temp.size();l++){
                ans[j++] = temp.get(l);
                if(j == k) return ans;
            }
        }
        return ans;
    }
}