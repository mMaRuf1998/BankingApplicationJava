package bank;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BankDetails {
	
	// Needed Variables :
	private String accNo;  
    private String name;  
    private String accType; 
    private String creationDate ;
    private long balance;  
    private int minBalance = 500 ;
    static int bankAccountCount=0;
    static int accountCreationCount=1;
    
    // For Taking Inputs :
    Scanner sc = new Scanner(System.in); 
    
    // Functions :
    
    public void openAccount() {  
    	
    	LocalDateTime myDateObj = LocalDateTime.now();
    	DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
    	
    	System.out.print("Enter Name: ");  
        String nameTemp = sc.nextLine(); 
     
        System.out.print("Enter Account Type:\n1.Current 2.Savings 3.Salary: ");  
        String accTypeTemp = sc.next();  
         
        System.out.print("Enter Balance: ");  
        long balanceTemp = sc.nextLong();  
        String typeString = validAccountType(accTypeTemp) ;
        
        if(balanceTemp>minBalance&&typeString!=null)
        	{
	        	name = nameTemp ;
	        	accNo = stringConvert(accountCreationCount) ;
	        	accType = typeString ;
	        	balance = balanceTemp ;
	        	creationDate = myDateObj.format(myFormatObj);
	        	System.out.println("Account Succesfully Created !");
	        	bankAccountCount++;
	        	accountCreationCount++;
	        	showAccount() ;
        	}
        else
        	{
        	
        		System.out.println("Account Creation Failed !\n"
        						 + "Low Balance or Wrong Details !");
        	
        	}	
    }
    
    public void showAccount() { 
    	System.out.println("");
    	if(bankAccountCount>0) {
    	System.out.println("Name of the account holder: " + name);  
        System.out.println("Account Number: " + accNo);  
        System.out.println("Account type: " + accType);  
        System.out.println("Creation date: " + creationDate);  
        System.out.println("Balance: " + balance);
    	}
    	else
    	{
    		System.out.println("There are no Accounts !");
    	}
    	
    }
    
    
    public void deposit() { 
    	long amount;  
    	
        System.out.println("Enter the amount you want to deposit: ");  
        amount = sc.nextLong();  
        
        balance = balance + amount; 
        System.out.println("Balance after deposit: " + balance);
    	
    }
    
    public void withdrawal() { 
    	long amount;  
    	
        System.out.println("Enter the amount you want to withdraw: ");  
        amount = sc.nextLong();  
        
        if (balance >= amount+minBalance) 
        	{  
            	balance = balance - amount;  
            	System.out.println("Balance after withdrawal: " + balance);  
        	} 
        else 
        	{  
            	System.out.println("Transaction Failed , Low Balance !" );  
        	} 
    	
    }
    
    public boolean search(String ac_No) { 
    	if (accNo.equals(ac_No)) 
	    	{  
	            showAccount();  
	            return true;  
	        }  
    	
        return false;  
    }
    
    public boolean update(String ac_no) {
    	
    	if (accNo.equals(ac_no)) { 
   		 System.out.println("Enter Your New Name :");
   		 sc.nextLine();
   		 name = sc.nextLine();
   		 System.out.println("Your name has been updated !");
   		 showAccount();
   		 return true;
   	 }
    	
   	 else
   		 return false;
     }
    
    public boolean delete(String ac_no) { 
    	
    	if (accNo.equals(ac_no)) {  
            
            return true;  
        }  
  
        return false;  
    }  
    
    public String stringConvert(int number)
	    {
	    	return ""+number+"";
	    }
    
    public String validAccountType(String accountType){
    	
		if (accountType.equals("1")) {  
		            
			return "Current" ;
		} 
		else if(accountType.equals("2")){
			
			return "Savings" ;
		}

		else if(accountType.equals("3")){
			
			return "Salary" ;
		}
		
		else
			
			return null;  
    }
	    
    
  
    
    
    
    
    
    
    
    
    
    
    
}
