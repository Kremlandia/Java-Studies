/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance.entities.concrete;

import inheritance.entities.abstracts.Employee;
import inheritance.interfaces.Authenticable;

/**
 *
 * @author eduardo.willian
 */
public class Director extends Employee implements Authenticable{
    
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public Director(String name, String id, double salary){
        super(name, id, salary);
    }
    
    public Director(String name, String id){
        super(name, id);
    }
    
    public Director(){
        super();
    }

    @Override
    public boolean authenticate(String password) {
        return this.password.equals(password);
    }
    
}
