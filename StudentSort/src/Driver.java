public class Driver {
    public static void main(String[] args) {
        Student[] students = new Student[100];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student (true);
        }
        MergeSort sorter = new MergeSort ( );
        students = sorter.mergeSort (students, students.length);
        for (int i = 0; i < students.length; i++) {
            System.out.printf ("Student id " + students[i].getStudentId () + " GPA: ");
            System.out.println (students[i].getGPA ());


        }
        System.out.println ("Finished");
    }
}
