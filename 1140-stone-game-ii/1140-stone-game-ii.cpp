class Solution {
public:
    int n;
    vector<vector<int>> dp;
    vector<int> suffix;

    int solve(int i, int M) {
        if (i >= n) return 0;
        if (i + 2 * M >= n) return suffix[i];
        if (dp[i][M] != -1) return dp[i][M];

        int opponent = INT_MAX;
        for (int X = 1; X <= 2 * M; X++) {
            opponent = min(opponent, solve(i + X, max(M, X)));
        }
        return dp[i][M] = suffix[i] - opponent;
    }

    int stoneGameII(vector<int>& piles) {
        n = piles.size();
        dp.assign(n, vector<int>(n + 1, -1));
        suffix = piles;
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] += suffix[i + 1];
        }
        return solve(0, 1);
    }
};