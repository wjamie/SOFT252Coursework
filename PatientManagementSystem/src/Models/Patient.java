/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Walker
 */
public class Patient extends User{
    private int age;
    private String gender;
    
     public Patient(String ID, String name, String address, String password, int age, String gender) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.password = password;
        this.age = age;
        this.gender = gender;
    }

     
     
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
     
}
