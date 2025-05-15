
/**
 *
 * @author HP
 */

import java.io.*;

public class BasicSerialization {

    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("Tayyaba", 101);
        System.out.println("Original student: " + student);
        // Serialize the object
        try (FileOutputStream fileOut = new FileOutputStream("student.ser"); ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(student);
            System.out.println("Object serialized successfully  ");
        } catch (IOException e) {
            e.printStackTrace();
        } // hELLO MY NAME IS tAYYABA
        // Deserialize the object
        try (FileInputStream fileIn = new FileInputStream("student.ser"); ObjectInputStream in = new ObjectInputStream(fileIn)) {
            Student deserializedStudent = (Student) in.readObject();
            System.out.println("Deserialized student: " + deserializedStudent);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
