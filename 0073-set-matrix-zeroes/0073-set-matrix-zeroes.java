class Solution {
    public void setZeroes(int[][] matrix) {

        int m=matrix.length;
        int n=matrix[0].length;
        int[][] copy = Arrays.stream(matrix)
                     .map(int[]::clone)
                     .toArray(int[][]::new);

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int num = copy[i][j];
                if(num==0){
                    zeroSetter(i,j,matrix);
                }
            }
        }
    }
    public void zeroSetter(int i,int j,int[][] matrix){
                    int m=matrix.length;
                    int n=matrix[0].length;

                    for(int x=0;x<matrix[0].length;x++){
                        matrix[i][x]=0;    
                    }
                    for(int x=0;x<matrix.length;x++){
                        matrix[x][j]=0;
                    }
    }
}