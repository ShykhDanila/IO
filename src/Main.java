import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        Employee employee = new Employee();
        employee.setId(777);
        employee.setName("Petro");
        employee.setSalary(15000);

        employee.serialize();
        employee.deserialize();

        System.out.println(employee.toString());
        System.out.println("*****");

    }
}
