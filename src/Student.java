import java.util.Random;

public class Student {

    private static Random rand = new Random();
    private final String name;
    private final int age;
    private final int studentID;

    public Student(String name, int age, int studentID) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
    }

    public Student(String name) {
        this.name = name;
        this.age = 0;
        this.studentID = rand.nextInt(100);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getStudentID() {
        return studentID;
    }

    public String toString() {
//        return studentID + " - " + name + " (" + age + ")";
        return name;
    }
}
