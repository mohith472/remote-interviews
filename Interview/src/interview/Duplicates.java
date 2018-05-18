package interview;

import java.util.Scanner;

public class Duplicates {
public static void main(String[] args) {
	int k=0;
	String temp="";
	String t="";
	int p=0;
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	char[] a = new char[s.length()];
	for (int i = 0; i < a.length; i++) {
		a[i]=s.charAt(i);
	}
	for (int f = 0; f < a.length; f++)
	{
		int count=0;
		if(temp.contains(Character.toString(a[f]))==false)
		{
		for (int j = 0; j < s.length(); j++) 
		{
			if(a[f]==s.charAt(j))
			{
				count++;
				temp=temp+String.valueOf(a[f]);
				
			}
			if(count>1)
			{
				k=+(count-1);
				p=p+k;
			}
		}
		System.out.println(a[f]+" contains "+count+" of times in the given string");
		}
	}
	System.out.println(p+" no of duplicates are present in the given String");
}
}
