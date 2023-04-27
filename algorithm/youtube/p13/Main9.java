package javajungsuk.algorithm.youtube.p13;

import java.util.ArrayList;

/**
 * ArrayList를 사용한 중복제거
 */
public class Main9 {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();

        // 중복제거 데이터를 담기 위한 ArrayList
        ArrayList arr2 = new ArrayList();

        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(2);
        arr.add(5);
        arr.add(5);


        for (int i = 0; i < arr.size(); i++) {
            if (!arr2.contains(arr.get(i)))
                arr2.add(arr.get(i));
        }
        System.out.println(arr2);




    }
}
