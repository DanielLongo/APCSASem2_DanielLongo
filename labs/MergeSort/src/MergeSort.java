import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] x = new int[10];
        for (int i = 0; i < x.length; i++) {
            x[i] = (int) (Math.random ( ) * 10);
        }
    System.out.println (Arrays.toString (x));
        System.out.println (Arrays.toString (mergeSort (x, x.length)));
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
    public static int[] merge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
        return a;
    }

    public static int[] mergeSort(int[] a, int n) {
        if (n < 2) {
            return null;
        } //  Base Case
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort (l, mid);
        mergeSort (r, n - mid);
        //+++++++++ Helper Function ++++++++++++
        return merge (a, l, r, mid, n - mid);
    }
}