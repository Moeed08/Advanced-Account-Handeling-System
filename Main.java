package task1_SDA;
import java.util.Scanner;

public class Main 
{
	
	public static void main (String[] args)
	{
		
		//User newUser=new User();
		System.out.println("\t\tWelcome To Account MAnagement System");
		while(true)
		{
			Savingsacc s1=new Savingsacc();
			Checkingacc c1=new Checkingacc();
			System.out.println("Please Choose your Operation");
			System.out.println("1.Admin");
			System.out.println("2.Customer");
			System.out.println("0.Exit");
			System.out.print("Enter Your choice:");
			Scanner input=new Scanner(System.in);
		    int choice=input.nextInt();
		    
		    switch(choice)
		    {
		       case 0:
			    	System.exit(0);
			    	break;
		       case 1:
		    	   System.out.println("1.Open an Acoount, Close an Account");
		    	   System.out.println("2.Login to a specific account by unique account number");
		    	   System.out.println("3.Make Deposit into the account");
		    	   System.out.print("Enter Your choice:");
		   	       choice=input.nextInt();
		   	       if(choice==1)
		   	       {
				   	    	System.out.println("1.Open An Account");
							System.out.println("2.Close An Account");
							System.out.print("Enter Your choice:");
							choice=input.nextInt();
							if(choice==1)
							{
					   	    	System.out.println("C.Checking Account");
						    	System.out.println("S.Savings Account");
						    	System.out.print("Enter Your choice:");
						    	char character=input.next().charAt(0);
						    	if(character=='s'|| character=='S')
						    	{
						    		s1.CreateAccount();
						    		s1.SavingstoFile();	
						    	}
					        	else if(character=='C'|| character=='c')
					    	      {
						    		c1.CreateAccount();
						    		c1.SavingstoCheckFile();
					    	      }	
				    	
				   	         }
		   	       }
		   	       if(choice==2)
		   	       {
		   	    	   System.out.println("Enter Account Number:");
		   	    	   int acc=input.nextInt();
		   	    	   System.out.println("Account Number Deleted "+ acc);
		   	    	   
		   	       }
		   	       if(choice==3)
		   	       {
			   	    	System.out.println("C.Checking Account");
				    	System.out.println("S.Savings Account");
				    	System.out.print("Enter Your choice:");
				    	char character=input.next().charAt(0);
				    	if(character=='s'|| character=='S')
				    	{
				    		System.out.print("Enter account Number:");
			   	            int acc=input.nextInt();
			   	            System.out.println(acc);
					   		System.out.print("Enter amount you want to Withdraw:");
					   		double amount=input.nextFloat();
					   		if(amount>0.0 && amount<=s1.getBalance())
					   			s1.setBalance(amount+s1.getBalance());
				    	}
			        	else if(character=='C'|| character=='c')
			    	      {
			        		System.out.print("Enter account Number:");
			   	            int acc=input.nextInt();
			   	            System.out.println(acc);
					   		System.out.print("Enter amount you want to Withdraw:");
					   		double amount=input.nextFloat();
					   		if(amount>0.0 && amount<=c1.getBalance())
					   			c1.setBalance(amount+s1.getBalance());
			    	      }	
		   	        	
		   	       }
		   	       
		    	   break;
		    	   
		       case 2:
		    	    System.out.println("1.Make Withdrawl from an account");
			   		System.out.println("2.Make Deposit into the account");
			   	    System.out.println("3.Check Balance");
			   		System.out.println("4.Print Statement");
			   		System.out.println("5.Transfer Amount");
			   		System.out.println("6.Display all Deductions");
		    	    System.out.println("7.Calculate Zakat for Saving Account");
		    	    System.out.println("8.Calculate Tax for Checking Account");
			   		System.out.print("Enter Your choice:");
		   	        choice=input.nextInt();
		   	        float amount;
		   	        if(choice==1)
		   	        {
	
			   	    	System.out.println("C.Checking Account");
				    	System.out.println("S.Savings Account");
				    	System.out.print("Enter Your choice:");
				    	char character=input.next().charAt(0);
				    	if(character=='s'|| character=='S')
				    	{
				    		System.out.print("Enter account Number:");
			   	            int acc=input.nextInt();
			   	            System.out.println(acc);
					   		System.out.print("Enter amount you want to Withdraw:");
					   		amount=input.nextFloat();
					   		if(amount>0.0 && amount<=s1.getBalance())
					   		{
						   		   System.out.println("Successfully withdraawl");	
	
					   		}
	
				    	}
			        	else if(character=='C'|| character=='c')
			    	      {
			        		System.out.print("Enter account Number:");
			   	            int acc=input.nextInt();
			   	            System.out.println(acc);
					   		System.out.print("Enter amount you want to Withdraw:");
					   		amount=input.nextFloat();
						   		if(amount>0.0 && amount<=c1.getBalance())
						   		{
						   		   System.out.println("Successfully withdraawl");	
						   		}
				    	    }	
		   	        	
		   	        }
		   	        else if(choice==2)
		   	        {
		   	        	System.out.print("Enter account Number:");
		   	            int acc=input.nextInt();
		   	            System.out.println(acc);
				   		System.out.print("Enter amount you want to Deposit:");
				   		amount=input.nextFloat();
				   		System.out.println("C.Checking Account");
				    	System.out.println("S.Savings Account");
				    	System.out.print("Enter Your choice:");
				    	char character=input.next().charAt(0);
				    	if(character=='s'|| character=='S')
				    		s1.makeDeposit(amount);
				    	else if(character=='C'|| character=='c')
				    		c1.makeDeposit(amount);	
		   	        }
		   	        else if(choice==3)
		   	        {
		   	        	System.out.print("Enter account Number:");
		   	            int acc=input.nextInt();
		   	           // System.out.println(acc);
		   	            System.out.println("C.Checking Account");
				    	System.out.println("S.Savings Account");
				    	System.out.print("Enter Your choice:");
				    	char character=input.next().charAt(0);
				    	if(character=='s'|| character=='S')
				    		s1.checkBalance(acc);
				    	else if(character=='C'|| character=='c')
				    		c1.checkBalance(acc);	
		   	            
		   	            
		   	        }
		   	        else if(choice==4)
		   	        {
		   	        	s1.calZakat();
		   	        }
		   	       else if(choice==5)
		   	        {
		   	        	c1.CalTax();
		   	        }
		    	   break;
		    	 
		    }
			
			input.close();
		}
	   

		
   }

}
