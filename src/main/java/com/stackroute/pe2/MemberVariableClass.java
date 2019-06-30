package com.stackroute.pe2;

//Super class
class MemberClass {

//	instance variable
	String name;
	int age;
	double salary;
	
//	default constructor
	MemberClass(){}
	
//	Paramerized constructor
	MemberClass(String name, int age, double salary){
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	
}

//Sub class extends super class
public class MemberVariableClass extends MemberClass{
	
	public String getMemberInfo(String name, int age, double salary){
	
//		calls the super class constructor
		MemberClass memberClass=new MemberClass(name, age, salary);
		return "Members Name: "+memberClass.name+"\nMembers Age: "+memberClass.age+"\nMembers Salary: "+memberClass.salary;
	}
}
