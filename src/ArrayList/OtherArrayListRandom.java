package ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class OtherArrayListRandom {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> aList1 = new ArrayList<Integer>();
        ArrayList<Integer> aList2 = new ArrayList<Integer>();
        ArrayList<Integer> bigList = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++){
            aList1.add(random.nextInt(20)+1);
            aList2.add(random.nextInt(20)+1);
        }
        for (int i = 0; i<100; i+=2) {
            bigList.add(aList1.get(i));
            bigList.add(aList2.get(i+1));
        }

        System.out.println(aList1);
        System.out.println(aList2);
        System.out.println(bigList);

    }
}
