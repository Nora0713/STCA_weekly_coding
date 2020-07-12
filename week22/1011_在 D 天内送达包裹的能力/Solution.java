class Solution {
    public int shipWithinDays(int[] weights, int D) {
        int low = 0, high = 0;
        for(int i =0;i<weights.length;i++){
            low = Math.max(low,weights[i]);
            high += weights[i];
        }
        while(low < high){
            int mid = (low+high)/2;
            // System.out.println(mid+ " " + validate(mid,weights,D));
            if(validate(mid,weights,D)){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }

    private boolean validate(int cap, int[] weights,int D){
        int count = 0;
        for(int i =0;i<weights.length;i++){
            count += weights[i];
            if(count>cap){
                count = weights[i];
                D--;
                if(D<1) return false;
            }
        }
        return true;
    }
}