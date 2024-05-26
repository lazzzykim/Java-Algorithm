class Solution {
    public int solution(int n, int t) {
        int virusCount = n;

        for (int i = 0; i < t; i++) {
            virusCount *= 2;
        }
        return virusCount;
    }
}