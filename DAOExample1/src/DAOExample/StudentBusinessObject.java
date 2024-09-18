
package DAOExample;

public class StudentBusinessObject {
    private StudentDAO studentDAO;

    public StudentBusinessObject() {
        this.studentDAO = new StudentDAOImpl();
    }

    public void createStudent(Student student) {
        studentDAO.addStudent(student);
    }

    public Student getStudentById(int id) {
        return studentDAO.getStudent(id);
    }

    public void updateStudentInfo(Student student) {
        studentDAO.updateStudent(student);
    }

    public void deleteStudent(int id) {
        studentDAO.deleteStudent(id);
    }

    public void displayAllStudents() {
        for (Student student : studentDAO.getAllStudents()) {
            System.out.println(student);
        }
    }
}
