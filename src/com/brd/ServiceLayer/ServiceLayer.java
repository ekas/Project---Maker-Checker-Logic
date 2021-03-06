package com.brd.ServiceLayer;

import java.util.ArrayList;
import java.util.List;

import com.brd.DAO.LoginMain;
import com.brd.DAO.interDao;



public class ServiceLayer {
	private String user ;
	private String pass ;
	int ret = 0;
	
	
	
	private String strValidateFieldCheck = null;
	private String addRecordStr = null;
	private String deleteRecordStr = null;
	private String checkerStr = null;
	private String makerStr = null;
	List<CustInfoVars> custList = new ArrayList<CustInfoVars>();
	
	interDao lm = new LoginMain();
	ValidateJunction vj = new ValidateJunction();
	CustInfoVars cus = new CustInfoVars();
	
	
	public int setVars(String user, String pass) {
		
		// TODO Auto-generated method stub
		this.user = user;
		this.pass = pass;
		
		System.out.println("Hello " + user + " your password is : " + pass);
		
		ret = lm.search(user,pass);
		System.out.println(ret);
		
		return ret;		
	}
	public String setVarsCust(String custCode, String custName,
		String custAdd1, String custAdd2, String custPin, String custEmail,
		String custContact, String custPriContact, String recStatus,
		String custAIFlag, String createBy) {
		
		cus.setCusInfoVars(custCode, custName, custAdd1, custAdd2, custPin, custEmail, custContact, 
				custPriContact, recStatus, custAIFlag, createBy);
		
		
		strValidateFieldCheck = vj.validateIndiFieldCheck(cus);
		System.out.println(strValidateFieldCheck);
			
		
		if(strValidateFieldCheck.equals("clear")){
			addRecordStr = lm.addMakerRecord(cus.getCustCode(), cus.getCustName(), cus.getCustAdd1(), 
				cus.getCustAdd2(), new Float(cus.getCustPin()), cus.getCustEmail(), new Float(cus.getCustContact()), cus.getCustPriContact(), 
				cus.getRecStatus(), cus.getCustAIFlag(), cus.getCreateBy());
		
		return addRecordStr;
		}
		else{
			
			return strValidateFieldCheck;
		}				
	}
	
	public String setVarsCustCheckerA(String custCode, String custName, String custAdd1, String custAdd2, String custPin,
			String custEmail, String custContact, String custPriContact, String recStatus, String custAIFlag,
			String createBy, String createDate, String modBy, String modDate, String authBy) {

		cus.setCusInfoVarsChecker(custCode, custName, custAdd1, custAdd2, custPin, 
				custEmail, custContact, custPriContact, recStatus, custAIFlag, createBy,createDate,modBy,modDate,authBy);
		
		if(recStatus.equals("N") || recStatus.equals("M")){
			
			strValidateFieldCheck = vj.validateIndiFieldCheck(cus);			
			System.out.println(strValidateFieldCheck);
			
			if(strValidateFieldCheck.equals("clear")){
				checkerStr = lm.checkerAuthorize(cus.getCustCode(), cus.getCustName(), cus.getCustAdd1(), 
					cus.getCustAdd2(), new Float(cus.getCustPin()), cus.getCustEmail(), new Float(cus.getCustContact()), cus.getCustPriContact(), 
					cus.getRecStatus(), cus.getCustAIFlag(), cus.getCreateBy(),cus.getCreateDate(),cus.getModBy(),cus.getModDate(),cus.getAuthBy());
				return checkerStr;
			}
			else{
				
				return strValidateFieldCheck;
			}
		}
		else{
			return checkerStr = lm.checkerAuthorize(cus.getCustCode(), cus.getCustName(), cus.getCustAdd1(), 
					cus.getCustAdd2(), new Float(cus.getCustPin()), cus.getCustEmail(), new Float(cus.getCustContact()), cus.getCustPriContact(), 
					cus.getRecStatus(), cus.getCustAIFlag(), cus.getCreateBy(),cus.getCreateDate(),cus.getModBy(),cus.getModDate(),cus.getAuthBy());
			}		
	}
	
	public String setVarsCustCheckerB(String custCode,String recStatus) {
		cus.setCusInfoVarsChecker(custCode,recStatus);		
		checkerStr = lm.checkerReject(cus.getCustCode(),cus.getRecStatus());		
		return checkerStr;		
	}
	
	public String setVarsCustModifyTemp(String custCode, String custName, String custAdd1, String custAdd2,
			String custPin, String custEmail, String custContact, String custPriContact, String recStatus,
			String custAIFlag, String createBy, String createDate, String modBy, String authDate, String authBy,
			String recStatusSession, String userSession2) {
		
		cus.setCusInfoVarsMaker(custCode, custName, custAdd1, custAdd2, custPin, 
				custEmail, custContact, custPriContact, recStatus, custAIFlag, createBy,createDate,modBy,authDate,authBy);
		
		makerStr = lm.modifyMakerRecord(cus.getCustCode(), cus.getCustName(), cus.getCustAdd1(), 
				cus.getCustAdd2(), new Float(cus.getCustPin()), cus.getCustEmail(), new Float(cus.getCustContact()), cus.getCustPriContact(), 
				cus.getRecStatus(), cus.getCustAIFlag(), cus.getCreateBy(),cus.getCreateDate(),cus.getModBy(),cus.getAuthDate(),cus.getAuthBy(),recStatusSession,userSession2);
		
		return makerStr;
	}
	
	public String setVarsCustModifyPerm(){

		return makerStr;
	}
	
	public String setVarsCust(String custCode) {
		cus.setCusInfoVars(custCode);
		deleteRecordStr = lm.deleteRecord(cus.getCustCode());
		return deleteRecordStr;
	}
	
	public CustInfoVars setVarsCust2(String custCode) {
		cus.setCusInfoVars(custCode);
		return cus = lm.viewRecord(cus.getCustCode());		
	}
	
	public List<CustInfoVars> setVarsCust3() {
		
		return custList= lm.searchRecord();		
	}

	public CustInfoVars setVarsCust4(String custCode) {
		cus.setCusInfoVars(custCode);
		return cus= lm.modifyGetRecord(cus.getCustCode());			
	}
	
	
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	
	
	


	

	/*
	public boolean setAddItem() {
		ret = lm.addProd(itemName,itemQty);
		return ret;
	}
	
	public boolean setBuyItem() {
		ret = lm.buyProd(itemName,itemQty);
		return ret;
	}
	
	public float setSearchItem() {
		float val = lm.searchProd(itemName);
		return val;
	}
	
	public boolean setDeleteItem() {
		ret = lm.deleteProd(itemName);
		return ret;
	}
	
	public List<product> setSearchAll() {
		List<product> prodList = new ArrayList<product>();
		prodList = lm.searchAllProd();
	return prodList;
	}
	*/
}
