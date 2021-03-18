package com.firstproject.roskildedayproject.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GuardianInfo {

    @Id
    private int GID;
    private String first_name;
    private String last_name;
    private int telephone;
    private String email;
    private int cpr;

    public GuardianInfo(){}

    public GuardianInfo(int GID, String first_name,
                        String last_name, int telephone, String email, int cpr) {
        this.GID = GID;
        this.first_name = first_name;
        this.last_name = last_name;
        this.telephone = telephone;
        this.email = email;
        this.cpr = cpr;
    }

    @javax.persistence.Id
    public int getGID() {
        return GID;
    }

    public void setGID(int GID) {
        this.GID = GID;
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

    public int getCpr() {
        return cpr;
    }

    public void setCpr(int cpr) {
        this.cpr = cpr;
    }
}
