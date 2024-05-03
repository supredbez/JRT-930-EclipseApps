package com.sup.util;

import java.util.StringTokenizer;

public class StringUtil 
{
    public static int countWords(String text)
    {
    	StringTokenizer tokenizer = new StringTokenizer(text, " ");
    	int count = tokenizer.countTokens();
    	return count;
    }
}
