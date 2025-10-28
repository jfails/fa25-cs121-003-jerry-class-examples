/**
 * Represents a student.
 */
public class Student 
{
    // FIELDS
    private String name;
    private String id;
    private StudentClassification classification;

    // CONSTRUCTORS
    public Student(String name)
    {
        this.name = name;
        this.id = "???";
        this.classification = StudentClassification.FRESHMAN;
    }

    // METHODS

    public String toString()
    {
        return "Student: " + name + " (" + id + ") is a " + classification;
    }


    public static void main(String[] args) {
        Student s1 = new Student("Andrew");
        System.out.println(s1);
    }
}