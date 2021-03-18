package com.firstproject.roskildedayproject.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher {

    private Integer RID;
    @Id
    private int TID;
    private String first_name;
    private String last_name;
    private int telephone;
    private String email;

    public Teacher(){}

    public Teacher(Integer RID, int TID, String first_name,
                   String last_name, int telephone, String email) {
        this.RID = RID;
        this.TID = TID;
        this.first_name = first_name;
        this.last_name = last_name;
        this.telephone = telephone;
        this.email = email;
    }

    public Integer getRID() {
        return RID;
    }

    public void setRID(Integer RID) {
        this.RID = RID;
    }

    @javax.persistence.Id
    public int getTID() {
        return TID;
    }

    public void setTID(int TID) {
        this.TID = TID;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
