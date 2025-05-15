
/**
 *
 * @author HP
 */
import java.io.*;

public class Student implements Serializable {

    private transient String name;
    private transient int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student[name =  " + name + ", id = " + id + "]";
    }
}
