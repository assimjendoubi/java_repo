package tn.esprit.society.entities;

import java.util.Objects;

public class employee {

    int id;
    String name,lastName,depName;
    int grade;

    public employee(int id, String name, String lastName, String depName, int grade) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.depName = depName;
        this.grade = grade;
    }

    public employee() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepName() {
        return depName;
    }

    public int getGrade() {
        return grade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof employee employee)) return false;
        return getId() == employee.getId() && Objects.equals(getName(), employee.getName());
    }

    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", depName='" + depName + '\'' +
                ", grade =: " + grade +
                '}';
    }

}
