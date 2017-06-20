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
		
		//English Name
		
		String pathname = GetString.GetDesktop()+"/"+GetString.GetInputName();
		File filename = new File(pathname);
		InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));
		BufferedReader br = new BufferedReader(reader);
		String line = "";
		line = br.readLine();
		
		//Chinese Name
		String pathname_2 = GetString.GetDesktop()+"/"+GetString.GetInputName2();
		File filename_2 = new File(pathname_2);
		InputStreamReader reader_2 = new InputStreamReader(new FileInputStream(filename_2));
		BufferedReader br_2 = new BufferedReader(reader_2);
		String line_2 = "";
		line_2 = br_2.readLine();
		
		String writepath = GetString.GetDesktop()+"/"+GetString.GetOutputName();
		File writename = new File(writepath);
		BufferedWriter out = new BufferedWriter(new FileWriter(writename));
		
		String type = null;
		String MOD_ID = null;
		
		while(true){
			Scanner sc = new Scanner(System.in);
			API.println("请选择你要创建的语言，中文为1，英文为2，输入数字即可。", Color.LightPurple);
			int num = sc.nextInt();
			if(num == 1){
				MOD_ID = "productionline.";
			}
			
			if(num == 2){
				MOD_ID ="";
			}
			
			break;
		}
		
		while(true){
			Scanner sc = new Scanner(System.in);
			API.println("请选择你要创建的物品类型，Item为1，Tile为2(Block选择此项），输入数字即可。", Color.LightRed);
			int num = sc.nextInt();
			if(num == 1){
				type = "item";
			}
			
			if(num == 2){
				type = "tile";
			}
			
			break;
		}
		
		
		while(line!= null && line_2!= null){
			out.write(type+"."+MOD_ID+line+".name"+"="+line_2+"\r\n");
			line=br.readLine();
			line_2=br_2.readLine();
			
		}
		
		out.flush();
		out.close();
	}
	
	
}
