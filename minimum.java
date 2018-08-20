/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int min=0;
		Scanner sc = new Scanner (System.in);
		
		int[] b =new int[10];
	for(int i=0;i<10;i++)
	{
		b[i]=sc.nextInt();
	}
		 int i=0;
		 int j=10-1;
		 while(i<=j)
		 {
		 	if (b[i] >= b[j])
			{
		 		min=b[j];
		 		i++;
		 	}
		 	else
		 	{
		 		min=b[i];
		 		j--;
		 	}
		 	
		}
		 	System.out.println(min);
		 
		   
	}
}
