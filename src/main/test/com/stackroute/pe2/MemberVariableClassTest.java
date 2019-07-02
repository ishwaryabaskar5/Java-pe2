package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberVariableClassTest {
	MemberVariableClass memberVariableClass;
	
	@Before
	public void setUp(){
		memberVariableClass = new MemberVariableClass();
	}
	
	@After
	public void tearDown(){
		memberVariableClass = null;
	}
	
	@Test
	public void givenInputShouldReturnMemberInfo(){
		MemberVariableClass memberVariableClass = new MemberVariableClass();
		String result = memberVariableClass.getMemberInfo("Harry Potter",30,3000.50);
		assertEquals("Test1 passed","Members Name: Harry Potter\nMembers Age: 30\nMembers Salary: 3000.5",result);
	}
	
	@Test
	public void givenInputShouldReturnMemberInfoWhenMemberNameIsEmpty(){
		MemberVariableClass memberVariableClass = new MemberVariableClass();
		String result = memberVariableClass.getMemberInfo("",26,3045.50);
		assertEquals("Test2 passed","Members Name: \nMembers Age: 26\nMembers Salary: 3045.5",result);
	}
	
	@Test
	public void givenInputShouldReturnMemberInfoWhenMemberNameIsNull(){
		MemberVariableClass memberVariableClass = new MemberVariableClass();
		String result = memberVariableClass.getMemberInfo(null,26,3045.50);
		assertEquals("Test3 passed","Member Name should not be null",result);
	}
	}
