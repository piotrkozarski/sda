package StudentDB;


import StudentDB.service.InitDatabaseService;
import StudentDB.service.StudentService;

public class App {
    public static void main(String[] args) {

        new InitDatabaseService();

        Student student = new Student();

        student.setFirstName("jan");
        student.setLastName("kowalski");
        student.setIndexNumber(10001);
        student.setYearOfStudy(2);
        student.setFieldOfStudy("kognitywistyka");

        StudentService studentService = new StudentService();

        studentService.saveStudent(student);

        System.out.println(studentService.getAll());
    }
}
