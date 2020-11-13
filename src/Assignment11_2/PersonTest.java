package Assignment11_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/* This testSuite tests the objects toString() methods */
class PersonTest {

    @Test
    void testPersonToString() {
        Person person = new Person();
        person.setName("Else");
        assertEquals("Else", person.getName());
    }
    @Test
    void testStudentToString() {
        Student student = new Student();
        student.setName("Henning");
        assertEquals("Henning", student.getName());
    }
    @Test
    void testEmployeeToString() {
        Employee employee = new Employee();
        employee.setName("Poul");
        assertEquals("Poul", employee.getName());
    }
    @Test
    void testFacultyToString() {
        Faculty faculty = new Faculty();
        faculty.setName("Grethe");
        assertEquals("Grethe", faculty.getName());
    }
    @Test
    void testStaffToString() {
        Staff staff = new Staff();
        staff.setName("Marianne");
        assertEquals("Marianne", staff.getName());
    }
}