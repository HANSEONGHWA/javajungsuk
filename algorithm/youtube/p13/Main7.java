package javajungsuk.algorithm.youtube.p13;

/**
 * 369게임 2
 */
public class Main7 {
    public static void main(String[] args) {
        int n = 100;

        for (int i = 0; i < n; i++) {
            if (i/10==3 || i/10==6 || i/10 == 9){
                System.out.print("짝");
                if (i%10==3 || i%10==6 || i%10 == 9){
                    System.out.print("짝");
                }
            } else{
                System.out.print(i);
            }
            System.out.print(" ");

        }
    }
}
