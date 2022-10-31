package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.utils.YesNoDialog;

class ResumeView {

    boolean interact(ResumeController resumeController) {
        Message.RESUME.write();
        boolean newGame = new YesNoDialog().read();
        if (newGame) {
            resumeController.resume();
        } else {
            resumeController.next();
        }
        return newGame;
    }
}