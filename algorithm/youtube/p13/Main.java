package javajungsuk.algorithm.youtube.p13;

/**
 * 구구단 1
 * 구구단 시작 s부터 f단까지 입력 받아 아래와 같이 출력하시오.
 * 입력 2 3
 */
public class Main {
    public static void main(String[] args) {

        int s = 2;
        int f = 3;
        int num = 0;

        for (int i = s; i <= f; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j +"=" + i*j);
            }
            System.out.println();
        }
    }
}
