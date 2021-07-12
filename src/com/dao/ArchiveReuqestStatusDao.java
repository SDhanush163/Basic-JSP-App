package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.DBCon.ServerConnection;
import com.entity.ArchiveRequestStatus;

public class ArchiveReuqestStatusDao {
	
	ServerConnection svrConn = new ServerConnection();
	
	private static final String FETCH_ALL_ARCHIVE_REQUEST_BILLS = "Select * from DPS.archive_request_status";
	
	public List<ArchiveRequestStatus> getAllArchiveRequestStatus() {
		
		Connection conn = svrConn.getConnection();
		List<ArchiveRequestStatus> status = new ArrayList<ArchiveRequestStatus>();
		
		try {
			Statement statement = conn.createStatement();
			ResultSet set = statement.executeQuery(FETCH_ALL_ARCHIVE_REQUEST_BILLS);
			
			while(set.next()) {
				ArchiveRequestStatus requestStatus = new ArchiveRequestStatus();
				requestStatus.setRampII(set.getString("RAMP_II"));
				requestStatus.setBillIssueDate(set.getDate(2));
				requestStatus.setRequesterID(set.getString(3));
				requestStatus.setRequestForDate(set.getString(4));
				requestStatus.setRequestToDate(set.getString(5));
				requestStatus.setBillSeqNum(set.getInt(6));
				
				status.add(requestStatus);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		return status;
	}
}
