// Section: Java Annotations and Its Types
// Question: How do annotations integrate with frameworks like Spring and Hibernate?
Question: How do annotations integrate with frameworks like Spring and Hibernate?
Answer:
Spring and Hibernate use annotations to define metadata directly in the source code, reducing the need for XML configuration. Spring uses annotations like @Component, @Service, @Repository, @Autowired, @Transactional, etc., to enable auto-wiring and transaction management. Hibernate uses @Entity, @Table, @Column, @Id, etc., to map Java classes to database tables without needing an external XML file.

Example:
import javax.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Hibernate entity annotation
@Entity
@Table(name = "employees")
class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "emp_name")
    private String name;

    // Spring annotation for auto-wiring dependencies
    @Autowired
    private EmployeeService service;

    public void work() {
        service.process();
    }
}

@Component
class EmployeeService {
    public void process() {
        System.out.println("Processing employee data");
    }
}

public class FrameworkIntegrationDemo {
    public static void main(String[] args) {
        // Framework containers read these annotations at startup.
        System.out.println("Annotations integrated with Spring and Hibernate");
    }
}