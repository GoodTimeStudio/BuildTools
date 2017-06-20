package com.api;

import com.sun.jna.Native;
import com.sun.jna.win32.StdCallLibrary;

public interface IAPI extends StdCallLibrary{
	
	IAPI INSTANCE = (IAPI) Native.loadLibrary("kernel32", IAPI.class);
	
    int GetStdHandle(int stdHand);
	
    boolean SetConsoleTextAttribute(int hConsoleOutput,int textAtt);
    
}
