import java.util.Arrays;

public class SelectionSort {
    private static int compares = 0;
    private static int swaps = 0;
    public static void main(String args[]) {
        int[] x = new int[10000];
        for (int i = 0; i < x.length; i++) {
            x[i] = (int)(Math.random () * 10);
        }

        long millis = System.currentTimeMillis() % 1000;
        Arrays.toString (selectionSort (x));
//        System.out.println (Arrays.toString (insert (x, 4,1) ) );
        System.out.println ("time " + ((System.currentTimeMillis() % 1000)- millis));
        System.out.println ("swaps " + swaps );
        System.out.println ("compares " + compares );
    }
    public static  int[] swap(int[] x, int aIndex, int bIndex) {
        swaps++;
        int temp = x[aIndex];
        x[aIndex] = x[bIndex];
        x[bIndex] = temp;
        return x;
    }

    public static int[] selectionSort(int[] x) {
        int argmin = -1;
        for (int i = 0; i < x.length; i++) {
            int min = 99999;
            for (int j = i; j < x.length; j++) {
                compares++;
                if (x[j] < min) {
                    min = x[j];
                    argmin = j;
                }

            }
            x = swap (x, argmin, i);
        }
        return x;
    }
}
