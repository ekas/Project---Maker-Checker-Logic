package com.Nucleus.brd.ServiceLayer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class ValidateJunction {
	
	private int flag = 0;
	String REGEX = null;
	String ErrorReturn = null;
	String str = null;
	
	List<String> arrList = new ArrayList<String>();
	// Boolean Length check for all important Not Null Fields
	//It is First level of Validation
	
	String validateIndiFieldCheck(CustInfoVars cus){
		
		if(ValidateCustCode(cus.getCustCode()) == true){
			if(ValidateCustName(cus.getCustName()) == true){
				if(ValidateCustAdd1(cus.getCustAdd1()) == true){
					if(ValidateCustEmail(cus.getCustEmail()) == true){
						if(ValidateCustPriContact(cus.getCustPriContact()) == true){
							if(ValidateCustRecStatus(cus.getRecStatus()) == true){
								if(ValidateCustAIFlag(cus.getCustAIFlag()) == true){
										if(ValidateCreateBy(cus.getCreateBy()) == true){
											if(ValidateCustPin(cus.getCustPin()) == true){
												str = "clear";
												return str;
											}
											else{
												str = "Customer Pin(Validation Failure)";
											}
										}
										else{
											str = "Create By(Validation Failure)";
										}
								}
								else{
									str = "Active/Inactive Flag(Validation Failure)";
								}
							}
							else{
								str = "Record Status Flag(Validation Failure)";
							}
						}
						else{
							str = "Primary Contact(Validation Failure)";
						}
					}
					else{
						str = "Email(Validation Failure)";
					}
				}
				else{
					str = "Customer Address(Validation Failure)";
				}
			}
			else{
				str = "Customer Name(Validation Failure)";
			}
		}
		else{
			str = "Customer Code(Validation Failure)";
		}
		return str;			
	}
	
	 
	boolean ValidateCustCode(String CustCode){
		 
		 if((ValidatePrimaryCheck(CustCode)==true && (CustCode.length()>0) && (CustCode.length()<=10)))
		     flag = 1;
		 else 
			 flag = 0;
		 
		 if(flag == 1) 
			 return true;
		 else
			 return false;
	 }
	 
	boolean ValidatePrimaryCheck(String CustCode){
			
			if(arrList.contains(CustCode)){
				flag = 0;
			}
			else {
				arrList.add(CustCode);
				flag = 1;
			}
			if(flag == 1) 
				 return true;
			 else
				 return false;		
	}
	
	boolean ValidateCustName(String CustName){
		 
		 if((CustName.length()>0) && (CustName.length()<=30)){
			 REGEX = "^[a-zA-Z0-9\\s]+";
			 Pattern p = Pattern.compile(REGEX);
			 Matcher m = p.matcher(CustName);
			 if(m.find()){
					 flag = 1;
			 }
		 }
		 
		 if(flag == 1)        
			 return true;
		 else            
			 return false; 
		 }
	 
	 boolean ValidateCustAdd1(String CustAdd1){
		 
		 if((CustAdd1.length()>=6) && (CustAdd1.length()<=100))
			 flag=1;
		 else 
			 flag=0;
		 
		 if(flag == 1) 
			 return true;
		 else 
			 return false;
	 }
	 
	 boolean ValidateCustPin(String CustPin){
		 
		 REGEX = "^[1-9][0-9]{6}$";
		
		 Pattern p = Pattern.compile(REGEX);
		 Matcher m = p.matcher(CustPin);
		 if(m.find()){
			 flag = 1;
		 }
		 
		 if(flag == 1) 
			 return true;
		 else 
			 return false;
	 }
	 
	 boolean ValidateCustEmail(String CustEmail){
		 
		if((CustEmail.length()>=5) && (CustEmail.length()<=100)){
			REGEX = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern p = Pattern.compile(REGEX, Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(CustEmail);
			if(m.find()){
				flag = 1;
			}
		}		
		
		 if(flag == 1) 
			 return true;
		 else 
			 return false;
				
	 }
	 
	 boolean ValidateCustPriContact(String CustPriContact){
		 
		 if((CustPriContact.length()>=5) && (CustPriContact.length()<=10))
			 flag = 1;
		 else 
			 flag = 0;
		 
		 if(flag == 1) 
			 return true;
		 else 
			 return false;
	 }
	 
	 boolean ValidateCustRecStatus(String RecStatus){
		 
		 REGEX = "[NMADR]";
			
		 Pattern p = Pattern.compile(REGEX);
		 Matcher m = p.matcher(RecStatus);
		 if(m.find()){
			 flag = 1;
		 }
		 
		 if(flag == 1) 
			 return true;
		 else 
			 return false;
	 }
	 
	 boolean ValidateCustAIFlag(String CustAIFlag){
		 
		 REGEX = "[AI]";			
		 Pattern p = Pattern.compile(REGEX);
		 Matcher m = p.matcher(CustAIFlag);
		 if(m.find()){
			 flag = 1;
		 }
		 
		 if(flag == 1) 
			 return true;
		 else 
			 return false;
	 }
	 
	 
	 /*
	 boolean ValidateCreateDate(String CreateDate){
		 
		 if(CreateDate != null)
			 flag = 1;
		 else 
			 flag = 0;
		 
		 if(flag == 1) 
			 return true;
		 else 
			 return false;
	 }
	 */
	 boolean ValidateCreateBy(String CreateBy){
		 
		 if((CreateBy.length()>=0) && (CreateBy.length()<=30))
			 flag = 1;
		 else 
			 flag = 0;
		 
		 if(flag == 1) 
			 return true;
		 else 
			 return false;
	 }
	 
	 
}
