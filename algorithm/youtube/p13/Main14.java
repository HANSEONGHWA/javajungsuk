package javajungsuk.algorithm.youtube.p13;

/**
 * 더하기 사이클
 * 입력 : 26
 * 26 2+6=8 > 68 6+8=14 > 84 8+4=12 > 42 4+2=6 >26
 */
public class Main14 {
    public static void main(String[] args) {

        int n = 26;
        int res = n;
        int tmp = 0;
        int cnt = 0;

        do {
            tmp = res / 10 + res % 10;
            res = res % 10 * 10 + tmp % 10;
            cnt++;
        }while(n != res);
            System.out.println(cnt);
    }
}
