class Solution:
    def maxScoreSightseeingPair(self, A: List[int]) -> int:
        ans = 0 
        max_i = A[0] + 0
        for j in range(1,len(A)):
            ans = max(max_i + A[j] - j,ans)
            max_i = max(max_i,A[j]+j)
        return ans