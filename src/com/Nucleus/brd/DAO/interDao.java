 package com.Nucleus.brd.DAO;

import java.util.List;

import com.Nucleus.brd.ServiceLayer.CustInfoVars;


public interface interDao {
	public int search(String username, String pass) ;
	
	public String addMakerRecord(String custCode, String custName, String custAdd1, String CustAdd2, Float custPin, String custEmail, 
			Float custContact, String custPriContact, String recStatus, String custAIFlag, 
			String createBy);
	
	public String deleteRecord(String custCode);
	
	public CustInfoVars viewRecord(String custCode);
	
	public List<CustInfoVars> searchRecord();
	
	public CustInfoVars modifyGetRecord(String custCode);
	
	public String checkerAuthorize(String custCode, String custName, String custAdd1, String custAdd2, Float custPin,
			String custEmail, Float custContact, String custPriContact, String recStatus, String custAIFlag, String createBy,
			String createDate, String modBy, String modDate, String authBy);
	
	public String checkerReject(String custCode,String recStatus);
	
}
