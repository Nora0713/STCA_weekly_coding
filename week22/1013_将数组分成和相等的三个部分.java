class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for(int a: A){
            sum += a;
        }
        if(sum % 3 !=0 )return false;
        int per_sum = sum / 3;
        int count = 0;
        sum = 0;
        for(int i=0;i<A.length;i++){
            sum+=A[i];
            if(sum == per_sum){
                count++;
                sum=0;
            }
        }
        if(count <3)return false;
        return true;
    }
}