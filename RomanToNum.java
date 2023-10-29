package programs;
import java.util.*;
public class RomanToNum {
	  public static void main (String [] args)
	   {
	  Scanner sc=new Scanner(System.in);
	  String ro=sc.next();
	  String rom=ro.toUpperCase();
	  int num=0;
	  for(int i=0;i<rom.length();i++)
	  {
	    int a=getNum(rom.charAt(i));
	    if(a==-1)
	    {
	    System.out.println(rom.charAt(i)+" is not a Roman Number"); 
	    }
	    else
	    {
	       if(i+1<rom.length())
	       {
	        int b=getNum(rom.charAt(i+1)); 
	         if(a<b)
	         {
	          num=num+b-a;
	          i++;
	         }
	         else 
	          {num=num+a;}
	        }
	       else
	        {
	       num=num+a;  
	        }
	    }}
	    System.out.println("Roman number "+rom+" :- "+num);
	   }
	  public static int getNum(char c)
	  {
	  if(c=='I') 
	  {return 1;}
	  else if(c=='V')
	  {return 5;}
	  else if(c=='L')
	  {return 50;}
	  else if(c=='C')
	  {return 100;}
	  else if(c=='D')
	  {return 500;}
	  else if(c=='M')
	  {return 1000;}
	  else 
	  {return -1;}
 }
}
