public class Driver {
    public static void main(String[] args) {
        Student[] students = new Student[10000];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student (true);
        }
        MergeSort sorter = new MergeSort ( );
        students = sorter.mergeSort (students, students.length);
        for (int i = 0; i < students.length; i++) {
//            System.out.printf ("Student id " + students[i].getStudentId () + " GPA: ");
//            System.out.println (students[i].getGPA ());


        }
        System.out.println ("Student with a 4.0 " + students[FindStudent.findStudent (students, 4.0)].getStudentId ());
        System.out.println ("Finished");
    }
}
