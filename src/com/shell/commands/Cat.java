package com.shell.commands;

import java.io.IOException;

import com.shell.Command;
import com.shell.env.*;

public class Cat extends Command{
	public Cat(EnvironmentVariable envs) {
		super(envs);
	}

	@Override
	public void execute(String[] args) throws Exception {
		String result = "";
		String fileContent = "";
		
		for (int i = 1; i < args.length; i++) {
			if (args[i].startsWith("$"))
				args[i] = super.get_env(args[i]);
			
	        /*
             *      TODO: Concat the contents of files.
             *          - Use FileRead() in Command class to read a file.
             *          - With "FileNotFoundException", print error message and return;
             *          - If other exception, throw to caller method.
             */			
    	}
		
		System.out.println(result.trim());
		
		return;
	}
}
