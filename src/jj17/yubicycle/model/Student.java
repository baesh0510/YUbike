package jj17.yubicycle.model;

import java.sql.Date;

import javafx.scene.image.Image;

public class Student {
	int sid;
	String sname;
	String sDept;
	int sPhone;
	byte[] sPic;
	int isBlacklist;
	String uid;
	int isRental;
	Date DueDate;
	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getsDept() {
		return sDept;
	}
	public void setsDept(String sDept) {
		this.sDept = sDept;
	}
	public int getsPhone() {
		return sPhone;
	}
	public void setsPhone(int sPhone) {
		this.sPhone = sPhone;
	}
	public byte[] getsPic() {
		return sPic;
	}
	public void setsPic(byte[] sPic) {
		this.sPic = sPic;
	}
	public int getIsBlacklist() {
		return isBlacklist;
	}
	public void setIsBlacklist(int isBlacklist) {
		this.isBlacklist = isBlacklist;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public int getIsRental() {
		return isRental;
	}
	public void setIsRental(int isRental) {
		this.isRental = isRental;
	}
	public Date getDueDate() {
		return DueDate;
	}
	public void setDueDate(Date dueDate) {
		DueDate = dueDate;
	}
	
	
	
}
