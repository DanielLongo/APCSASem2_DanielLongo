public class SelectionSorter extends Sorter{

    public SelectionSorter() {
        super();
    }

    public void sort(int[] a) {
        selectionSort (a);
    }

    public void selectionSort(int[] x) {
        int argmin = -1;
        for (int i = 0; i < x.length; i++) {
            int min = 99999;
            for (int j = i; j < x.length; j++) {
                if(less (x[j], min)) {
                    moveCount++;
                    min = x[j];
                    argmin = j;
                }

            }
            swap (x, argmin, i);
        }
    }
    public static void main(String[] args) {
        int[] z = new int[] {2,3,42,4,3,5};
        SelectionSorter c = new SelectionSorter ();
        c.sort (z);
        System.out.println ("s" );
    }
}
