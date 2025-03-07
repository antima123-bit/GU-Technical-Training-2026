//Time complexity: O(m*n)
//Space Complexity: O(m*n)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int r1 = 0;
        int c1 = 0;
        int r2 = matrix.length-1;
        int c2 = matrix[0].length-1;
        while(r1<=r2 && c1<=c2){
            for(int c = c1; c<=c2; c++){
                result.add(matrix[r1][c]);
            }
            for(int r = r1+1; r<=r2;r++){
                result.add(matrix[r][c2]);
            }
            if(r1 < r2 && c1 < c2){
                for(int c = c2-1; c>=c1;c--){
                    result.add(matrix[r2][c]);
                }
                for(int r = r2-1; r>r1;r--){
                    result.add(matrix[r][c1]);
                }
            }
            r1++;
            c1++;
            r2--;
            c2--;
        }
        return result;
    }
}