import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays;
public class BubbleSortArrayList {
        private static int compares = 0;
        private static int swaps = 0;

        public static void main(String[] args) {
//        int[] x = new int[] {2,4,1,4,23,44,2,4};
            ArrayList<Integer> x = new ArrayList<Integer> ();
            for (int i = 0; i < 10000; i++) {
                x.add((int)(Math.random () * 10));
            }

            long millis = System.currentTimeMillis() % 1000;
            Arrays.toString (bubleSort (x).toArray());
//        System.out.println (Arrays.toString (insert (x, 4,1) ) );
            System.out.println ("time " + ((System.currentTimeMillis() % 1000)- millis));
            System.out.println ("swaps " + swaps );
            System.out.println ("compares " + compares );
        }

        public static boolean bubbleCompare(int a, int b) {
            if (a > b) return true;
            return false;

        }

        public static  ArrayList<Integer> swap(ArrayList<Integer> x, int aIndex, int bIndex) {
            swaps ++;
            int temp = x.get(aIndex);
            x.set(aIndex, x.get(bIndex));
            x.set(bIndex, temp);
            return x;
        }

        public static ArrayList<Integer> bubleSort(ArrayList<Integer> x) {
            for (int i = x.size () ; i > 0; i--) {
                for (int j = 0; j < i-1; j++) {
                    compares ++;
                    if (bubbleCompare (x.get(j), x.get(j+1))) x = swap (x, j, j +1);
                }
            }
            return x;
        }
    }

