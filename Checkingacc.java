package task1_SDA;
import java.io.FileWriter;
import java.io.IOException;

public class Checkingacc extends Account
{
	//private int transcation_fees=0;
	private int transpermonth=2;
	protected int transcation_fees;
	public void setTransactionFees(int fees)
	{
		this.transcation_fees=fees;
	}
	 public void SavingstoCheckFile() 
	    {
	        try (FileWriter writer=new FileWriter("CheckingsFile.txt",true))
	        {
	            writer.append(getAccount() + "\n" + getName() + "\n" + getPhoneno() + "\n" + getAddress()+ "\n" + getBalance()+ "\n" +getDate()+"\n");
//	            System.out.println(getName());
//	            System.out.println(getPhoneno());
	            writer.close();
	
	        } catch (IOException e){   
	        	System.out.println("Error occured");
	            e.printStackTrace();
	        } 
	    }
	 public void CalTax()
	 {
		 System.out.println("Enter the percentage of tax from 0 to 1:");
		 double taxper=in.nextDouble();
		 taxper=(taxper*balance);
		 double tax=balance-taxper;
		 System.out.println("Your tax is:"+ tax);
	 }
	@Override
	public void withdrawl()
	{
		transpermonth--;
		if(transpermonth>2)
		{
			System.out.println("Transaction fees of 10Rs will be Apply");
			
		}
		
	}
	

}
