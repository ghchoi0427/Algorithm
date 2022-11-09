package cjenm.종이자르기;

class Solution {
    public int solution(int M, int N) {
        int min = Math.min(M, N);
        int max = Math.max(M, N);
        return (min - 1) + (max - 1) * (min);
    }
}