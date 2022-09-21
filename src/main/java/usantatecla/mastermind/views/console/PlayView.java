package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.PlayController;
import usantatecla.mastermind.models.ProposedCombination;

class PlayView {

	boolean interact(PlayController playController) {
		
		ProposedCombination proposedCombination = new ProposedCombination();
		ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
		proposedCombinationView.read();
		
		playController.addProposedCombination(proposedCombination);
		
		Message.SEPARATOR.writeln();		
		Message.ATTEMPTS.writeln(playController.getAttempts());		
		new GameView(playController).write();

		new SecretCombinationView().writeln();

		if (playController.isWinner()) {
			Message.WINNER.writeln();
			return true;
		} else if (playController.isLooser()) {
			Message.LOOSER.writeln();
			return true;
		}
		return false;
	}

}
