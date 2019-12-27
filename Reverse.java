import java.util.*;
import java.lang.*;
import java.util.Scanner;

class Reverse{
public static void main(String args[])
{
	String n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string: ");
	n = sc.nextLine();
	int i,l;
	char s;
	int count=0;
	int j=n.length();
	String m="";
	for(i=j-1;i>=0;i--)
	{
	m=m+n.charAt(i)2;
	}
	System.out.println("reverse of string is " +m);
	for(l=0;l<=n.length()-1;l++)
	{
	s=m.charAt(l);
	switch(s)
	{
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
	count=count+1;
	}
	}
	System.out.println("number of vowels= " +count);
}
}