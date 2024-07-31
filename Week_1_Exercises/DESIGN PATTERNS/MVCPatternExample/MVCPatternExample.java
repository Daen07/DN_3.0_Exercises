package mvc;

public class MVCPatternExample {
    public static void main(String[] args) {
        // Create a Student model
        Student student = new Student("1", "John Doe", "A");

        // Create a View to display student details
        StudentView view = new StudentView();

        // Create a Controller to handle the student model and view
        StudentController controller = new StudentController(student, view);

        // Display initial student details
        controller.updateView();

        // Update student details
        controller.setStudentName("Jane Doe");
        controller.setStudentGrade("B");

        // Display updated student details
        controller.updateView();
    }
}
