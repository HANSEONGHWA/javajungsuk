package javajungsuk.algorithm.youtube.p13;

/**
 * 문자열 뒤집기
 */
public class Main11 {
    public static void main(String[] args) {
    String n = "ADEFH";
    //char문자열로 변환
    char[] str = n.toCharArray();
    char tmp;
    //문자열의 길이
    int len = str.length;
        System.out.println(str);


        for (int i = 0; i < len/2; i++) {
            tmp = str[i];
            str[i] = str[len-i-1];
            str[len-i-1] = tmp;
        }
        System.out.println(str);


    }
}
