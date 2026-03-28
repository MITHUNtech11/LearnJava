package Day_13;
import java.util.*;
import java.util.*;
class Employee {
    String name;
    int salary;
    
    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class employee {
    public static void main(String[] args){
        ArrayList<Employee> list = new ArrayList<>();
        
        list.add(new Employee("A", 60000));
        list.add(new Employee("B", 40000));
        list.add(new Employee("C", 70000));
        
        Predicate<Employee> p = e -> e.salary > 50000;
        
        for(Employee e : list){
            if(p.test(e)){
                System.out.println(e.name + " " + e.salary);
            }
        }
    }
}