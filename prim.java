/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,c=0,i,a;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		
		for(i=1;i<=n;i++)
		{
			a=n%i;
			if(a==0)
			{
				c=c+1;
			}
		}
		if(c==2)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
	}
}
