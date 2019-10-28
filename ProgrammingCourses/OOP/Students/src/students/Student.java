/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students;

/**
 *
 * @author jc_go
 */
public class Student {

    int id;
    String last_name;
    String first_name;
    char gender;
    double grade;

    public Student(int id, String last_name, String first_name, char gender, double grade) {
        this.id = id;
        this.last_name = last_name;
        this.first_name = first_name;
        this.gender = gender;
        this.grade = grade;
    }

    public char getGender() {
        return gender;
    }

    public double getGrade() {
        return grade;
    }
    
}
