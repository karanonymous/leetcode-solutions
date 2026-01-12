class Solution {
    public int[] twoSum(int[] n, int sum) {
        int i=0;
        int j=n.length-1;
        int []ret =  new int[2];
        while(i<j){
            if(n[i]+n[j]==sum){
                ret[0]=i+1;
                ret[1]=j+1;
                return ret;
            }
            else if(n[i]+n[j]<sum){
                i++;
                continue;
            }
            else if(n[i]+n[j]>sum){
                j--;
                continue;
            }
        }
        return null;

    }
}
