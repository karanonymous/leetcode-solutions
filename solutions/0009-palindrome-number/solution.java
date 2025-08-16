class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int neew=0;
        while(temp>0){
            int rem=temp%10;
            neew=(neew*10)+rem;
            temp=temp/10; 
        }
        return x==neew;
    }
}
