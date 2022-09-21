package usantatecla.mastermind.views.console;

import usantatecla.mastermind.models.SecretCombination;
import usantatecla.utils.Console;

public class SecretCombinationView {

	void writeln() {
		Console console = Console.instance();
		for (int i = 0; i < SecretCombination.getWidth(); i++) {
			Message.SECRET.write();
		}
		console.writeln();
	}

}