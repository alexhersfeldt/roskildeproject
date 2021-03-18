package com.firstproject.roskildedayproject.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Room {

    @Id
    private int RID;
    private int nr_of_kids;

    public Room(){}

    public Room(int RID, int nr_of_kids) {
        this.RID = RID;
        this.nr_of_kids = nr_of_kids;
    }

    @javax.persistence.Id
    public int getRID() { return RID; }

    public void setRID(int RID) { this.RID = RID; }

    public int getNr_of_kids() { return nr_of_kids; }

    public void setNr_of_kids(int nr_of_kids) { this.nr_of_kids = nr_of_kids; }
}
