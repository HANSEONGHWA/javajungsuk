package javajungsuk.algorithm.youtube.p11;
/**
 * 숫자 사각형 (2) 아래의 형태로 출력
 * 1  2  3  4
 * 8  7  6  5
 * 9 10 11 12
 * 16 15 14 13
 */
public class Main {
    public static void main(String[] args) {
        int n = 4;
        int[][] arr = new int[n][n];
        //
        for (int i = 0; i < n; i++) {   //행을 중복하는 요소
            if (i % 2 == 0){    // 짝수 인덱스 행일 떄
                for (int j = 0; j < n; j++) { //열 정렬
                    arr[i][j] = i * n + j + 1;
                }
            }else {             //홀수 인덱스 행
                for (int j = n-1; j >= 0; j--) {
                    arr[i][j] = i * n + n - j;
                }
            }

        }
        // 사각형 형태 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
