package com.shell;

import com.shell.Parser;
import com.shell.commands.*;
import com.shell.env.*;

import java.util.Scanner;

public class Shell {

	public static void main(String[] args) {
		EnvironmentVariable envs = new EnvironmentVariable();
		History history = new History(envs);
		
		Command[] cmd_list = {
				new Exit(envs),
				new Echo(envs),
				new Cat(envs),
				history
		};
		
		Scanner sc = new Scanner(System.in);
		
START:	while(true) {
			System.out.print("$> ");
			String input = sc.nextLine();

            if (input.compareTo("") == 0)
                continue START;
			
			Parser parser = new Parser(input);
			parser.parsing();
			
			history.add_history(parser.get_commandInput());

			// Searching CMD
			for (int i = 0; i < cmd_list.length; i++) {
				Command cmd = cmd_list[i];
				String cmdString = cmd.getClass().getSimpleName().toLowerCase();
				
				if (cmdString.equals(parser.get_command())) {
					
                    /*
                     *      TODO: Handle the exception from the command methods.
                     *          - If any exception, print error message with command.
                     *          - Do not exit this program, if any exception.
                     */
				}
			}
			
			if (parser.is_env() < 1)
				System.out.printf("Shell: command not found %s\n", parser.get_command());
			else
				envs.add_env(parser.get_arguments()[0], parser.get_arguments()[1]);
		}
	}
}
