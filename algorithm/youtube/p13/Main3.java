package javajungsuk.algorithm.youtube.p13;

/**
 * 별 출력 2
 */
public class Main3 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i>j){       // i가 2행일 떄 j는 1열까지 공백을 찍음.
                    System.out.print(" ");
                }else
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
