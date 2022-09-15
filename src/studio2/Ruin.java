package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		   
		   int startamount=in.nextInt();
		   
		   int cons=startamount;
		   
		   double winchance=in.nextDouble();
		   
		   int winlimit=in.nextInt();
		   
		   int totalsim=in.nextInt();
		   
		   int i=1;
		   
		   int loss=0;
		   for (i=1;i<=totalsim;i++)
		   {
			   int js=0;
			   int plus=0;
			   int startamount1=cons;
			   while (true)
			   {
				   double a=Math.random();
				   
				   if (a<=winchance)
				   {
					   startamount1++;
					   plus++;
					   js++;
				   }
				   else
				   {
					   startamount1--;
					   js++;
				   }
				   if (startamount1==0)
				   {
					   System.out.println("Simulation "+i+": "+js+" LOSE");
					   loss++;
					   break;
				   }
				   else if (startamount1==winlimit)
				   {
					   System.out.println("Simulation "+i+": "+js+" WIN");
					   break;
				   }
			   }
			   
			   continue;
		   }
		   double proloss=(double)(loss*(1.0))/(double)((totalsim)*(1.0));
		   System.out.print("Losses: "+loss+" Simulations: "+totalsim+"\nRuin Rate from Simulation: "+proloss+" ");
		   double alpha=(1.0-winchance)/winchance;
		   double expruinrate=0;
		   if (winchance==0.5)
		   {
			   expruinrate=(1.0-cons/winlimit);
		   }
		   else
		   {
			   expruinrate=(Math.pow(alpha, startamount)-Math.pow(alpha, winlimit))/(1-Math.pow(alpha, winlimit));
		   }
		   System.out.println("Expected Ruin Rate: "+expruinrate);
	}

}
