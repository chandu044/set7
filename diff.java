/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b,c;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=a-b;
		if(c%2==0)
		{
			System.out.print("even");
		}
		else 
		{
			System.out.print("odd");
		}
	}
}
