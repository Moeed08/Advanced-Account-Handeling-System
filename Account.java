package task1_SDA;
import java.util.Scanner;
	public class Account 
	{
		
	  protected int accno;
	  protected double balance;
	  protected  String date;
	  public float amount;
	  private String name;
	  private String address;
	  private int phoneno;
	  Scanner in=new Scanner(System.in);
	   public void setAccountno(int accNo)
	   {
		   this.accno=accNo;
	   }
	   public void setBalance(double blnc )
	   {
		  this.balance=blnc;
	   }
	   public void setDate(String Date)
	   {
		   this.date=Date;
	   }
	   public int getAccount()
	   {
		   return accno;
	   }
	   public double getBalance()
	   {
		   return balance;
	   }
	   public String  getDate()
	   {
		   return date;
	   }
	   public  void makeDeposit(double amount)
	   {
		  
		   balance+=amount;
		   System.out.print("Amount deposit successfully");
		   System.out.print("Current Balance is:"+ balance);
		   
	       
	   }
	   public void checkBalance(int acc)
	   {
		  System.out.print("Account Number: ");
		  System.out.println(accno);
		  System.out.print("Balance: ");
		  System.out.println(balance);
		  //return balance;
	   }
	   public void withdrawl(double amount)
	   {
		  
		   System.out.println("Your Account Number: ");
		   int acc=in.nextInt();
		   if(acc==accno)
		   {
			   System.out.print("How much amount do you want to withdraw: ");
			   amount=in.nextFloat();
			   balance-=amount;
			   System.out.println("Amount withdraw successfully");
			   System.out.print("Your remainning balance is:");
			   System.out.println(balance);
			   
		   }
		   else
		   {
			   System.out.println("Account does not exists, Please try again");
		   }
	   }
	   public void printStatement(float amount)
	   {
		   System.out.print("Account Number: ");
		   System.out.println(accno);
		   System.out.print("Time of transaction: ");
		   System.out.println("Take time from the system");  
		   System.out.print("Date of Transaction: ");
		   System.out.println("Take date from the system"); 
		   balance-=amount;
		   System.out.print("Amount is:");
		   System.out.println(amount);  
		   System.out.print("balance :");  
		   System.out.println(balance);  
		   
	   }
	   public void transferAmount()
	   {
		   //function body
	   }
	   public void displayAllDeductionsSavings(float zakat)
	   {
		   System.out.println("Account Details are:"); 
		   System.out.print("Account Number: ");
		   System.out.println(accno);
		   System.out.print("Time of transaction: ");
		   System.out.println("Take time from the system");  
		   System.out.print("Date of Transaction: ");
		   System.out.println("Take date from the system"); 
		   balance-=amount;
		   System.out.print("Amount is:");
		   System.out.println(amount);  
		   System.out.print("balance :");  
		   System.out.println(balance);  
		   System.out.print("Zakat deduction :");  
		   System.out.println(zakat);  
		     
	
	   }
	   public void displayAllDeductionsChecking(float zakat)
	   {
		   System.out.println("Account Details are:"); 
		   System.out.print("Account Number: ");
		   System.out.println(accno);
		   System.out.print("Time of transaction: ");
		   System.out.println("Take time from the system");  
		   System.out.print("Date of Transaction: ");
		   System.out.println("Take date from the system"); 
		   balance-=amount;
		   System.out.print("Amount is:");
		   System.out.println(amount);  
		   System.out.print("balance :");  
		   System.out.println(balance);  
		   System.out.print("Zakat deduction :");  
		   System.out.println(zakat);  
		     
	
	   }
	   public void setName(String Name)
	   {
		   this.name=Name;
		   
	   }
	   public void setAddress(String add)
	   {
		   this.address=add;
		      
	   }
	   public void setPhoneno(int phoneNo)
	   {
		  this.phoneno=phoneNo;
		   
	   }
	   public String getName()
	   {
		  return name;
		   
	   }
	   public String getAddress()
	   {
		   return address;
		   
	   }
	   public int getPhoneno()
	   {
		   return phoneno;
		   
	   }
	   public void CreateAccount()
		{
			System.out.println("Enter Account Number:");
			int acc=in.nextInt();
			setAccountno(acc);
			System.out.println("Enter your name:");
			String name=in.next();
			setName(name);
			System.out.println("Enter your Address:");
			String address=in.next();
		    setAddress(address);
			System.out.println("Enter your Phone Number:");
			int phoneno=in.nextInt();
			setPhoneno(phoneno);
			System.out.println("Enter Balance:");
			double blnc=in.nextDouble();
			setBalance(blnc);
			System.out.println("Enter Date of Creation");
			String dateofcrtion=in.next();
			setDate(dateofcrtion);
			//input.close();
		}
	public void withdrawl() {
		// TODO Auto-generated method stub
		
	}
	   
	   
	}
