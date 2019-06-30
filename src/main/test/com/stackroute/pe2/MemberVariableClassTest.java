package com.stackroute.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class MemberVariableClassTest {
	
	@Test
	public void displayMemberInfo(){
		MemberVariableClass memberVariableClass = new MemberVariableClass();
		String result = memberVariableClass.getMemberInfo("Harry Potter",30,3000.50);
		assertEquals("Test1 passed","Members Name: Harry Potter\nMembers Age: 30\nMembers Salary: 3000.5",result);
	}
}