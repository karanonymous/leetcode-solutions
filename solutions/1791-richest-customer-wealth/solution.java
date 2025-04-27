class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxx=0;
        for(int[] row : accounts){
            int current=0;
            for(int curr : row){
                current+=curr;

            }
            maxx=Math.max(maxx,current);
        }
        return maxx;
    }
}
