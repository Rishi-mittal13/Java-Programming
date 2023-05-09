import java.util.*;
class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        TreeMap<Integer, Integer> minimumheap = new TreeMap<>();
        TreeMap<Integer, Integer> maximumheap = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            minimumheap.put(num, minimumheap.getOrDefault(num, 0) + 1);
            if (i >= k) {
                int outOfWindow = nums[i - k];
                minimumheap.put(outOfWindow, minimumheap.get(outOfWindow) - 1);
                if (minimumheap.get(outOfWindow) == 0) {
                    minimumheap.remove(outOfWindow);
                }
            }
            if (i >= k - 1) {
                int count = 0;
                int beautifulValue = 0;
                for (Map.Entry<Integer, Integer> entry : minimumheap.entrySet()) {
                    count += entry.getValue();
                    if (count >= x) {
                        beautifulValue = entry.getKey();
                        break;
                    }
                }
                ans[i - k + 1] = beautifulValue < 0 ? beautifulValue : 0;
            }
        }
        return ans;
    }
}
