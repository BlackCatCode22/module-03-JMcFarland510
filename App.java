public class App {
    public static void main(String[] args) {

        // Student object 1
        Student myStudent = new Student();
        myStudent.firstName = "Jessica";
        myStudent.lastName = "McFarland";
        myStudent.gpa = 4.0;
        myStudent.major = "Computer Science";
        myStudent.city = "Fresno";


        System.out.println("\n The first name of the student is: " + myStudent.firstName + "\n");
        System.out.println("\n The last name of the student is: " + myStudent.lastName + "\n");
    }
}