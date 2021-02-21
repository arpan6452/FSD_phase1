package com.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression_Test {
	public static void main(String[] args) {
		String pattern = "[0-9]+";
		String check = "My age is 26.Next year I will become 27";
		Pattern p = Pattern.compile(pattern);
		Matcher c = p.matcher(check);
		
		while (c.find())
	      	System.out.println( check.substring( c.start(), c.end() ) );		

	}
}
