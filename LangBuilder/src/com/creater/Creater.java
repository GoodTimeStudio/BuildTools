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
		
		API.println("���ڻ�ȡ����·��,���Ժ�", Color.LightRed);
		SystemDos.Thread(2);
		API.println("�ѻ�ȡ·����", Color.LightRed);
		API.println(GetString.GetDesktop(), Color.LightYellow);
		API.println("",Color.Black);
		API.println("�뽫������ƷӢ�����Ƶ��ı��ļ����ڵ��������ϣ������ڽ������������ơ���Demo.txt�������Demo����", Color.LightRed);
		InPath = sc.nextLine()+".txt";
		API.println("�뽫������Ʒ���Ƶ��ı��ļ����ڵ��������ϣ������ڽ������������ơ���Demo.txt�������Demo����(��Ϊ����Ӣ�����ԣ����ļ�����һ���ļ�����һ�¼���)", Color.LightPurple);
		InPath_2 = sc.nextLine()+".txt";
		API.println("���ڶ�ȡ�������ļ��������ɹ����ļ������.pre��׺��", Color.LightRed);
		CreateFile.init();
		ReadAndWriteFile.init();
		API.println("�Ѿ�������ɣ������������",Color.LightGreen);
		
	}
}
