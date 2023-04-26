package javajungsuk.algorithm.youtube.p13;

/**
 * 별 출력 1
 * 입력 n을 받아 아래와 같은 *을 출력하시오.
 * 
 * *
 * * *
 * * * *
 * * * * *
 */
public class Main2 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {   //행
            for (int j = 0; j < i+1; j++) {       //열
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
