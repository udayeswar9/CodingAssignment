package programs;
import java.util.*;
public class Shuffle {
 public static void main(String[] args) {
	 int [] arry={1,2,3,4,5,6,7};
	    int l=arry.length;
	    Random r=new Random();
	    int shuffle=r.nextInt(10)+1;
	    for(int i=1;i<=shuffle;i++)
	    {
	     int a=r.nextInt(l);
	     int b=r.nextInt(l);
	     int temp=arry[a];
	     arry[a]=arry[b];
	     arry[b]=temp;
	    }
	    for(int j=0;j<l;j++)
	    {
	     System.out.print(arry[j]+" ");
	    }
}
}
