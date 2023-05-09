package javajungsuk.algorithm.youtube.p13;

/**
 * 수 거꾸로 읽은 후 큰 수 말하기
 */
public class Main15 {
    public static void main(String[] args) {
        int numA = 734;
        int numB = 893;

        int[] arrA = new int[3]; // [0]=4, [1]=3, [2]=7
        int[] arrB = new int[3];

        int lenA = 0;

        do{
            arrA[lenA] = numA % 10;
            numA /= 10;
            lenA++;
        }while (numA > 0);

        int tranA = 0;
        int mux = 1;
        //[0]=4, [1]=3, [2]=7
        //400+30+7 => 437

        for (int i = arrA.length-1; i >=0 ; i--) {
            tranA += arrA[i]*mux;
            mux*=10;
        }
        System.out.println("tranA = "+ tranA);

        int lenB = 0;

        do {
            arrB[lenB] = numB % 10;
            numB /= 10;
            lenB++;
        }while(numB > 0);


        int tranB = 0;
        int mux2 = 1;
        for (int i = arrB.length-1; i >=0 ; i--) {
            tranB += arrB[i]*mux2;
            mux2*=10;
        }
        System.out.println("tranB= " + tranB);

        if (tranA> tranB){
            System.out.println(tranA);
        }else {
            System.out.println(tranB);
        }
    }
}
