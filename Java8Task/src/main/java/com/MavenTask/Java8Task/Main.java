package com.MavenTask.Java8Task;

import java.util.*;
public class Main
{
    public static void main(String []args)
    {
        Scanner ScannerClassObject=new Scanner(System.in);
        int n=ScannerClassObject.nextInt();
        ArrayList <Integer> list = new ArrayList<Integer>();
        for(int i =0; i<n; i++)
        {
        	list.add(ScannerClassObject.nextInt());
        }
        double avg=list.stream().mapToInt(i -> i).average().getAsDouble();
        System.out.println(avg);
        ScannerClassObject.close();
    }
}

