package bank;

import bankApp.BankDetails;

public class BankingApp {

	public static void main(String args[])
	{
		// Switch Case for the menu :
		int ch; 
		
		
        do {  
            System.out.println("\n***Standard Chartered Banking Portal***");  
            System.out.println("1.Create a new Account \n"
			            		+ "2. Display all accounts\n"
			            		+ "3. Update an account\n"
			            		+ "4. Delete an account\n"
			            		+ "5. Deposit an amount\n"
			            		+ "6. Withdraw an amount\n "
			            		+ "7. Search an account\n "
			            		+ "8.Exit");  
            
            System.out.println("Enter your choice: ");  
            ch = sc.nextInt();  
                switch (ch) {  
                	
                	case 1:
       
                		C[BankDetails.bankAccountCount]= new BankDetails();
                		C[BankDetails.bankAccountCount].openAccount(); 
                		delay();
       
                		
                		break;
                    case 2:  
                    	
                    	if(BankDetails.bankAccountCount==0)
                    	{
                    		System.out.println("There are no Accounts ! ");
      
                    	}
                    	else
                    	{
	                        for (int i = 0; i < BankDetails.bankAccountCount  ; i++) {  
	                            C[i].showAccount();  
	                        }  
                    	}
                        delay();
                        break;  
                    case 3:
                    	System.out.print("Enter account no. you want to Update: ");
                    	String ac_no = sc.next();  
                        boolean found = false;  
                        for (int i = 0; i < BankDetails.bankAccountCount ; i++) {  
                            found = C[i].update(ac_no);  
                            if (found) {
                       
                                break;  
                            }  
                        }
                       
                        if (!found) {  
                            System.out.println("Update failed! Account doesn't exist..!!");  
                        }  
                        delay();
                    	break;
                    case 4:
                    	System.out.print("Enter account no. you want to Delete: ");
                        ac_no = sc.next();  
                        found = false;  
                        for (int i = 0; i < BankDetails.bankAccountCount ; i++) {  
                            found = C[i].delete(ac_no);  
                            if (found) {
                            	elementDelete(i);
                            	System.out.println("Deletion Successful !");
                            	C[i].showAccount();
                                break;  
                            }  
                        }
                       
                        if (!found) {  
                            System.out.println("Deletion failed! Account doesn't exist..!!");  
                        }  
                        delay();
                    	break;
                   
                    case 5:  
                        System.out.print("Enter Account no. for Deposit : ");  
                        ac_no = sc.next();  
                        found = false;  
                        for (int i = 0; i < C.length; i++) {  
                            found = C[i].search(ac_no);  
                            if (found) {  
                                C[i].deposit();  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Deposit failed! Account doesn't exist..!!");  
                        }
                        delay();
                        break; 
                        
                    case 6:  
                    	
                        System.out.print("Enter Account No : ");  
                        ac_no = sc.next();  
                        found = false;  
                        for (int i = 0; i < C.length; i++) {  
                            found = C[i].search(ac_no);  
                            if (found) {  
                                C[i].withdrawal();  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        
                        delay();
                        break;  
                       
                    case 7:  
                        System.out.print("Enter account no. you want to search: ");  
                        ac_no = sc.next();  
                        found = false;  
                        for (int i = 0; i < C.length; i++) {  
                            found = C[i].search(ac_no);  
                            if (found) {  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        
                        delay();
                        break;  
                   
                    case 8:  
                        System.out.println("See you soon...");  
                        break;  
                }  
            }  
            while (ch != 8); 
	}
}
