package com.corejava.Programs;

public class ReverseStringUsingStringBufferClass {
	
	/***
         @Author:Azharuddin Khan
         @Description: This program is used to Reverse a input string using stringbuffer class reverse Method.
        ***/
	public StringBuffer reverseStringUsingStringBuffer(String text)
	{
		StringBuffer sbf=new StringBuffer(text);
		
		return sbf.reverse();
	}
	
	
	
	public static void main(String[] args) {
		
		ReverseStringUsingStringBufferClass obj=new ReverseStringUsingStringBufferClass();
		String text="AzharuddinKhan";
		StringBuffer result = obj.reverseStringUsingStringBuffer(text);
		System.out.println(result);
	}

}
