package self;

/**
 * @author qiaoying
 * @date 2019-04-17 16:09
 */
public class UniquePaths {
    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }

        }
        return dp[m - 1][n - 1];
    }


    public static void main(String[] args) {
        int m = 7;
        int n = 3;
        System.out.println(uniquePaths(m,n));
    }
}