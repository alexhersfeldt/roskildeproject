package com.firstproject.roskildedayproject.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class WaitingList {

    @Id
    private int WLID;
    private int KID;
    private Date wait_start;

    public WaitingList(){}

    public WaitingList(int WLID, int KID, Date wait_start) {
        this.WLID = WLID;
        this.KID = KID;
        this.wait_start = wait_start;
    }

    @javax.persistence.Id
    public int getWLID() { return WLID; }

    public void setWLID(int WLID) { this.WLID = WLID; }

    public int getKID() { return KID; }

    public void setKID(int KID) { this.KID = KID; }

    public Date getWait_start() { return wait_start; }

    public void setWait_start(Date wait_start) { this.wait_start = wait_start; }
}

