package com.util;

import com.api.IAPI;

public class API {
	
	public static void print(String str,int color){
		int ptr=IAPI.INSTANCE.GetStdHandle(-11);
		IAPI.INSTANCE.SetConsoleTextAttribute(ptr, color);
		System.out.print(str);
		IAPI.INSTANCE.SetConsoleTextAttribute(ptr, 0xf);
	}
	
	public static void println(String str,int color){
		int ptr=IAPI.INSTANCE.GetStdHandle(-11);
		IAPI.INSTANCE.SetConsoleTextAttribute(ptr, color);
		System.out.println(str);
		IAPI.INSTANCE.SetConsoleTextAttribute(ptr, 0xf);
	}
}
