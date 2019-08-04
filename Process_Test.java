package com.lang;

public class Process_Test 
{
	public static void main(String args[]) throws Exception
	{
		Runtime runtime = Runtime.getRuntime();
		Process processNotepad = runtime.exec("notepad.exe");
		Process processPaint = runtime.exec("mspaint.exe");
		Process processCalc = runtime.exec("calc.exe");
		
		long maxMemory = runtime.maxMemory();
		long totalMemory = runtime.totalMemory();
		
		//to force GC
		runtime.gc();
		
	}
}
