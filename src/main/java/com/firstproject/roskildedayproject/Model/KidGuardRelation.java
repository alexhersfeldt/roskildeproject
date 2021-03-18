package com.firstproject.roskildedayproject.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class KidGuardRelation {
    @Id
    private int KKID;
    private int GID;
    private String last_name;

    public KidGuardRelation(){}

    public KidGuardRelation(int KKID, int GID,
                            String last_name) {
        this.KKID = KKID;
        this.GID = GID;
        this.last_name = last_name;
    }

    @javax.persistence.Id
    public int getKKID() { return KKID; }

    public void setKKID(int KKID) { this.KKID = KKID; }

    public int getGID() { return GID; }

    public void setGID(int GID) { this.GID = GID; }

    public String getLast_name() { return last_name; }

    public void setLast_name(String last_name) { this.last_name = last_name; }
}
