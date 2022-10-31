package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.StartController;

class StartView {

    void interact(StartController startController) {
        new SecretCombinationView().writeln();
        new GameView(startController).write();
        startController.next();
    }
}