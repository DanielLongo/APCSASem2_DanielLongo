import java.util.ArrayList;
import java.util.Arrays;

public class SelectSortArrayList {
        private static int compares = 0;
        private static int swaps = 0;
        public static void main(String args[]) {
            ArrayList<Integer> x = new ArrayList<Integer> ();
            for (int i = 0; i < x.size (); i++) {
                x.set(i, (int)(Math.random () * 10));
            }

            long millis = System.currentTimeMillis() % 1000;
            Arrays.toString (selectionSort (x).toArray ());
//        System.out.println (Arrays.toString (insert (x, 4,1) ) );
            System.out.println ("time " + ((System.currentTimeMillis() % 1000)- millis));
            System.out.println ("swaps " + swaps );
            System.out.println ("compares " + compares );
        }
    public static  ArrayList<Integer> swap(ArrayList<Integer> x, int aIndex, int bIndex) {
        swaps++;
        int temp = x.get (aIndex);
        x.set (aIndex, x.get (bIndex));
        x.set (bIndex, temp);
        return x;
    }
        public static ArrayList<Integer> selectionSort(ArrayList<Integer> x) {
            int argmin = -1;
            for (int i = 0; i < x.size (); i++) {
                int min = 99999;
                for (int j = i; j < x.size (); j++) {
                    compares++;
                    if (x.get(j) < min) {
                        min = x.get(j);
                        argmin = j;
                    }

                }
                x = swap (x, argmin, i);
            }
            return x;
        }
    }

}
