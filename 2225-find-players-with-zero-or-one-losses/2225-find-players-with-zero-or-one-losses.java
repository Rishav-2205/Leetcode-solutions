class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < matches.length; i++) {
            map.merge(matches[i][0], 0, Integer::sum);
            map.merge(matches[i][1], 1, Integer::sum);
        }

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());

        for(var entry : map.entrySet()) {
            if(entry.getValue() == 0) {
                ans.get(0).add(entry.getKey());
            } else if(entry.getValue() == 1) {
                ans.get(1).add(entry.getKey());
            }
        }

        Collections.sort(ans.get(0));
        Collections.sort(ans.get(1));

        return ans;
    }
}