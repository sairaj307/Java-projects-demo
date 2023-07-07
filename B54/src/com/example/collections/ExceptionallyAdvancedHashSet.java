package com.example.collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ExceptionallyAdvancedHashSet {
    public static void main(String[] args) {
        // Create a HashSet with advanced configuration options and concurrency control
        AdvancedHashSet<Employee> employees = new AdvancedHashSet<>(100, 0.75f, 16);

        // Create and add employee objects to the HashSet
        employees.add(new Employee(101, "John Doe"));
        employees.add(new Employee(102, "Jane Smith"));
        employees.add(new Employee(103, "David Johnson"));

        // Clone the HashSet
        AdvancedHashSet<Employee> clonedEmployees = cloneHashSet(employees);

        // Demonstrate unsuitability for concurrent use by multiple threads
        Thread thread1 = new Thread(() -> {
            clonedEmployees.add(new Employee(104, "Mary Adams"));
        });

        Thread thread2 = new Thread(() -> {
            clonedEmployees.remove(new Employee(101, "John Doe"));
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the original HashSet of employees
        System.out.println("Original HashSet of employees:");
        employees.print();

        // Print the cloned HashSet of employees
        System.out.println("Cloned HashSet of employees:");
        clonedEmployees.print();
    }

    private static <T> AdvancedHashSet<T> cloneHashSet(AdvancedHashSet<T> set) {
        AdvancedHashSet<T> clonedSet = new AdvancedHashSet<>(set.initialCapacity, set.loadFactor, set.concurrencyLevel);
        clonedSet.addAll(set);
        return clonedSet;
    }
}

class AdvancedHashSet<T> extends HashSet<T> {
    int initialCapacity;
    float loadFactor;
    int concurrencyLevel;
    Lock lock;

    public AdvancedHashSet(int initialCapacity, float loadFactor, int concurrencyLevel) {
        super(initialCapacity, loadFactor);
        this.initialCapacity = initialCapacity;
        this.loadFactor = loadFactor;
        this.concurrencyLevel = concurrencyLevel;
        this.lock = new ReentrantLock();
    }

    @Override
    public boolean add(T element) {
        lock.lock();
        try {
            // Advanced logic for adding elements
            System.out.println("Adding element: " + element.toString());
            return super.add(element);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public boolean remove(Object element) {
        lock.lock();
        try {
            // Advanced logic for removing elements
            System.out.println("Removing element: " + element.toString());
            return super.remove(element);
        } finally {
            lock.unlock();
        }
    }

    public void print() {
        lock.lock();
        try {
            // Advanced printing mechanism
            for (T element : this) {
                System.out.println(element.toString());
            }
        } finally {
            lock.unlock();
        }
    }
}

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Employee employee = (Employee) obj;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}













/*import java.util.HashSet;
import java.util.Objects;

public class ExceptionallyAdvancedHashSet {
    public static void main(String[] args) {
        // Create a HashSet of custom objects with advanced configuration options
        AdvancedHashSet<Employee> employees = new AdvancedHashSet<>(100, 0.75f, 16);

        // Create and add employee objects to the HashSet
        employees.add(new Employee(101, "Sairaj Chonche"));
        employees.add(new Employee(102, "Lucifer MorningStar"));
        employees.add(new Employee(103, "David Johnson"));

        // Print the HashSet of employees using an advanced printing mechanism
        employees.print();

        // Check if the HashSet contains a specific employee
        Employee empToCheck = new Employee(101, "John Doe");
        boolean containsEmployee = employees.contains(empToCheck);
        System.out.println("HashSet contains empToCheck: " + containsEmployee);

        // Remove an employee from the HashSet
        employees.remove(new Employee(102, "Lucifer MorningStar"));

        // Print the updated HashSet of employees using an advanced printing mechanism
        employees.print();
    }
}

class AdvancedHashSet<T> extends HashSet<T> {
    private int initialCapacity;
    private float loadFactor;
    private int concurrencyLevel;

    public AdvancedHashSet(int initialCapacity, float loadFactor, int concurrencyLevel) {
        super(initialCapacity, loadFactor);
        this.initialCapacity = initialCapacity;
        this.loadFactor = loadFactor;
        this.concurrencyLevel = concurrencyLevel;
    }

    @Override
    public boolean add(T element) {
        // Advanced logic for adding elements
        System.out.println("Adding element: " + element.toString());
        return super.add(element);
    }

    @Override
    public boolean remove(Object element) {
        // Advanced logic for removing elements
        System.out.println("Removing element: " + element.toString());
        return super.remove(element);
    }

    public void print() {
        // Advanced printing mechanism
        System.out.println("HashSet elements:");
        for (T element : this) {
            System.out.println(element.toString());
        }
    }
}

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Employee employee = (Employee) obj;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

*/