package com.entity;

import java.util.Date;

public class ArchiveRequestStatus {
	
	private String rampII;
	private Date billIssueDate;
	private String requesterID;
	private String requestForDate;
	private String requestToDate;
	private int billSeqNum;
	
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

	public String getRequesterID() {
		return requesterID;
	}

	public void setRequesterID(String requesterID) {
		this.requesterID = requesterID;
	}

	public String getRequestForDate() {
		return requestForDate;
	}

	public void setRequestForDate(String requestForDate) {
		this.requestForDate = requestForDate;
	}

	public String getRequestToDate() {
		return requestToDate;
	}

	public void setRequestToDate(String requestToDate) {
		this.requestToDate = requestToDate;
	}

	public int getBillSeqNum() {
		return billSeqNum;
	}

	public void setBillSeqNum(int billSeqNum) {
		this.billSeqNum = billSeqNum;
	}

	@Override
	public String toString() {
		return "ArchiveRequestStatus [rampII=" + rampII + ", billIssueDate=" + billIssueDate + ", requesterID="
				+ requesterID + ", requestForDate=" + requestForDate + ", requestToDate=" + requestToDate
				+ ", billSeqNum=" + billSeqNum + "]";
	}
		
}
