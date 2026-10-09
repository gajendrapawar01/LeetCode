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
                    zeroSetter(i,j,matrix,copy);
                }
            }
        }
    }
    public void zeroSetter(int i,int j,int[][] matrix,int[][] copy){
                    int m=matrix.length;
                    int n=matrix[0].length;
                    int u=i-1;
                    int d=i+1;
                    int b=j-1;
                    int f=j+1;
                    while(u>=0 && copy[u][j]!=0){
                        matrix[u][j]=0;
                        u--;
                    }
                    while(d<m && copy[d][j]!=0){
                        matrix[d][j]=0;
                        d++;
                    }
                    while(f<n && copy[i][f]!=0){
                        matrix[i][f]=0;
                        f++;
                    }
                    while(b>=0 && copy[i][b]!=0){
                        matrix[i][b]=0;
                        b--;
                    }
    }
}