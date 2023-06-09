package javajungsuk.algorithm.youtube.p11;

/**
 * 숫자 사각형 (4)
 * 1  2  3  4
 * 2  4  6  8
 * 3  6  9  12
 * 4  8  12 16
 */
public class Main3 {
    public static void main(String[] args) {
        int n = 4;
        int[][] arr = new int[n][n]; //4행 4열 배열 생성

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               arr[i][j] = (i+1)*(j+1);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
