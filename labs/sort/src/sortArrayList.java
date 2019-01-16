import java.util.ArrayList;
import java.util.Arrays;

public class sortArrayList {

        private static int compares = 0;
        private static int swaps = 0;
        public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer> ();
            for (int i = 0; i < x.size (); i++) {
        x.set(i, (int)(Math.random () * 10));
    }

            long millis = System.currentTimeMillis() % 1000;
            Arrays.toString (sort (x).toArray());
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

        public static ArrayList<Integer> chopThree(ArrayList<Integer> x) {
            ArrayList<Integer> out = new ArrayList<Integer> ();
            return out;
        }
        public static ArrayList<Integer> sort(ArrayList<Integer> x) {
            int[] out = new int[x.size ()];
            int x_padded_length = new int[(int) Math.ceil(x.size () / 3.) * 3];
            ArrayList<Integer> x_padded = new ArrayList<Integer> ();
            for (int i = 0; i < x_padded_length; i++) {
                if (i >=x.size ()) {
                    x_padded.add(999999999);
                }
                else {
                    x_padded.set(i, x.get(i);
                }
            }


            int[][] x_split = new int[(int) Math.ceil(x.size () / 3.)][3];

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
}
