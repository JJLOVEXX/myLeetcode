import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [][]mat = {{1,2,3},{4,5,6},{7,8,9}};
        int K = 1;
        System.out.println(Arrays.deepToString(matrixBlockSum(mat, K)));
    }

    public static int[][] matrixBlockSum(int[][] mat, int K) {

        int row = mat.length;
        int column = mat[0].length;
        int[][] answer = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                int sum = 0;
                for (int r = i - K; r <= i + K; r++) {
                    for (int c = j - K; c <= j + K; c++)
                        if (r>=0&&c>=0&&r<row&&c<column) {
                            sum += mat[r][c];
                        }
                }
                answer[i][j]=sum;
            }
        }
        return answer;
    }


}
