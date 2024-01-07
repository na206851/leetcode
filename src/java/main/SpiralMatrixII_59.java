public class SpiralMatrixII_59 {

    public int[][] spiralMatrix(int n) {
        int m = n;
        int[][] matrix = new int[n][m];
        int count = 1;
        int line = 0;
        int maxColon = matrix[0].length - 1;
        int maxLine = matrix.length - 1;
        int colon = 0;

        while (count <= m * n) {
            for (int i = colon; i <= maxColon; i++) {
                matrix[line][i] = count++;
            }
            line++;
            for (int i = line; i <= maxLine; i++) {
                matrix[i][maxColon] = count++;
            }
            maxColon--;
            for (int i = maxColon; i >= colon; i--) {
                matrix[maxLine][i] = count++;
            }
            maxLine--;
            for (int i = maxLine; i >= line; i--) {
                matrix[i][colon] = count++;
            }
            colon++;
        }
        SpiralMatrix_54.print(matrix);
        return matrix;
    }
}
