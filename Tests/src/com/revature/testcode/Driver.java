package com.revature.testcode;

import com.revature.beans.*;
import com.revature.beans.InfoBean;
import java.util.Scanner;

public class Driver {
	 
	//wrapper class
		public static int Wrapper(int a, Integer b){
			return a+b;
		}
		
		//overloading wrapper method
		public static int Wrapper(int a, Integer b, int c){
			return a+b+c;
		}
		public static int Wrapper(Integer a, Integer b, Integer c){
			return a+b+c;
		}
		public static int Wrapper(int a, Integer b, int c, Integer d){
			return a+b+c+d;
		}
	
	public static void main(String[] args) {
		
		//call java bean InfoBean
		InfoBean i=new InfoBean();
		i.setName("Andres");
		i.setAge(36);
		
		System.out.println(i.getName()+" "+i.getAge());
		
		//Call java bean CarBean
		CarBean c=new CarBean();
		c.setBrand("Dodge");
		c.setCarMileage(78000);
		
		System.out.println(c.getBrand()+" "+c.getCarMileage());
		
		//Initializing scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert an integer number");
		int num= sc.nextInt();
		//System.out.println("Your number is "+num);
		
		//control statements
		//if statement
		if (num<=3) {
			//for loop
			for (int count=1;count<=num;count++) {
				System.out.println("Number <=3: "+num);
				
			}
			
			
		}
		//else if statement
		else if(num>3 && num<6){
			//for loop
			for (int count=1;count<=num;count++) {
				System.out.println("Number >3 and <6: "+num);
				
			}
			
		}
		
		System.out.println("Insert an integer number");
		int a = sc.nextInt();
		//System.out.println("Your number is "+a);
		
		//while loop
		while(a<=3) {
			a=a+1;
			System.out.println("I was inside the while loop");
		}
		
		//do while loop
		int b=1;
		do {
			b=b+1;
			System.out.println("I was inside the do while loop");
		}while(b>4 && b<10);
		
		//enhanced for
		int myArray[]= {1,2,3};
		for(int array:myArray) {
			System.out.println("Inside for each loop "+array);
		}
		
		//calling the wrapper class an inserting values with scanner
		Scanner scan = new Scanner(System.in);
		System.out.println("Insert an int number for the wrapper class");
		int myInt= scan.nextInt();
		System.out.println("Insert an integer number for the wrapper class");
		Integer myInteger= scan.nextInt();
		int overVarC=7;
		int overVarD=14;
		System.out.println("The results for wrapper class");
		System.out.println(Wrapper(myInt, myInteger));
		System.out.println(Wrapper(myInt, myInteger, overVarC));
		System.out.println(Wrapper(myInt, myInteger, overVarC));
		System.out.println(Wrapper(myInt, myInteger, overVarC, overVarD ));
		
		
	}
	
	

}
