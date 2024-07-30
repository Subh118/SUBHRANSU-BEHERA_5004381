package exercise10;

// MVCPatternExample.java
public class MVCPatternExample {
    public static void main(String[] args) {
        // Fetch student record from the database (simulated here)
        Student model = new Student("1", "John Doe", "A");

        // Create a view to write student details on console
        StudentView view = new StudentView();

        // Create a controller to handle communication between the model and view
        StudentController controller = new StudentController(model, view);

        // Display initial details
        controller.updateView();

        // Update model data
        controller.setStudentName("Jane Doe");
        controller.setStudentGrade("B");

        // Display updated details
        controller.updateView();
    }
}
