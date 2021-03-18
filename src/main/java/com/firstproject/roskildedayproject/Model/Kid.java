package com.firstproject.roskildedayproject.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Kid {

    @Id
    private int KKID;
    private int RID;
    private String first_name;
    private String last_name;
    private Date DOB;
    private Date start_date;
    private boolean wait;

    public Kid(){ }

    public Kid(int KKID, int RID, String first_name,
               String last_name, Date DOB,
               Date start_date, boolean wait) {
        this.KKID = KKID;
        this.RID = RID;
        this.first_name = first_name;
        this.last_name = last_name;
        this.DOB = DOB;
        this.start_date = start_date;
        this.wait = wait;
    }

    @javax.persistence.Id
    public int getKKID() { return KKID; }

    public void setKKID(int KID) { this.KKID = KID; }

    public int getRID() { return RID; }

    public void setRID(int RID) { this.RID = RID; }

    public String getFirst_name() { return first_name; }

    public void setFirst_name(String first_name) { this.first_name = first_name; }

    public String getLast_name() { return last_name; }

    public void setLast_name(String last_name) { this.last_name = last_name; }

    public Date getDOB() { return DOB; }

    public void setDOB(Date DOB) { this.DOB = DOB; }

    public Date getStart_date() { return start_date; }

    public void setStart_date(Date start_date) { this.start_date = start_date; }

    public boolean isWait() { return wait; }

    public void setWait(boolean wait) { this.wait = wait; }

}
