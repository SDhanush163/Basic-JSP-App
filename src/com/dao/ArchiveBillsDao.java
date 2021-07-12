package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.DBCon.DBConnection;
import com.entity.ArchiveBills;

public class ArchiveBillsDao {
	
	DBConnection dbConn = new DBConnection();
	Connection conn = dbConn.getConnection();
	
	private static final String FETCH_ALL_ARCHIVE_BILLS = "select * from DPS.archive_bills";
	
	public List<ArchiveBills> getAllArchiveBills() {
		
		List<ArchiveBills> bills = new ArrayList<ArchiveBills>();
		
		try {
			Statement statement= conn.createStatement();
			ResultSet set = statement.executeQuery(FETCH_ALL_ARCHIVE_BILLS);
			
			while(set.next()) {
				ArchiveBills bill = new ArchiveBills();
				bill.setRampII(set.getString(1));
				bill.setBillIssueDate(set.getDate(2));
				bill.setBillSeqNbr(set.getInt(3));
				bill.setTotalBillAmt(set.getInt(20));
				bill.setTotalCurrRev(set.getInt(21));
				bill.setTotalPastDueAmt(set.getInt(22));
				bill.setLecID(set.getString(23));
				
				bills.add(bill);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		return bills;
	}
	
}
