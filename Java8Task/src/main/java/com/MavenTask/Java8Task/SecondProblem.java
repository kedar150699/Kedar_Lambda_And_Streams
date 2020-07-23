package com.MavenTask.Java8Task;

import java.util.stream.Collectors;
import java.util.*;
public class SecondProblem {
	

	    public static void main(String []args)
	    {
	        Scanner ScannerClassObject=new Scanner(System.in);
	        int NoofTestcases=ScannerClassObject.nextInt();
	    List<String> Names = new ArrayList<>();
	    for(int i=0;i<NoofTestcases;i++)
	    {
	     Names.add(ScannerClassObject.next());
	    }
	      List<String> newList = Names.stream()
	                    .filter(n1 -> n1.length() == 3).filter(n1->n1.startsWith("a"))
	                    .collect(Collectors.toList());
	                    System.out.println(newList);
	       ScannerClassObject.close();
	    }

}
