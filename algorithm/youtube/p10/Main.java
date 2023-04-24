package javajungsuk.algorithm.youtube.p10;
/**
 * 숫자 사각형 (1)
 * 입력된 수(N)만큼 N행 N열의 형태로 연속으로 출력되는 숫자 사각형을 출력하시오.
 * N = 4, 4열 4행 출력
 */
public class Main {
    public static void main(String[] args) {
        int n = 4;
        int num = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
//                System.out.printf("%4d", i*(n) +j +1);
                System.out.printf("%4d",num);
                num++;
            }
            System.out.println();
        }
    }
}
