package javajungsuk.algorithm.youtube.p11;

/**
 * 숫자 사각형 (3)
 * 1  5  9   13
 * 2  6  10  14
 * 3  7  11  15
 * 4  8  12  16
 */
public class Main2 {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d",j*n+i+1);
            }
            System.out.println();
        }
    }
}
