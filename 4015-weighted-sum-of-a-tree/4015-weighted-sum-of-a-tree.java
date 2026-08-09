class Solution {
    public long weightedSum(int[] parent, int[] nums) {
        int n = parent.length;
        int[] depth = new int[n];
        int[] path = new int[n];
        depth[0] = 1;
        int h = 1;
        for (int i = 1; i < n; i++) {
            if (depth[i] != 0)
                continue;

            int curr = i;
            int len = 0;
            while (depth[curr] == 0) {
                path[len++] = curr;
                curr = parent[curr];
            }
            int d = depth[curr];
            while (len > 0) {
                int node = path[--len];
                depth[node] = ++d;
                h = Math.max(h, d);
            }
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += 1L * nums[i] * (h - depth[i] + 1);
        }
        return ans;
    }
}