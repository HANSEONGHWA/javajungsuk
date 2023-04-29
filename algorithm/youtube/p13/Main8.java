package javajungsuk.algorithm.youtube.p13;

/**
 * 중복된 수 제거하기
 */
public class Main8 {
    public static void main(String[] args) {
        //중복데이터를 담기 위한 배열
        boolean arr2[] = new boolean[101];
        int[] arr = new int[101];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=1;
        arr[4]=1;
        arr[5]=2;
        arr[6]=3;
        arr[7]=4;
        arr[9]=5;
        arr[10]=7;
        arr[11]=15;

        // arr에 있는 값을 arr2에 담고 true return
        // arr2[arr[5]] => arr2[3] => arr2[3]인덱스에 값이 있음을 true로 체크함.
        for (int i = 0; i <= 100; i++) {
            arr2[arr[i]] = true;
        }
        for (int i = 1; i <= 100; i++) {
            if (arr2[i])
                System.out.println(i + " ");
        }
    }
}
