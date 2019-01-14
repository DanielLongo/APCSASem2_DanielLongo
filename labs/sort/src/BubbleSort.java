import java.util.Arrays;

public class BubbleSort {
    private static int compares = 0;
    private static int swaps = 0;
    public static void main(String[] args) {
//        int[] x = new int[] {2,4,1,4,23,44,2,4};
        int[] x = new int[10000];
        for (int i = 0; i < x.length; i++) {
            x[i] = (int)(Math.random () * 10);
        }

        long millis = System.currentTimeMillis() % 1000;
        Arrays.toString (buubleSort (x));
//        System.out.println (Arrays.toString (insert (x, 4,1) ) );
        System.out.println ("time " + ((System.currentTimeMillis() % 1000)- millis));
        System.out.println ("swaps " + swaps );
        System.out.println ("compares " + compares );
    }

    public static boolean bubbleCompare(int a, int b) {
        if (a > b) return true;
        return false;

    }

    public static  int[] swap(int[] x, int aIndex, int bIndex) {
        swaps ++;
        int temp = x[aIndex];
        x[aIndex] = x[bIndex];
        x[bIndex] = temp;
        return x;
    }

    public static int[] buubleSort(int[] x) {
        for (int i = x.length ; i > 0; i--) {
            for (int j = 0; j < i-1; j++) {
                compares ++;
                if (bubbleCompare (x[j], x[j+1])) x = swap (x, j, j +1);
            }
        }
        return x;
    }
}
