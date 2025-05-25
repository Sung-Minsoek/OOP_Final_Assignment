package com.shell.commands;

import com.shell.Command;
import com.shell.env.*;

public class Echo extends Command{
	public Echo(EnvironmentVariable envs) {
		super(envs);
	}
	
	private void do_redirection(String output, String target, boolean isAppend) throws Exception {
        /*
         *      TODO: Implement redirection.
         *          - Write to target file.
         *          - Use FileWrite() method to write target file.
         *          - If any exception, throw to caller method.
         */
	}
	
	@Override
	public void execute(String[] args) throws Exception {
		String output = "";
		
		for (int i = 1; i < args.length; i++) {
			if (super.is_env(args[i]))
				args[i] = super.get_env(args[i]);
			
	        /*
             *      TODO: Implement redirection.
             *          - Use do_redirection() in Echo class to write a file.
             *          - If in ">", overwrite the file.
             *          - If in ">>",append the file.
             *          - When fail to redirection, print error message and do standard echo.
             *          - Success, return; 
             */
					
			output += (args[i] + " ");
		}
		System.out.println(output.trim());
	}
}
