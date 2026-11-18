class Solution {
   public void rotate(int[][] matrix) {
        int ln =  matrix.length;
        int top = 0;
        int bottom = ln - 1;

        while(top<bottom){
            for(int i=0;i<ln;i++){
                int temp = matrix[top][i];
                matrix[top][i] = matrix[bottom][i];
                matrix[bottom][i] = temp;
            }
            top++;
            bottom--;
        }

        for(int i =0; i<ln; i++ ){
            for(int j =i+1; j<ln; j++ ){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
