import java.util.Arrays;

public class MergeSort {

    public Student[] merge(Student[] a, Student[] l, Student[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].getGPA () <= r[j].getGPA ()) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
        return a;
    }

    public Student[] mergeSort(Student[] a, int n) {
        if (n < 2) {
            return null;
        } //  Base Case
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort (l, mid);
        mergeSort (r, n - mid);
        //+++++++++ Helper Function ++++++++++++
        return merge (a, l, r, mid, n - mid);
    }
}