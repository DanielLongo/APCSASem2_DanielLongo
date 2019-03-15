public class InsertionSorter extends Sorter{
    public InsertionSorter() {
        super();
    }

    public void sort(int[] a) {
        insertionSort (a);
    }

        public int[] insert(int[] x, int valIndex, int targetIndex) {
            int[] out = new int[x.length];
            int counter = 0;
            for (int i = 0; i < out.length; i++) {
                if  (equals(counter, targetIndex)) {
                    moveCount++;
                    out[i] = x[valIndex];
                    i++;
                    moveCount++;
                    out[i] = x[counter];
                }
                else if (equals(counter, valIndex)) {
                    counter ++;
                    moveCount++;
                    out[i] = x[counter];
                }
                else {
                    moveCount++;
                    out[i] = x[counter];
                }
                counter ++;
            }
            return out;
        }

        public void insertionSort(int[] x) {
            int curValue;
            for (int i = 1; i < x.length; i ++) {
                curValue = x[i];
                for (int j = i-1; j >= 0; j--) {
                    if (curValue >= x[j]) {
                        if (j+1 == i) break;
                        x = insert (x, i, j+1);
                        break;
                    }
                }
            }
        }
}
