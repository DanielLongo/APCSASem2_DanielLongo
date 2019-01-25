public class FindStudent {
    public static int findStudent(Student [] x, double target) {
        int index = x.length / 2;
        int old = 0;
        while (old != index) {
            if (x[index].getGPA () == target) return index;
            else if (x[index].getGPA () > target) {
                old = index;
                index = index - ((x.length - index)/2);
            }
            else {
                old = index;
                index = index + ((x.length - index)/2);

            }
        }
        return -1;
    }
}
