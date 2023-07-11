/*
 * 
 */
package Entity;

import java.time.LocalDate;

/**
 *
 * @author Angelica
 */
public class Person {
    
    private String name;
    private LocalDate dateOfBirth;
    private int age;
    private String gender;
    private double weigth;
    private double heigth;

    public Person() {
    }       

    public Person(String name, LocalDate dateOfBirth, int age) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
    }

    public Person(String name, LocalDate dateOfBirth, int age, String gender, double weigth, double heigth) {
      
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weigth = weigth;
        this.heigth = heigth;
    } 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", dateOfBirth=" + dateOfBirth + ", age=" + age + ", gender=" + gender + ", weigth=" + weigth + ", heigth=" + heigth + '}';
    }
    
}
