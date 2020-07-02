import java.io.*;

public class Methods<E> implements Serializable {

    E e;

    public void serialize(E e) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Employee"));
        objectOutputStream.writeObject(e);
        objectOutputStream.close();
    }
     public void deserialize(E e) throws IOException, ClassNotFoundException {
         ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Employee"));
         E e1 = (E) objectInputStream.readObject();
         System.out.println("deserialize: " + e1.toString());

    }


}
