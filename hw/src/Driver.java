import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        Cow a = new CowTypeA ();
        Cow b = new CowTypeB ();
        Cow[] c = new Cow[] {b,a};
    }
    public static void sort(Cow[] x) {

    }
    public static  Cow[] swap(Cow[] x, int aIndex, int bIndex) {
            Cow temp = x[aIndex];
            x[aIndex] = x[bIndex];
            x[bIndex] = temp;
            return x;
    }

        public static Cow[] selectionSort(Cow[] x) {
            int argmin = -1;
            for (int i = 0; i < x.length; i++) {
                int min = 99999;
                for (int j = i; j < x.length; j++) {
                    if (x[j].getAge () < min) {
                        min = x[j].getAge ();
                        argmin = j;
                    }

                }
                x = swap (x, argmin, i);
            }
            return x;
        }
}

