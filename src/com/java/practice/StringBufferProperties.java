package com.java.practice;

import org.w3c.dom.TypeInfo;

public class StringBufferProperties {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Hello");
		String sas = "satyam";
		s.deleteCharAt(0);
		s.append("ssr");
		s.append(sas);
//		s.reverse();
		String sa = s.toString();
		System.out.println(s);
		System.out.println(sa.getClass().getSimpleName());
		
	}

}
