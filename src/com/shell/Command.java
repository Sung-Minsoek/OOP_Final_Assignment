package com.shell;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;

import com.shell.env.*;

public class Command implements FileManager {
	protected EnvironmentVariable envs;
	
	public Command(EnvironmentVariable envs) {
		this.envs = envs;
	}
	
	protected String get_env(String arg) {
		return envs.get_value(arg.substring(1));
	}
	
	protected boolean is_env(String arg) {
		if (arg.isEmpty())
			return false;
		
		return arg.startsWith("$");
	}
	
	public void execute(String[] args) throws Exception {
		return;
	}

	@Override
	public void FileWrite(String value, String fileName, boolean isAppend) throws Exception {
		String filePath = home + "/" + fileName;		
	
        /*
         *      TODO: Implement method write to a file.
         *          - Write to the file with filename.
         *          - Use File, FileWriter class.
         *          - Any Exception, throw to caller method.
         */
	
	}

	@Override
	public String FileRead(String fileName) throws Exception {
		String filePath = home + "/" + fileName;
		String result = "";
		
	    /*
         *      TODO: Implement method read from a file.
         *          - Read from the file with filename.
         *          - Use File, FileWriter class.
         *          - Any Exception, throw to caller method.
         */
		
		return result;
	}
}
