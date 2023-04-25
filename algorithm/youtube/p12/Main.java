package javajungsuk.algorithm.youtube.p12;

/**
 * 숫자 개수 출력
 */
public class Main {
    public static void main(String[] args) {
        int n = 421314248;
        int[] arr = new int[10]; //0~9까지 카운트 하기 위한 배열
        int num = 0;
        int cntnum = 0;
        while (n > 0){
            arr[n % 10]++;  // 해당 숫자의 인덱스 값 증가 int arr[1] = 3; 숫자 1 3개
            n /= 10;
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(i+" : "+arr[i]);
        }
    }
}
