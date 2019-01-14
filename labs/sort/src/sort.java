import java.util.Arrays;

public class sort {
    private static int compares = 0;
    private static int swaps = 0;
    public static void main(String args[]) {
        int[] x = new int[10000];
        for (int i = 0; i < x.length; i++) {
            x[i] = (int)(Math.random () * 10);
        }

        long millis = System.currentTimeMillis() % 1000;
        Arrays.toString (sort (x));
//        System.out.println (Arrays.toString (insert (x, 4,1) ) );
        System.out.println ("time " + ((System.currentTimeMillis() % 1000)- millis));
        System.out.println ("swaps " + swaps );
        System.out.println ("compares " + compares );
    }

    public static int[] sortThree(int[] x) {
        if (x[0] < x[1] || x[0] == x[2]) {
            compares++;
            int[] out = new int[3];
            if (x[1] < x[2]) {
                compares++;
                out[0] = x[0];
                out[1] = x[1];
                out[2] = x[2];
                return out;
            }
            if (x[1] > x[2]) out[2] = x[1];
            compares++;
            if (x[2] > x[0]) {
                compares++;
                out[0] = x[0];
                out[1] = x[2];
            }
            else {
                out[1] = x[0];
                out[0] = x[2];
            }
            if (x[1] == x[2]) {
                compares++;
                out[0] = x[0];
                out[1] = x[1];
                out[2] = x[2];
            }
            return out;
        }

        else {
            int[] z = new int[] {x[1], x[2], x[0]};
            return sortThree (z);
        }
    }

    public static int[] chopThree(int[] x) {
        int[] out = new int[] {x[1], x[2], 999999999};
        return out;
    }
    public static int[] sort(int[] x) {
        int[] out = new int[x.length];
        int[] x_padded = new int[(int) Math.ceil(x.length / 3.) * 3];
        for (int i = 0; i < x_padded.length; i++) {
            if (i >=x.length) {
                x_padded[i] = 999999999;
            }
            else {
                x_padded[i] = x[i];
            }
        }


        int[][] x_split = new int[(int) Math.ceil(x.length / 3.)][3];

        int counter = 0;
        for (int i = 0; i < x_split.length; i++) {
            for (int j = 0; j < 3; j++) {
                x_split[i][j] = x_padded[counter];
                counter ++;

            }
        }
        for (int i = 0; i < x_split.length; i++) {
            x_split[i] = sortThree (x_split[i]);
        }
        int min;
        int argmin = 0;
        for (int i = 0; i < out.length; i++) {
            min = 999999999;
            for (int j = 0; j < x_split.length; j++) {
//                System.out.println (Arrays.toString (x_split[j] ));
                compares++;
                if (x_split[j][0] < min) {
                    min = x_split[j][0];
//                    System.out.println (min );
                    argmin = j;
                }
            }
            x_split[argmin] = chopThree (x_split[argmin]);
            out[i] = min;
//            System.out.println ("New " + min + " " + argmin);
        }

        return  out;
    }
}