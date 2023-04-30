package javajungsuk.algorithm.youtube.p13;

/**
 * 팰린드롬(가운데를 기준으로 하여 대칭인 문자나 숫자)
 * 12321 / 기러기
 */
public class Main10 {
    public static void main(String[] args) {
        //index 문자열을 비교하기 위해 String으로 받음.
    String n = "12321";
        //문자열의 길이
    int len = n.length();
    boolean flag = true;

        for (int i = 0; i < len/2; i++) {
            //(문자열 반환 / 뒤의 문자열 반환 (i가 1일때 5-1-1=3=> 3번째 인덱스 반환))
            //1번이라도 같지 않으면 false반환.
            if (n.charAt(i) != n.charAt(len-i-1)){
                flag = false;
            }
        }
        System.out.println(flag);

    }
}
