package com.stanleeEitanLeo;
import java.util.*;
import java.io.*;

public class HundredDaysCode {

	
	public static void main(String[] args) {
		int next_day;
		Scanner input = new Scanner(System.in);
		System.out.println("Today is Tuesday input a number of days and lets see what day it will be then");
		int number_of_days = input.nextInt();
		next_day = number_of_days % 7;
		  if (next_day == 0) {
			 System.out.println("its a Tuesday");
		 }
		 else if (next_day == 1) {
			 System.out.println("its a wednesday");
		 }
		 else if (next_day == 2) {
			 System.out.println("its a thursday");
		 }
		 else if (next_day == 3) {
			 System.out.println("its a friday");
		 }
		 else if (next_day == 4) {
			 System.out.println("its a saturday");
		 }
		 else if (next_day == 5) {
			 System.out.println("its a sunday");
		 }
		 else if (next_day == 6) {
			 System.out.println("its a monday");
		 }
		  else {System.out.println("not doable");}
		
	}
	}



