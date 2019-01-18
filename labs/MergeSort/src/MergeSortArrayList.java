import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortArrayList {
        public static void main(String[] args) {
            ArrayList<Integer> x = new ArrayList<Integer> ();
            for (int i = 0; i < x.size (); i++) {
                x.add ((int) (Math.random ( ) * 10));
            }
            System.out.println (Arrays.toString (x.toArray ()));
            System.out.println (Arrays.toString (mergeSort (x, x.size ())));
        }

        //
//    public static int[] merge(int[] x) {
//        int[] x1 = new int[x.length/2];
//        int[] x2 = new int[x.length - x1.length];
////        System.out.println ("x1 " + x1.length + " x2 " + x2.length );
//        for (int i = 0; i < x.length; i++) {
////            System.out.println ("i " + i +" i/2 " + i/2 );
//            if (i % 2 == 1) x1[i/2] = x[i];
//            else {
////                System.out.println ("Y0" );
//                x2[i/2] = x[1];
//            }
//        }
////        return x;
//        int[] out = new int[x.length];
//        System.arraycopy (x1, 0,out,0, x1.length);
//        System.arraycopy (x2, 0,out, x1.length, x2.length);
//        return out;
//    }
        public static int[] merge(ArrayList<Integer> a, ArrayList<Integer> l, ArrayList<Integer> r, int left, int right) {
            int i = 0, j = 0, k = 0;
            while (i < left && j < right) {
                if (l.get(i) <= r.get(j)) {
                    a.set(k++, l.get(i++));
                } else {
//                    a[k++] = r[j++];
                    a.set(k++, r.get(j++));
                }
            }
            while (i < left) {
//                a[k++] = l[i++];
                a.set(k++, r.get(i++));
            }
            while (j < right) {
//                a[k++] = r[j++];
                a.set(k++, j ++);
            }
            return a;
        }

        public static ArrayList<Integer> mergeSort(ArrayList<Integer> a, int n) {
            if (n < 2) {
                return null;
            } //  Base Case
            int mid = n / 2;
//            int[] l = new int[mid];
            ArrayList<Integer> l = new ArrayList<Integer> ();
//            int[] r = new int[n - mid];
            ArrayList<Integer> r = new ArrayList<Integer> ();
            for (int i = 0; i < mid; i++) {
//                l[i] = a[i];
                l.add(a.get (i));
            }
            for (int i = mid; i < n; i++) {
                r.add (a.get (i));
//                r[i - mid] = a[i];
            }
            mergeSort (l, mid);
            mergeSort (r, n - mid);
            //+++++++++ Helper Function ++++++++++++
            return merge (a, l, r, mid, n - mid);
        }
    }
}
