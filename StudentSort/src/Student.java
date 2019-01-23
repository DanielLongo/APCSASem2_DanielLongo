 public class Student
    {
        private int studentId;
        private double gpa;
        private boolean active;
        private String name;

        public Student(boolean random) {
            if (random) {
                gpa = Math.round (Math.random () * 5 * 100)/100.0;
                if (Math.random () > .5) active= true;
                else active = false;
                name = "Joe";
                studentId = (int)(Math.random () * 10000);
            }
        }
        public Student()
        {
            gpa = 0.0;
            active = false;
            name = "no name";
            studentId = 0;
        }

        public void setStudentId(int newID)
        {
            studentId = newID;
        }

        public int getStudentId() {
            return studentId;
        }

        public void setGPA(double newGPA) {
            gpa = newGPA;

        }

        public double getGPA() {
            return gpa;
        }

        public void setStatus(boolean newActive) {
            active = newActive;
        }

        public boolean getStatus() {
            return active;
        }

        public String getName() {
            return name;
        }

        public void setName(String newName) {
            name = newName;
        }
}