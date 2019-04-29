import com.sun.imageio.plugins.common.I18N;

import java.util.ArrayList;
import java.util.List;

public class Questions {
    public static void main(String[] args) {
        System.out.println ("Finished");
    }

    public static int findMissing(ArrayList<Integer> arr1) {
        int sum = 0;
        for (int i = 0; i < arr1.size ( ); i++) {
            sum += arr1.get (i);
        }
        return 5050 - sum;
    }

    public static int findTarget(int[] a, int x) {
        int i = a.length / 2;
        int tempi = i
        int diff = Integer.MAX_VALUE;
        int temp_diff = Integer.MAX_VALUE - 1;
        while (a[i] != x) {
            diff = Math.abs (a[i] - x);
            tempi = i;
            if (diff > temp_diff) return a[tempi];
            if (a[i] < x) i = i / 2;
            else if (a[i] > x) i = (a.length - i) / 2;
            temp_diff = diff;
        }
        return a[i];
    }

    public static int findSum(int[] a1, int[] a2, int targ) {
        return findTarget (a1, targ) + findTarget (a2, targ);
    }

    public static boolean checkIfIn(char x, ArrayList<Character> z) {
        for (int i = 0; i < z.size (); i++) {
             if (x == z.get (i)) return true;
        }
        return false;
    }
    public static char findFirstRepeating(String str) {
        ArrayList<Character> x = new ArrayList<Character> ();
        for (int i = 0; i < str.length(); i++) {
            if (checkIfIn(str.charAt (i), x)) return str.charAt (i);
            x.add(str.charAt (i));
        }
        return null;
    }

    public ArrayList<Integer> findIntersection(int[] a, int[] b, int[] c) {
        ArrayList<Integer> out = new ArrayList<Integer> ();
        int curValue;
        boolean bb = false;
        boolean cc = false;
        for (int i = 0; i < a.length; i++) {
            curValue = a[i];
            bb = false;
            cc = false;
            for (int j = 0; j < a.length; j++) {
                if (b[i] == curValue) bb = true;
                if (c[i] == curValue) cc = true;
                if (cc && bb) {
                    out.add(curValue);
                    break;
                }
            }
        }
        return out;
    }
    public int[][] flip(int[][] mat) {
        int[][] out = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                out[mat.length - i][mat[0].length] = mat[i][j];
            }
        }
        return out;

        }
    }


