class Solution {
    public int diagonalSum(int[][] mat) {
        int count = 0;
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[0].length; j++){
                if (i==j){
                    count += mat[i][j];
                }
                else if (i == mat.length-j-1){
                    count += mat[i][j];
                }
            }
        }
        return count;
    }
}