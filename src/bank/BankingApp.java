package bank;
import java.util.Scanner;
import java.util.ArrayList;

public class BankingApp {
	
	

	
	static Scanner sc = new Scanner(System.in); 
	
	public static void main(String args[])
	{
		ArrayList<BankDetails>memoryData = new ArrayList<BankDetails>();
		// Switch Case for the menu :
		
		String ch; 
		
		
        do {  
        	
            System.out.println("\n***American Express Banking Portal***\n");  
            System.out.println("1. Create a new Account\n"
			            		+ "2. Display all accounts\n"
			            		+ "3. Update an account\n"
			            		+ "4. Delete an account\n"
			            		+ "5. Deposit an amount\n"
			            		+ "6. Withdraw an amount\n"
			            		+ "7. Search an account\n"
			            		+ "8. Exit\n");  
            
            System.out.println("Enter your choice: ");  
            
            ch = sc.next();  
            
                switch (ch) {  
                	
                	case "1":
                		BankDetails temp = new BankDetails();
                		temp.openAccount(); 
                		memoryData.add(temp);
                	
                		delay();
       
                		
                		break;
                    case "2":  
                    	
                    	if(memoryData.size()==0)
                    	{
                    		System.out.println("There are no Accounts ! ");
      
                    	}
                    	else
                    	{
	                        for (int i = 0; i < memoryData.size()  ; i++) {  
	                    
	                            memoryData.get(i).showAccount();  
	                            System.out.println("");
	                        }  
                    	}
                        delay();
                        break;  
                    case "3":
                    	if(memoryData.size()==0)
                    	{
                    		System.out.println("There are no Accounts ! ");
      
                    	}
                    	else {
                    	System.out.print("Enter Account Number to Update: ");
                    	String ac_no = sc.next();  
                        boolean found = false;  
                        for (int i = 0; i < memoryData.size() ; i++) {  
                            found = memoryData.get(i).update(ac_no);  
                            if (found) {
                       
                                break;  
                            }  
                        }
                       
                        if (!found) {  
                            System.out.println("Update failed! Account doesn't exist..!!");  
                        } 
                    	}
                        delay();
                    	break;
                    case "4":
                    	if(memoryData.size()==0)
                    	{
                    		System.out.println("There are no Accounts ! ");
      
                    	}
                    	else {
                    	System.out.print("Enter Account Number to Delete: ");
                        String ac_no = sc.next();  
                        boolean found = false;
                        for (int i = 0; i < memoryData.size() ; i++) {  
                            found = memoryData.get(i).delete(ac_no);  
                            if (found) {
                            	memoryData.remove(i);
                            	System.out.println("Deletion Successful !");
                            	if(memoryData.size()==0)
                            		System.out.println("There are no Accounts ! ");
                                break;  
                            }  
                        }
                       
                        if (!found) {  
                            System.out.println("Deletion failed! Account doesn't exist..!!");  
                        }
                    	}
                        delay();
                    	break;
                   
                    case "5":
                    	if(memoryData.size()==0)
                    	{
                    		System.out.println("There are no Accounts ! ");
      
                    	}
                    	else {
                        System.out.print("Enter Account number for Deposit : ");  
                        String ac_no = sc.next();  
                        boolean found = false;  
                        for (int i = 0; i < memoryData.size(); i++) {  
                            found = memoryData.get(i).search(ac_no);  
                            if (found) {  
                            	memoryData.get(i).deposit();  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Deposit failed! Account doesn't exist !");  
                        }
                    	}
                        delay();
                        break; 
                        
                    case "6":  
                    	if(memoryData.size()==0)
                    	{
                    		System.out.println("There are no Accounts ! ");
      
                    	}
                    	else {
                        System.out.print("Enter Account Number : ");  
                        String ac_no = sc.next();  
                        boolean found = false;  
                        for (int i = 0; i < memoryData.size(); i++) {  
                            found = memoryData.get(i).search(ac_no);  
                            if (found) {  
                            	memoryData.get(i).withdrawal();  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Withdraw Failed! Account doesn't exist !");  
                        }  
                    	}
                        delay();
                        break;  
                       
                    case "7":
                    	if(memoryData.size()==0)
                    	{
                    		System.out.println("There are no Accounts ! ");
      
                    	}
                    	else {
                        System.out.print("Enter account number to search: ");  
                        String ac_no = sc.next();  
                        boolean found = false;  
                        for (int i = 0; i < memoryData.size(); i++) {  
                            found = memoryData.get(i).search(ac_no);  
                            if (found) {  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                    	}
                        delay();
                        break;  
                   
                    case "8":  
                        System.out.println("Thank You for using American Express !");  
                        break;  
                }  
            }  
            while (!ch.equals("8")); 
	}
	
	static void delay()
    {
    	    System.out.println("Press Any Key to Continue !");
	        sc.nextLine();
	        sc.nextLine();
    }

}
