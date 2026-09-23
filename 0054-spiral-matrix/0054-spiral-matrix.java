class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int row = matrix.length;
        int column = matrix[0].length;

        int num = 0;
        int n = row * column;
        int diff=0;

        int i=0;
        int j=0;
        while(num<n){
            while(j<column-diff && num<n){
                list.add(matrix[i][j]);
                num++;
                j++;
            }
            j--;
            i++;
            while(i<row-diff && num<n){
                list.add(matrix[i][j]);
                num++;
                i++;
            }
            i--;
            j--;
            while(j>=0+diff && num<n){
                list.add(matrix[i][j]);
                num++;
                j--;
            }
            j++;
            i--;
            diff++;
            while(i>=diff && num<n){
                list.add(matrix[i][j]);
                num++;
                    i--;
            }
            i++;
            j++;
        }
        return list;
    }
}









/*import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return result;

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // 1. Traverse Right
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++;

            // 2. Traverse Down
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            // 3. Traverse Left (check if row boundary is still valid)
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }

            // 4. Traverse Up (check if column boundary is still valid)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }
}*/