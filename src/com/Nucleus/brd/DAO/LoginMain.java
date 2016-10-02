package com.Nucleus.brd.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.Nucleus.brd.ServiceLayer.CustInfoVars;

public class LoginMain implements interDao{
	JDBConnection jd = new JDBConnection();
	CustInfoVars cus = new CustInfoVars();
	List<CustInfoVars> custList = new ArrayList<CustInfoVars>();
	Connection conn = null;
	String ret = null;
	int value = 0;
	@Override
	public int search(String username, String pass)  {
		try {
			 conn = jd.setConnection();
			 //String userdb = null;
			 //String passdb = null;
			 String str = null;
			
			String query = "SELECT * from userdataek";
			System.out.println(username+" "+pass);
			try {
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				
				
				while (rs.next()) {
					if( (rs.getString("username").equals(username)) && (rs.getString("password").equals(pass))){
						str = rs.getString("role");
						System.out.println(str + ": in");
						if(str.equals("M")){
							return 1;
						}
						else if(str.equals("C")){
							return 2;
						}
						else{
							return 0;
						}
					}				
				}
				System.out.println(str + ": out");					
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally{
			try {
				conn.commit();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}		
		return 0;
	}
	@Override
	public String addMakerRecord(String custCode, String custName, String custAdd1, String custAdd2, Float custPin, String custEmail, 
			Float custContact, String custPriContact, String recStatus, String custAIFlag, 
			String createBy){
		
		try{
			
			DateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy");
			Calendar cal = Calendar.getInstance();
			String createDate = dateFormat.format(cal.getTime());
			System.out.println(createDate);
			
			
			
			conn = jd.setConnection();
			
			String query = "INSERT INTO tempCustEk(custID,custCode,custName,custAdd1,custAdd2,custPin,custEmail," +
					"custContact,custPriContact,recStatus,custAIFlag,createDate,createBy)"
					+ "VALUES(sk_tempCustEk.nextval,?,?,?,?,?,?,?,?,?,?,?,?)";
			
			
			PreparedStatement pstmt = conn.prepareStatement(query);
			//pstmt.setInt(1, (count=count+1));
			pstmt.setString(1, custCode);
			pstmt.setString(2, custName);
			pstmt.setString(3, custAdd1);
			pstmt.setString(4, custAdd2);
			pstmt.setFloat(5, custPin);
			pstmt.setString(6, custEmail);
			pstmt.setFloat(7, custContact);
			pstmt.setString(8, custPriContact);
			pstmt.setString(9, recStatus);
			pstmt.setString(10, custAIFlag);
			pstmt.setString(11, createDate);
			pstmt.setString(12, createBy);
			pstmt.executeQuery();
			System.out.println("Data Entered into the Database");
			ret = "Data Entered into the Database Successfully";
		}
		catch (SQLException e) {
			ret = "Record not Added";
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try{
				conn.commit();
				conn.close();
				System.out.println("Connection closed");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return ret;
	}
	@Override
	public String deleteRecord(String custCode) {
		try {
			conn = jd.setConnection();
			String query = "delete from tempCustEk where custCode = ?";			
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, custCode);
			pstmt.executeQuery();
			System.out.println("Data Deleted Successfully");
			ret = "Data Deleted Successfully";
			
		}catch (SQLException e) {
			ret = "Record not Found";
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally{
			try{
				conn.commit();
				conn.close();
				System.out.println("Connection closed");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return ret;
	}
	@Override
	public CustInfoVars viewRecord(String custCode) {
		try {
			conn = jd.setConnection();
			
			String query = "select * from tempCustEk where custCode = ?";			
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, custCode);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				cus.setCustCode(rs.getString("custCode"));	
				cus.setCustName(rs.getString("custName"));
				cus.setCustAdd1(rs.getString("custAdd1"));
				cus.setCustAdd2(rs.getString("custAdd2"));
				cus.setCustPin(rs.getString("custPin"));
				cus.setCustEmail(rs.getString("custEmail"));
				cus.setCustContact(rs.getString("custContact"));
				cus.setCustPriContact(rs.getString("custPriContact"));
				cus.setRecStatus(rs.getString("recStatus"));
				cus.setCustAIFlag(rs.getString("custAIFlag"));
				cus.setCreateDate(rs.getString("createDate"));
				cus.setCreateBy(rs.getString("createBy"));
				cus.setModDate(rs.getString("modDate"));
				cus.setModBy(rs.getString("modBy"));
				cus.setAuthDate(rs.getString("authDate"));
				cus.setAuthBy(rs.getString("authBy"));
			}
			System.out.println("lm : "+cus.getRecStatus());
			System.out.println("Data Viewed Successfully");
			ret = "Data Viewed Successfully";
			
		}catch (SQLException e) {
			ret = "Record not Found";
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block			
			e.printStackTrace();
		}
		finally{
			try{
				conn.commit();
				conn.close();
				System.out.println("Connection closed");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
	return cus;		
	}
	@Override
	public List<CustInfoVars> searchRecord() {
		try {
			conn = jd.setConnection();
			String query = "select * from tempCustEk";			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			 
			
			while (rs.next()) {
				cus.setCustCode(rs.getString("custCode"));	
				cus.setCustName(rs.getString("custName"));
				cus.setCustAdd1(rs.getString("custAdd1"));
				cus.setCustAdd2(rs.getString("custAdd2"));
				cus.setCustPin(rs.getString("custPin"));
				cus.setCustEmail(rs.getString("custEmail"));
				cus.setCustContact(rs.getString("custContact"));
				cus.setCustPriContact(rs.getString("custPriContact"));
				cus.setRecStatus(rs.getString("recStatus"));
				cus.setCustAIFlag(rs.getString("custAIFlag"));
				cus.setCreateDate(rs.getString("createDate"));
				cus.setCreateBy(rs.getString("createBy"));
				cus.setModDate(rs.getString("modDate"));
				cus.setModBy(rs.getString("modBy"));
				cus.setAuthDate(rs.getString("authDate"));
				cus.setAuthBy(rs.getString("authBy"));
				
				custList.add(new CustInfoVars(rs.getString("custCode"),rs.getString("custName"),rs.getString("custAdd1"),rs.getString("custAdd2"),
						rs.getString("custPin"),rs.getString("custEmail"),rs.getString("custContact"),rs.getString("custPriContact"),
						rs.getString("recStatus"),rs.getString("custAIFlag"),rs.getString("createDate"),rs.getString("createBy"),
						rs.getString("modDate"),rs.getString("modBy"),rs.getString("authDate"),rs.getString("authBy")));
			}
			
			System.out.println("All Searched Successfully");
			ret = "All Searched Successfully";
			
		}catch (SQLException e) {
			ret = "Records not Found";
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block			
			e.printStackTrace();
		}
		finally{
			try{
				conn.commit();
				conn.close();
				System.out.println("Connection closed");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
	return custList;
	}
	@Override
	public CustInfoVars modifyGetRecord(String custCode) {
		try {
			conn = jd.setConnection();
			
			String query = "select * from tempCustEk where custCode = ?";			
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, custCode);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				cus.setCustCode(rs.getString("custCode"));	
				cus.setCustName(rs.getString("custName"));
				cus.setCustAdd1(rs.getString("custAdd1"));
				cus.setCustAdd2(rs.getString("custAdd2"));
				cus.setCustPin(rs.getString("custPin"));
				cus.setCustEmail(rs.getString("custEmail"));
				cus.setCustContact(rs.getString("custContact"));
				cus.setCustPriContact(rs.getString("custPriContact"));
				cus.setRecStatus(rs.getString("recStatus"));
				cus.setCustAIFlag(rs.getString("custAIFlag"));
				cus.setCreateDate(rs.getString("createDate"));
				cus.setCreateBy(rs.getString("createBy"));
				cus.setModDate(rs.getString("modDate"));
				cus.setModBy(rs.getString("modBy"));
				cus.setAuthDate(rs.getString("authDate"));
				cus.setAuthBy(rs.getString("authBy"));
			}
			
			System.out.println("Data Viewed Successfully");
			ret = "Data Viewed Successfully";
			
		}catch (SQLException e) {
			ret = "Record not Found";
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block			
			e.printStackTrace();
		}
		finally{
			try{
				conn.commit();
				conn.close();
				System.out.println("Connection closed");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
	return cus;		
	}
	@Override
	public String checkerAuthorize(String custCode, String custName, String custAdd1, String custAdd2, Float custPin,
			String custEmail, Float custContact, String custPriContact, String recStatus, String custAIFlag,
			String createBy, String createDate, String modBy, String modDate, String authBy) {
		
		if(recStatus.equals("N")){
			try{
				
				DateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy");
				Calendar cal = Calendar.getInstance();
				String authDate = dateFormat.format(cal.getTime());
				System.out.println(authDate);
				
				
				
				conn = jd.setConnection();
				
				String query = "INSERT INTO permCustEk(custID,custCode,custName,custAdd1,custAdd2,custPin,custEmail," +
						"custContact,custPriContact,recStatus,custAIFlag,createDate,createBy,modDate,modBy,authDate,authBy)"
						+ "VALUES(sk_permCustEk.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				
				
				PreparedStatement pstmt = conn.prepareStatement(query);
				//pstmt.setInt(1, (count=count+1));
				pstmt.setString(1, custCode);
				pstmt.setString(2, custName);
				pstmt.setString(3, custAdd1);
				pstmt.setString(4, custAdd2);
				pstmt.setFloat(5, custPin);
				pstmt.setString(6, custEmail);
				pstmt.setFloat(7, custContact);
				pstmt.setString(8, custPriContact);
				pstmt.setString(9, recStatus);
				pstmt.setString(10, custAIFlag);
				pstmt.setString(11, createDate);
				pstmt.setString(12, createBy);
				pstmt.setString(13, modDate);
				pstmt.setString(13, modDate);
				pstmt.setString(13, modDate);
				pstmt.setString(13, modDate);
				pstmt.executeQuery();
				System.out.println("Data Entered into the Master Table");
				ret = "Data Entered into the Master Table";
				
				
			}
			catch (SQLException e) {
				ret = "Record not Added";
				e.printStackTrace();
			}
			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				try{
					conn.commit();
					conn.close();
					System.out.println("Connection closed");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		return ret;
	}
}
