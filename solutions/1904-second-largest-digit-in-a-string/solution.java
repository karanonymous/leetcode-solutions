class Solution {
    public int secondHighest(String s) {
        int max=-1;
        int m2=-1;
        for(char a:s.toCharArray()){
            if(!Character.isLetter(a)){
                int temp=a-'0';
                if(max<temp){
                    m2=max;
                    max=temp;
                }
                else if(max>temp && temp>m2){
                    m2=temp;
                }
                
                

            }
        }
        return m2;
            
        }
    }

