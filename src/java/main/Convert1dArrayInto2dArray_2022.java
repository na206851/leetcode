public class Convert1dArrayInto2dArray_2022 {

    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] arr = new int[m][n];
        int count = 0;
        if (original.length != n * m) {
            return new int[0][0];
        } else {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = original[count++];
                }
            }
            return arr;
        }
    }
}
