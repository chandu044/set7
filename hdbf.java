/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i, a=0;
		String s1;
		Scanner s=new Scanner(System.in);
		s1=s.next();
		char[] ch=s1.toCharArray();
	//	System.out.print(s1);
             	for(i=0;i<s1.length();i++)
		{
			if(ch[i]=='0'||ch[i]=='1')
			{
				a++;
			}
		
		}
	//	System.out.println(a);
		if(a==0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.print("yes");
		}
	}
}
