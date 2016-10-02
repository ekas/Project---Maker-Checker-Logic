package com.Nucleus.brd.ServiceLayer;

public class CustInfoVars {
	private String custCode;
	private String custName;
	private String custAdd1;
	private String custAdd2;
	private String custPin;
	private String custEmail;
	private String custContact;
	private String custPriContact;
	private String recStatus;
	private String custAIFlag;
	private String createDate;
	private String createBy;
	private String modDate;
	private String modBy;
	private String authDate;
	private String authBy;
	
	public CustInfoVars(String custCode, String custName, String custAdd1,
			String custAdd2, String custPin, String custEmail,
			String custContact, String custPriContact, String recStatus,
			String custAIFlag, String createDate, String createBy, String modDate,String modBy,
			String authDate,String authBy) {
		
		this.custCode = custCode;
		this.custName = custName;
		this.custAdd1 = custAdd1;
		this.custAdd2 = custAdd2;
		this.custPin = custPin;
		this.custEmail = custEmail;
		this.custContact = custContact;
		this.custPriContact = custPriContact;
		this.recStatus = recStatus;
		this.custAIFlag = custAIFlag;
		this.createDate = createDate;
		this.createBy = createBy;
		this.modDate = modDate;
		this.modBy = modBy;
		this.authDate = authDate;
		this.authBy = authBy;
		
	}

	public CustInfoVars() {
		// TODO Auto-generated constructor stub
	}

	public void setCusInfoVars(String custCode, String custName, String custAdd1,
			String custAdd2, String custPin, String custEmail,
			String custContact, String custPriContact, String recStatus,
			String custAIFlag, String createBy) {
		
		this.custCode = custCode;
		this.custName = custName;
		this.custAdd1 = custAdd1;
		this.custAdd2 = custAdd2;
		this.custPin = custPin;
		this.custEmail = custEmail;
		this.custContact = custContact;
		this.custPriContact = custPriContact;
		this.recStatus = recStatus;
		this.custAIFlag = custAIFlag;
		this.createBy = createBy;
	}
	
	public void setCusInfoVars(String custCode) {
		this.custCode = custCode;		
	}
	
	public String getCustCode() {
		return custCode;
	}

	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAdd1() {
		return custAdd1;
	}

	public void setCustAdd1(String custAdd1) {
		this.custAdd1 = custAdd1;
	}

	public String getCustAdd2() {
		return custAdd2;
	}

	public void setCustAdd2(String custAdd2) {
		this.custAdd2 = custAdd2;
	}

	public String getCustPin() {
		return custPin;
	}

	public void setCustPin(String custPin) {
		this.custPin = custPin;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public String getCustContact() {
		return custContact;
	}

	public void setCustContact(String custContact) {
		this.custContact = custContact;
	}

	public String getCustPriContact() {
		return custPriContact;
	}

	public void setCustPriContact(String custPriContact) {
		this.custPriContact = custPriContact;
	}

	public String getRecStatus() {
		return recStatus;
	}

	public void setRecStatus(String recStatus) {
		this.recStatus = recStatus;
	}

	public String getCustAIFlag() {
		return custAIFlag;
	}

	public void setCustAIFlag(String custAIFlag) {
		this.custAIFlag = custAIFlag;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getModDate() {
		return modDate;
	}

	public void setModDate(String modDate) {
		this.modDate = modDate;
	}

	public String getModBy() {
		return modBy;
	}

	public void setModBy(String modBy) {
		this.modBy = modBy;
	}

	public String getAuthDate() {
		return authDate;
	}

	public void setAuthDate(String authDate) {
		this.authDate = authDate;
	}

	public String getAuthBy() {
		return authBy;
	}

	public void setAuthBy(String authBy) {
		this.authBy = authBy;
	}

	
}
