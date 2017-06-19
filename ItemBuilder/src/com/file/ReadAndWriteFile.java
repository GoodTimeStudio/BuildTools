package com.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.core.GetString;
import com.util.API;
import com.util.Color;

public class ReadAndWriteFile {

	public static void init() throws IOException{
		String pathname = GetString.GetDesktop()+"/"+GetString.GetInputName();
		File filename = new File(pathname);
		InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));
		BufferedReader br = new BufferedReader(reader);
		String line = "";
		line = br.readLine();
		
		String writepath = GetString.GetDesktop()+"/"+GetString.GetOutputName();
		File writename = new File(writepath);
		BufferedWriter out = new BufferedWriter(new FileWriter(writename));
		
		String type = null;
		
		while(true){
			Scanner sc = new Scanner(System.in);
			API.println("请选择你要创建的类型，Item为1，ItemStack为2，输入字母即可。", Color.LightRed);
			int num = sc.nextInt();
			if(num == 1){
				type = "Item";
			}
			
			if(num == 2){
				type = "ItemStack";
			}
			
			break;
		}
		
		while(line!= null){
			out.write("public static "+type+" "+line+";\r\n");
			line=br.readLine();
			
		}
		
		out.flush();
		out.close();
	}
	
	
}
