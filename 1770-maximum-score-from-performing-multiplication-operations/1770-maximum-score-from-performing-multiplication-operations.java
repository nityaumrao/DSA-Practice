class Solution {
    public int maximumScore(int[] nums, int[] multipliers) {

        int N = nums.length;
        int M = multipliers.length;

        int current = M;

        int[] maximumScore = new int[M];
        int[] memo = new int[M+1];

        while (--current >= 0) {
            for (int i = 0; i <= current; ++i) {
                int left = memo[i+1] + multipliers[current] * nums[i];
                int right = memo[i] + multipliers[current] * nums[N - current + i - 1];
                maximumScore[i] = Math.max(left, right);
            }
            memo = maximumScore;
        }
        return maximumScore[0];
    }
}