package studio2;

public class Pi {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		double pi1=0;
	      int i=2147483647;
	      int j=i;
	      int count=0;
	      while (i>=0)
	      {
	    	  double a=Math.random();
	    	  double b=Math.random();
	    	  double r=Math.sqrt(a*a+b*b);
	    	  if (r<=1.0)
	    		  count++;
	    	  i--;
	      }
	      pi1=(double)(count*(4.0))/(double)(j);
	      System.out.println(pi1);
	}

}
