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
    
    // For Taking Inputs :
    Scanner sc = new Scanner(System.in); 
    
    // Functions :
    
    public void openAccount() {  
    	
    	LocalDateTime myDateObj = LocalDateTime.now();
    	DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
    	
    	System.out.print("Enter Name: ");  
        String nameTemp = sc.nextLine(); 
        System.out.print("Enter Account Number: ");  
        String accnoTemp = sc.next();  
        
        System.out.print("Enter Account type: ");  
        String acc_typeTemp = sc.next();  
         
        System.out.print("Enter Balance: ");  
        long balanceTemp = sc.nextLong();  
        
        if(balanceTemp>minBalance)
        	{
	        	name = nameTemp ;
	        	accNo = accnoTemp ;
	        	accType = acc_typeTemp ;
	        	balance = balanceTemp ;
	        	creationDate = myDateObj.format(myFormatObj);
	        	System.out.println("Account Succesfully Created !");
	        	bankAccountCount++;
        	}
        else
        	{
        	
        		System.out.println("Account Creation Failed !\nMinimum of Deposit BDT 500 is required !");
        	
        	}	
    }
    
    public void showAccount() { 
    	
    	
    }
    
    
    public void deposit() { 
    	
    	
    }
    
    public void withdrawal() { 
    	
    	
    }
    
    public boolean search(String accNo) { 
    	
    	
    }
    
    public boolean update(String ac_no) {
    	
    }
    
    public boolean delete(String ac_no) { 
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
