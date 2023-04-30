package javajungsuk.algorithm.youtube.p13;

/**
 * 문자열 뒤집기 2
 */
public class Main12 {
    public static void main(String[] args) {
        String n = "qwert";
        String tmp = "";

        for (int i = n.length()-1; i >= 0; i--) {
           tmp += n.charAt(i);
        }
        System.out.println(tmp);
    }
}
