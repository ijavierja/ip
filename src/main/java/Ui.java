package duke;

import java.util.Scanner;

/**
 * Ui deals with any interaction with the user.
 * This includes both user inputs and outputs to user.
 */
public class Ui{

	public void showWelcome() {
		String logo = "____________________________________________________________\n"
                /*+ " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n"*/
				+ " Hello I'm Duke\n"
				+ " What can I do for you?\n"
				+ "____________________________________________________________\n";
		System.out.println(logo);
	}

	public String readCommand() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}

	public  void showLoadingError() {
		System.out.println("No storage file found.");
	}

	public void showLine() {
		System.out.println("____________________________________________________________\n");
	}

	public void showError(String string) {
		System.out.println(string);
	}

	public void showOutput(String string){
		System.out.println(string);
	}
}