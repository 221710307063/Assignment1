package assignment1;
import java.util.*;
class Result {
	public void primeno(int n)
	{
		int m=n/2,flag=0;      
	    if(n==0||n==1)
	    {  
	    	flag=1;
	    }
	    else
	    {  
	    	for(int i=2;i<=m;i++)
	    	{      
	    		if(n%i==0)
	    		{            
	    			flag=1;      
	    			break;      
	    		}      
	    	}      
	    }
	    if(flag==0)  
    	{ 
    		System.out.println(n+" is prime number"); 
    	}
    	else
    	{
    		System.out.println(n+" is not prime number");
    	}
	}
}
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result r;
		r=new Result();
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number:");
		n=s.nextInt();
		r.primeno(n);
	}
}
