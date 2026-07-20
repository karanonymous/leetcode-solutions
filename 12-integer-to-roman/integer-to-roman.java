class Solution {
    public String intToRoman(int num) {
        String res="";
        String[] st={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] val={1000,900,500,400,100,90,50,40,10,9,5,4,1};

        //sabse zyada value se compare karenge ki kitne baar aaya hai
        for(int i = 0 ; i < val.length ; i++){
            //value corresponding string ko res me daalo
            // num-value
            while(num>=val[i]){
                res+=st[i];
                num-=val[i];
            }
        } 

        return res;
    }
}