import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        Employee employee = new Employee();
        Methods<Employee> employeeMethods = new Methods<>();
        employee.setId(778);
        employee.setName("Pavlo");
        employee.setSalary(16000);
        employeeMethods.serialize(employee);
        employeeMethods.deserialize(employee);

        System.out.println("*************");

        Methods<List<Employee>> listMethods = new Methods<>();
        List<Employee> employeeList = new ArrayList<>();

        Employee employee1 = new Employee();
        employee1.setId(558);
        employee1.setName("Petro");
        employee1.setSalary(20000);

        Employee employee2 = new Employee();
        employee2.setId(333);
        employee2.setName("Ivan");
        employee2.setSalary(12000);

         Employee employee3 = new Employee();
        employee3.setId(999);
        employee3.setName("Sanya");
        employee3.setSalary(22000);

        employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

       /* for (Employee em:
             employeeList) {
            listMethods.serialize(em);
            listMethods.deserialize(em);
        }
        */

        listMethods.serialize(employeeList);
        listMethods.deserialize(employeeList);

    }
}
