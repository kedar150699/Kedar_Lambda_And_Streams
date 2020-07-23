package com.MavenTask.Java8Task;

import java.util.*;
@FunctionalInterface
interface MyInterface
{
String reverse(String n);
}
public class ThridProblem {
	public static void main( String[] args )
	{
		Scanner ScannerClassObject=new Scanner(System.in);
		int NoofTestcases=ScannerClassObject.nextInt();
		String a[]=new String[NoofTestcases];
		for(int i=0;i<NoofTestcases;i++)
		{
			a[i]=ScannerClassObject.next();
		}
		MyInterface ref = (str) -> {
			String result = "";
			for (int i = str.length()-1; i >= 0 ; i--)
				result += str.charAt(i);
			return result;
		};
		for(int i=0;i<NoofTestcases;i++)
		{
			String x=ref.reverse(a[i]);
			if(x.equalsIgnoreCase(a[i]))
				System.out.println(a[i]);
		}
		ScannerClassObject.close();
	}
}

