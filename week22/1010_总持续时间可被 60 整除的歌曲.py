class Solution:
    def numPairsDivisibleBy60(self, time: List[int]) -> int:
        ans = 0;
        map = dict()
        for t in time :
            # print(t,map.get((60-t%60)%60, 0))
            ans += map.get((60-t%60)%60, 0)
            map[t%60] = map.get(t % 60, 0)+1            
        return ans