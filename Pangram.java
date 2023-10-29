package programs;
import java.util.*;
public class Pangram {
	 public static void main(String args[])
	   { 
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    char [] a=new char[s.length()];
	    for(int i=0;i<s.length();i++)
	    {
	      a[i]=s.charAt(i);
	    }
	    for(int j=0;j<a.length;j++)
	    {
	      for(int k=j+1;k<a.length;k++)
	       {
	         if(a[j]==a[k])
	         {
	          a[k]='1';
	         }
	       }
	     }
	     int count=0;
	     for(int l=0;l<a.length;l++)
	     {
	       if('a'<=a[l]&&a[l]<='z')
	       {
	         count++;
	       }
	     }
	     if(count==26)
	     {
	       System.out.println("Pangram");
	     }
	     else{System.out.println("Not a pangram");}
	   }
}
