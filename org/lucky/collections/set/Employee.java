package org.lucky.collections.set;
import java.util.*;

public class Employee {
private String name;
private int id;

public Employee(String name, int id) {
        this.name = name;
        this.id = id;
        }

@Override
public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
        }

@Override
public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
        }

@Override
public int hashCode() {
        return Objects.hash(id);
        }

public String getName() {
        return this.name;
        }
        }