import java.io.*;

public class Methods {

    private Employee employee;

    public void serialize() throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Employee"));
        objectOutputStream.writeObject(employee);
        objectOutputStream.close();
    }
     public void deserialize() throws IOException, ClassNotFoundException {
         ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Employee"));
         Employee employee1 = (Employee) objectInputStream.readObject();
         System.out.println("deserialize() " + employee1.toString());

    }


}
