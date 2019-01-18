import java.util.ArrayList;
import java.util.Arrays;

public class InsertSortArrayList {
        private static int compares = 0;
        private static int swaps = 0;
        public static void main(String[] args) {
//        int[] x = new int[] {1,5,2,7, 2, 1,2,5,2,5,7,2};
            ArrayList<Integer> x = new ArrayList<Integer> ();
            for (int i = 0; i < 10000; i++) {
                x.add((int)(Math.random () * 10));
            }

            long millis = System.currentTimeMillis() % 1000;
            Arrays.toString (insertSort (x).toArray ());
//        System.out.println (Arrays.toString (insert (x, 4,1) ) );
            System.out.println ("time " + ((System.currentTimeMillis() % 1000)- millis));
            System.out.println ("swaps " + swaps );
            System.out.println ("compares " + compares );


        }

    public static  ArrayList<Integer> swap(ArrayList<Integer> x, int aIndex, int bIndex) {
        swaps ++;
        int temp = x.get(aIndex);
        x.set(aIndex, x.get(bIndex));
        x.set(bIndex, temp);
        return x;
    }

        public static ArrayList<Integer> insert(ArrayList<Integer> x, int valIndex, int targetIndex) {
            swaps++;
            ArrayList<Integer> out = new ArrayList<Integer> ();
            int counter = 0;
            for (int i = 0; i < x.size (); i++) {
                if  (counter == targetIndex) {
                    out.add (x.get(valIndex));
                    i++;
                    out.add (x.get(valIndex));
                }
                else if (counter == valIndex) {
//                out[i] = x[targetIndex]
//                out[i] = x[counter];
                    counter ++;
                    out.add(x.get (counter));
                    // ;
//                counter --;
//                continue;
                }
                else {
                    out.add(x.get (counter));
                }
                counter ++;
            }
            return out;
        }

        public static ArrayList<Integer> insertSort(ArrayList<Integer> x) {
            int curValue;
//        int[] out = new int;
            for (int i = 1; i < x.size (); i ++) {
                curValue = x.get (i);
//            System.out.println (Arrays.toString (x) );
                for (int j = i-1; j >= 0; j--) {
                    compares ++;
                    if (curValue >= x.get(j)) {
//                    System.out.println ("i " + x[i] + " j " + x[j]);
//                    System.out.println ("i index " + i + " j  index " + j);
//                    if (j == x.length-1) x = swap(x, i, j);
                        compares ++;
                        if (j+1 == i) break;
                        x = insert (x, i, j+1);
                        break;
                    }
                }
            }
            return x;
        }

    }
