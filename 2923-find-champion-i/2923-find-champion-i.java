class Solution {
    public int findChampion(int[][] grid) {
        int total=grid.length-2;
        for(int i=0;i<grid.length;i++){
            int ans = 0;
            for(int j=0;j<grid.length;j++){
                if(grid[j][i]==1){
                    ans++;
                }
            }
            if(ans==0)return i;
        }
        return -1;
    }
}