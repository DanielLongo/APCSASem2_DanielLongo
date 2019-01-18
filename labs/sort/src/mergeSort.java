import java.util.Arrays;
import java.util.stream.Stream;

public class MergeSort {
    public static void main(String[] args) {
        int[] x = new int[10];
        for (int i = 0; i < x.length; i++) {
            x[i] = (int)(Math.random () * 10);
        }
        System.out.println (Arrays.toString (x) );
        System.out.println (Arrays.toString (mergeSort(x)));
    }

    public static int[] mergeSort(int x[]) {
        if (x.length <= 1) {
            return x;
        }
        if (x.length == 2) {
            if (x[0] > x[1]) return new int[]{x[0], x[1]};
            return new int[]{x[1], x[0]};
        }
        int[] x1 = new int[x.length/2];
        int[] x2 = new int[x.length - x1.length];
//        System.out.println ("x1 " + x1.length + " x2 " + x2.length );
        for (int i = 0; i < x.length; i++) {
//            System.out.println ("i " + i +" i/2 " + i/2 );
            if (i % 2 == 1) x1[i/2] = x[i];
            else {
//                System.out.println ("Y0" );
                x2[i/2] = x[1];
            }
        }
//        return x;
        int[] out = new int[x.length];
        x1 = mergeSort (x1);
        x2 = mergeSort (x2);
//        System.out.println ("x1 " + Arrays.toString (x1));
//        System.out.println ("x2 " + Arrays.toString (x2));
        System.arraycopy (x1, 0,out,0, x1.length);
        System.arraycopy (x2, 0,out, x1.length, x2.length);
//        System.out.println (out);
        System.out.println (Arrays.toString (out ));
        return mergeSort(out);
//        return mergeSort (mergeSort (x1).addAll() )
//        return mergeSort (Arrays.a addAll(mergeSort (x[:x.length/2).addAll(mergeSort (x[x.length/2:])))
    }
}
