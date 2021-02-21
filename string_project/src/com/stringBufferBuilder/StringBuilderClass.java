package com.stringBufferBuilder;

public class StringBuilderClass {
	public void stringBuilder() {
		String strs[] = {"this", "is", "a", "String", "Builder", "." };
	      StringBuilder sb = new StringBuilder();
	      sb.append(strs[0]);
	      sb.append(" "+strs[1]);
	      sb.append(" "+strs[2]);
	      sb.append(" "+strs[3]);
	      sb.append(" "+strs[4]);
	      sb.append(" "+strs[5]);
	      System.out.println(sb.toString());
	}
}
