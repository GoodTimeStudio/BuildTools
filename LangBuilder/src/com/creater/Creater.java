package com.creater;

import java.io.IOException;
import java.util.Scanner;

import com.core.GetString;
import com.file.CreateFile;
import com.file.ReadAndWriteFile;
import com.util.API;
import com.util.Color;
import com.util.SystemDos;

public class Creater {

	public static API API;
	public static String InPath;
	public static String InPath_2;
	
	public static void main(String args[]) throws InterruptedException, IOException{
		
		Scanner sc = new Scanner(System.in);
		
		API.println("正在获取桌面路径,请稍后。", Color.LightRed);
		SystemDos.Thread(2);
		API.println("已获取路径。", Color.LightRed);
		API.println(GetString.GetDesktop(), Color.LightYellow);
		API.println("",Color.Black);
		API.println("请将你存放物品英文名称的文本文件放在电脑桌面上，并且在接下来键入名称。如Demo.txt，需键入Demo即可", Color.LightRed);
		InPath = sc.nextLine()+".txt";
		API.println("请将你存放物品名称的文本文件放在电脑桌面上，并且在接下来键入名称。如Demo.txt，需键入Demo即可(若为生成英文语言，此文件与上一步文件名称一致即可)", Color.LightPurple);
		InPath_2 = sc.nextLine()+".txt";
		API.println("正在读取并生成文件。导出成功的文件将添加.pre后缀。", Color.LightRed);
		CreateFile.init();
		ReadAndWriteFile.init();
		API.println("已经创建完成，程序完成任务！",Color.LightGreen);
		
	}
}
