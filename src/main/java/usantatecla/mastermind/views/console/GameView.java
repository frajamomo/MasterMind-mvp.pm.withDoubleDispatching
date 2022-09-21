package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.UseCaseController;

class GameView {
    private UseCaseController controller;

    GameView(UseCaseController controller) {
        this.controller = controller;
    }

    void write() {
        Message.TITLE.writeln();
        for (int i = 0; i < this.controller.getAttempts(); i++) {
            new ProposedCombinationView(this.controller.getProposedCombination(i)).write();
            new ResultView(this.controller.getResult(i)).writeln();
        }
    }


    
}
