package com.file;

import java.io.File;
import java.io.IOException;

import com.core.GetString;

public class CreateFile {

	private static String path = GetString.GetDesktop()+"/"+GetString.GetInputName()+".pre";
	private static File filename = new File(path);
	
	public static void init() throws IOException{

		if(!filename.exists()){
			filename.createNewFile();
		}
	}
}
