class Solution:
    def countSquares(self, matrix: List[List[int]]) -> int:
        dp,ans = matrix,0
        m = len(matrix)
        n = len(matrix[0])
        for i in range(0,m):
            for j in range(0,n):
                if dp[i][j] ==1 and i>=1 and j >=1:
                    dp[i][j] = min(dp[i-1][j-1],dp[i][j-1],dp[i-1][j]) +1
                ans += dp[i][j]
        return ans