package javajungsuk.algorithm.youtube.p13;

/**
 * 369게임
 * 100까지 369 게임을 아래와 같이 진행하시오.
 */
public class Main6 {

    public static int getNum(int i){
        int j = 0;

        while (i>0){
            if (i%10==3 || i%10==6 || i%10 == 9)
                j++;
            i/=10;
        }
        return j;
    }


    public static void main(String[] args) {
        int n = 100;

        for (int i = 1; i < n; i++) {
            int cnt = getNum(i);

            if (cnt==0){
                System.out.print(i +" ");
            }else {
                for (int j = 0; j < cnt; j++) {
                    System.out.print("짝");
                }
                System.out.print(" ");
            }

        }
    }
}
