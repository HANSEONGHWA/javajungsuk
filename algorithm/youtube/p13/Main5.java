package javajungsuk.algorithm.youtube.p13;

/**
 * 거듭제곱
 * 다음 입력 n의 m승의 결과를 출력하시오.
 *  입력 5,3
 */
public class Main5 {
    public static void main(String[] args) {
        int n = 5;
        int m = 3;
        int res = 1;

        for (int i = 0; i < m; i++) {
            res *= n;
        }
        System.out.println(res);
    }
}
