class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ls = new ArrayList<>();

        int strow=0;
        int stcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;


        while(strow<=endrow && stcol<=endcol){
            
            //upper-wus constant and wus chagning?
            //row is constant and cols are changing
            for(int j=stcol;j<=endcol;j++){
                ls.add(matrix[strow][j]);
            }


            //right(const is col,change in rows)
            for(int i=strow+1 ; i<=endrow ; i++){
                ls.add(matrix[i][endcol]);
            }


            //bottom(cons is row,changing is col)
            for(int j=endcol-1; j>=stcol; j--){
                if(strow==endrow) break;
               
                ls.add(matrix[endrow][j]);
            }


            //left(constant is col,change is row)
            for(int i=endrow-1; i>=strow+1 ; i--){
                if(stcol==endcol) break;
                ls.add(matrix[i][stcol]);
            }
             

             strow++;
             stcol++;
             endrow--;
             endcol--;

        }
return ls;
    }
}