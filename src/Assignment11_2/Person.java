/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 13/11/2020
 *
 */

package Assignment11_2;

/*
 * The Person, Student, Employee, Faculty and staff class.
 * Design the UML for the classes:
 *
 * ------------------- *  * ------------------ *  * --------------------*  *--------------------*  * ----------------- *
 *       Person        |  |      Student       |  |      Employee       |  |      Faculty       |  |       Staff       |
 * ------------------- *  * ------------------ *  * ------------------- *  * ------------------ *  * ----------------- *
 * - name : String     *  * - status : String  *  * - office : String   *  * - officeHours: int *  *  - title: String  *
 * - address : String  *  * ------------------ *  * - salary : double   *  * - rank : String    *  *                   *
 * - phoneNumber: int  *                          * - dataHired : Date  *  * ------------------ *  * ----------------- *
 * - eMail : String    *                          * ------------------- *
 * ------------------- *
 *
 * Define the inheritance between the classes as above.
 * Override the toString() method in each class to display the class name and the person's name.
 * Write a test program for the classes and implement them. Write a test program that creates a Person, Student,
 *   Employee, Faculty and Staff, and invokes their toString() methods.
 *
 */

public class Person {
    private String name;
    private String address;
    private int phoneNumber;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        System.out.println("ClassName and person's name: ");
        Person person = new Person(); // creates new person
        person.setName("Else"); // first set the name
        System.out.println(person.getClass().getSimpleName() + " " + person.getName());

        Student student = new Student();
        student.setName("Poul");
        System.out.println(student.getClass().getSimpleName() + " " + student.getName());

        Employee employee = new Employee();
        employee.setName("Henning");
        System.out.println(employee.getClass().getSimpleName() + " " + employee.getName());

        Faculty faculty = new Faculty();
        faculty.setName("Marianne");
        System.out.println(faculty.getClass().getSimpleName() + " " + faculty.getName());

        Staff staff = new Staff();
        staff.setName("Grethe");
        System.out.println(staff.getClass().getSimpleName() + " " + staff.getName());

    }

    //Overrides the toString() method to return the name of the person
    @Override
    public String toString(){
        return super.toString() + " " + this.getName();
    }






}
