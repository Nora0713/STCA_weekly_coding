class Solution:
    def prefixesDivBy5(self, A: List[int]) -> List[bool]:
        ans = []
        increased_num = 0
        for index,value in enumerate(A):
            increased_num = (increased_num * 2 + value) % 10
            if increased_num % 5==0 :
                ans.append( True )
            else:
                ans.append( False )
        return ans