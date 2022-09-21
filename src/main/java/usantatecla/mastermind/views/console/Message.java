package usantatecla.mastermind.views.console;

import usantatecla.utils.Console;

public enum Message {
	ATTEMPTS("#attempts attempt(s): "),
	SECRET("*"),
	SEPARATOR("-------------"),
	RESUME("Do you want to continue"),
	RESULT(" --> #blacks blacks and #whites whites"),
	PROPOSED_COMBINATION("Propose a combination: "),
	TITLE("----- MASTERMIND -----"),
	WINNER("You've won!!! ;-)"),
	LOOSER("You've lost!!! :-(");

	private String message;
	
	private Message(String message) {
		this.message = message;
	}

	public void write() {
		Console.instance().write(this.message);
	}

	public void writeln() {
		Console.instance().writeln(this.message);
	}

	void writeln(int attempts) {
		Console.instance().writeln(this.message.replaceAll("#attempts", "" + attempts));
	}

	void writeln(int blacks, int whites) {
		Console.instance().writeln(this.message.replaceFirst("#blacks", "" + blacks).replaceFirst("#whites", "" + whites));
	}

}
