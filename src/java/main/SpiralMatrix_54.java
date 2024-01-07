import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix_54 {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> listResult = new ArrayList<>();
        int line = 0;
        int maxColon = matrix[0].length - 1;
        int maxLine = matrix.length - 1;
        int colon = 0;
        int count = 1;

        while (count <= (matrix.length - 1) * (matrix[0].length - 1)) {
            for (int i = colon; i <= maxColon; i++) {
                listResult.add(matrix[line][i]);
            }
            line++;
            for (int i = line; i <= maxLine; i++) {
                listResult.add(matrix[i][maxColon]);
            }
            maxColon--;
            for (int i = maxColon; i >= colon; i--) {
                listResult.add(matrix[maxLine][i]);
            }
            maxLine--;
            for (int i = maxLine; i >= line; i--) {
                listResult.add(matrix[i][colon]);
            }
            colon++;
            count++;
        }
        print(matrix);
        return listResult;
    }

    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
