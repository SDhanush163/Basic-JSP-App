package com.entity;

import java.util.Date;

public class ArchiveBills {
	
	private String rampII;
	private Date billIssueDate;
	private int billSeqNbr;
	private int totalBillAmt;
	private int totalCurrRev;
	private int totalPastDueAmt;
	private String lecID;
	
	public String getRampII() {
		return rampII;
	}
	
	public void setRampII(String rampII) {
		this.rampII = rampII;
	}
	
	public Date getBillIssueDate() {
		return billIssueDate;
	}
	
	public void setBillIssueDate(Date billIssueDate) {
		this.billIssueDate = billIssueDate;
	}
	
	public int getBillSeqNbr() {
		return billSeqNbr;
	}
	
	public void setBillSeqNbr(int billSeqNbr) {
		this.billSeqNbr = billSeqNbr;
	}
	
	public int getTotalBillAmt() {
		return totalBillAmt;
	}
	
	public void setTotalBillAmt(int totalBillAmt) {
		this.totalBillAmt = totalBillAmt;
	}
	
	public int getTotalCurrRev() {
		return totalCurrRev;
	}
	
	public void setTotalCurrRev(int totalCurrRev) {
		this.totalCurrRev = totalCurrRev;
	}
	
	
	public int getTotalPastDueAmt() {
		return totalPastDueAmt;
	}
	public void setTotalPastDueAmt(int totalPastDueAmt) {
		this.totalPastDueAmt = totalPastDueAmt;
	}
	
	
	public String getLecID() {
		return lecID;
	}
	
	public void setLecID(String lecID) {
		this.lecID = lecID;
	}

	@Override
	public String toString() {
		return "<br />Bill Details => [Ramp =" + rampII + ", Bill Issue Date = " + billIssueDate + ", Bill Seq No = " + billSeqNbr
				+ ", Total Bill Amount = " + totalBillAmt + ", Total Current Rev. = " + totalCurrRev + ", Total Past Due Amount = "
				+ totalPastDueAmt + ", Lec ID=" + lecID + "]";
	}

	
	
}
