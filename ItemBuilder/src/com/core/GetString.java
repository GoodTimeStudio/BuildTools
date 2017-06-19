package com.core;

import java.io.File;

import javax.swing.filechooser.FileSystemView;

import com.creater.Creater;

public class GetString {
	
	public static String GetDesktop(){
		FileSystemView fsv = FileSystemView.getFileSystemView();
		File com=fsv.getHomeDirectory();
		
		return com.getPath();
	}
	
	public static String GetInputName(){
		
		return Creater.InPath;
	}
	
	public static String GetOutputName(){
		
		return Creater.InPath+".pre";
	}
	
}
