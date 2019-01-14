import java.util.Arrays;

public class InsertSort {
    private static int compares = 0;
    private static int swaps = 0;
    public static void main(String[] args) {
//        int[] x = new int[] {1,5,2,7, 2, 1,2,5,2,5,7,2};
        int[] x = new int[10000];
        for (int i = 0; i < x.length; i++) {
            x[i] = (int)(Math.random () * 10);
        }

        long millis = System.currentTimeMillis() % 1000;
        Arrays.toString (insertSort (x));
//        System.out.println (Arrays.toString (insert (x, 4,1) ) );
        System.out.println ("time " + ((System.currentTimeMillis() % 1000)- millis));
        System.out.println ("swaps " + swaps );
        System.out.println ("compares " + compares );


    }

    public static  int[] swap(int[] x, int aIndex, int bIndex) {
        int temp = x[aIndex];
        x[aIndex] = x[bIndex];
        x[bIndex] = temp;
        return x;
    }
    public static int[] insert(int[] x, int valIndex, int targetIndex) {
        swaps++;
        int[] out = new int[x.length];
        int counter = 0;
        for (int i = 0; i < out.length; i++) {
            if  (counter == targetIndex) {
                out[i] = x[valIndex];
                i++;
                out[i] = x[counter];
            }
            else if (counter == valIndex) {
//                out[i] = x[targetIndex]
//                out[i] = x[counter];
                counter ++;
                out[i] = x[counter];
 // ;
//                counter --;
//                continue;
            }
            else {
                out[i] = x[counter];
            }
            counter ++;
        }
        return out;
    }

    public static int[] insertSort(int[] x) {
        int curValue;
//        int[] out = new int;
        for (int i = 1; i < x.length; i ++) {
            curValue = x[i];
//            System.out.println (Arrays.toString (x) );
            for (int j = i-1; j >= 0; j--) {
                compares ++;
                if (curValue >= x[j]) {
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
