/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	double n;
		Scanner s=new Scanner(System.in);
		n=s.nextDouble();
		for(int i=0;i<=n/2;i++)
		{
			Double  k=Math.pow(2,i);
			if(k==n)
			{
				int l=(int)Math.pow(2,i+1);
				System.out.print(l);
			}
		}
	}
}
