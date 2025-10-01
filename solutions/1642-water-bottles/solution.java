class Solution {
    public int numWaterBottles(int numBottles, int exc) {
        int filled=numBottles;
        int div=filled;
        while(true){
            int temp=0;
            
           filled=filled+(div/exc);
            temp=(div/exc)+(div%exc);
            if(temp<exc) break;
            div=temp;
        }
        return filled;
    }
}
