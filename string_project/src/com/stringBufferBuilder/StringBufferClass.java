package com.stringBufferBuilder;

public class StringBufferClass {
	public void stringBuffer() {
		String strs[] = { "This", "is", "a", "String", "Buffer", "." };
		StringBuffer sb = new StringBuffer();
		sb.append(strs[0]);
		sb.append(" " + strs[1]);
		sb.append(" " + strs[2]);
		sb.append(" " + strs[3]);
		sb.append(" " + strs[4]);
		sb.append(" " + strs[5]);
		System.out.println(sb.toString());

	}
}
