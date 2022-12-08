package leetcode._349;

import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.stream(nums1).forEach(set::add);
        HashSet<Integer> result = new HashSet<>();

        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                result.add(nums2[i]);
            }
        }

        int[] res = new int[result.size()];
        int idx = 0;
        for (Integer i : result) {
            res[idx++] = i;
        }
        return res;
    }
}