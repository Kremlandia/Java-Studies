/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance.entities.abstracts;

/**
 *
 * @author eduardo.willian
 */
public class Employee {
    
    private String name, id;
    private double salary;
    
    public Employee(){
    
    }
    
    public Employee(String name, String id){
        this.name = name;
        this.id = id;
    }
    
    public Employee(String name, String id , double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public double getBonus(){
        return this.salary * 0.1;
    }
    
}
