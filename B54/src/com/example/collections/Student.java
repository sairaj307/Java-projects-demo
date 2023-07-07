package com.example.collections;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private int percentage;

    public Student(int id, String name, int percentage) {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
    }

    public Student(String string, int i) {
		// TODO Auto-generated constructor stub
    	
    	
	}

	// Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPer() {
        return percentage;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.percentage, other.percentage);
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
    }
}
