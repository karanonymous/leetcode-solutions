class Solution {
    public int reverse(int n) {
        int rem=0;
        int sum=0;
        while(n!=0){
            rem=n%10;
            
            if(sum>Integer.MAX_VALUE/10|| sum<Integer.MIN_VALUE/10){
                return 0;
            }
            sum=(sum*10)+rem;
            n=n/10;
        }
        return sum;
        
    }
}
