package javajungsuk.algorithm.youtube.p13;

/**
 * 평균은 넘겠지
 * 학생 수와 점수들이 순서대로 입력된다. 평균보다  점수가 높은 학생들의 비율을 출력하시오.
 */
public class Main13 {
    public static void main(String[] args) {

        int[] n = {7, 100, 95, 90, 80, 70, 60, 50};

        int sum = 0;
        for (int i = 1; i < n.length; i++) {
            sum += n[i];
        }

        double avg = (double) sum/n[0];

        int tmp =0;
        for (int i = 1; i < n.length; i++) {
            if(avg < n[i]){
                tmp++;
            }
        }
        double result = tmp/(double)n[0]*100;
        System.out.println(result);

    }
}
